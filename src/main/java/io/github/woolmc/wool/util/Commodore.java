package io.github.woolmc.wool.util;

import org.bukkit.Material;
import org.bukkit.plugin.AuthorNagException;
import org.objectweb.asm.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * This file is imported from Commodore.
 *
 * @author md_5
 */
public class Commodore {

	private static final Set<String> EVIL = new HashSet<>(Arrays.asList("org/bukkit/World (III)I getBlockTypeIdAt", "org/bukkit/World (Lorg/bukkit/Location;)I getBlockTypeIdAt", "org/bukkit/block/Block ()I getTypeId", "org/bukkit/block/Block (I)Z setTypeId", "org/bukkit/block/Block (IZ)Z setTypeId", "org/bukkit/block/Block (IBZ)Z setTypeIdAndData", "org/bukkit/block/Block (B)V setData", "org/bukkit/block/Block (BZ)V setData", "org/bukkit/inventory/ItemStack ()I getTypeId", "org/bukkit/inventory/ItemStack (I)V setTypeId"));

	public static byte[] convert(byte[] b, final boolean modern) {
		ClassReader cr = new ClassReader(b);
		ClassWriter cw = new ClassWriter(cr, 0);

		cr.accept(new ClassVisitor(Opcodes.ASM7, cw) {
			@Override
			public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
				return new MethodVisitor(api, super.visitMethod(access, name, desc, signature, exceptions)) {

					@Override
					public void visitFieldInsn(int opcode, String owner, String name, String desc) {
						if (modern) {
							if (owner.equals("org/bukkit/Material")) {
								switch (name) {
									case "CACTUS_GREEN":
										name = "GREEN_DYE";
										break;
									case "DANDELION_YELLOW":
										name = "YELLOW_DYE";
										break;
									case "ROSE_RED":
										name = "RED_DYE";
										break;
									case "SIGN":
										name = "OAK_SIGN";
										break;
									case "WALL_SIGN":
										name = "OAK_WALL_SIGN";
										break;
								}
							}

							super.visitFieldInsn(opcode, owner, name, desc);
							return;
						}

						if (owner.equals("org/bukkit/Material")) {
							try {
								Material.valueOf("LEGACY_" + name);
							} catch (IllegalArgumentException ex) {
								throw new AuthorNagException("No legacy enum constant for " + name + ". Did you forget to define api-version: 1.13 in your plugin.yml?");
							}

							super.visitFieldInsn(opcode, owner, "LEGACY_" + name, desc);
							return;
						}

						if (owner.equals("org/bukkit/Art")) {
							switch (name) {
								case "BURNINGSKULL":
									super.visitFieldInsn(opcode, owner, "BURNING_SKULL", desc);
									return;
								case "DONKEYKONG":
									super.visitFieldInsn(opcode, owner, "DONKEY_KONG", desc);
									return;
							}
						}

						if (owner.equals("org/bukkit/DyeColor")) {
							switch (name) {
								case "SILVER":
									super.visitFieldInsn(opcode, owner, "LIGHT_GRAY", desc);
									return;
							}
						}

						if (owner.equals("org/bukkit/Particle")) {
							switch (name) {
								case "BLOCK_CRACK":
								case "BLOCK_DUST":
								case "FALLING_DUST":
									super.visitFieldInsn(opcode, owner, "LEGACY_" + name, desc);
									return;
							}
						}

						super.visitFieldInsn(opcode, owner, name, desc);
					}

					@Override
					public void visitMethodInsn(int opcode, String owner, String name, String desc, boolean itf) {
						// SPIGOT-4496
						if (owner.equals("org/bukkit/map/MapView") && name.equals("getId") && desc.equals("()S")) {
							// Should be same size on stack so just call other method
							super.visitMethodInsn(opcode, owner, name, "()I", itf);
							return;
						}
						// SPIGOT-4608
						if ((owner.equals("org/bukkit/Bukkit") || owner.equals("org/bukkit/Server")) && name.equals("getMap") && desc.equals("(S)Lorg/bukkit/map/MapView;")) {
							// Should be same size on stack so just call other method
							super.visitMethodInsn(opcode, owner, name, "(I)Lorg/bukkit/map/MapView;", itf);
							return;
						}

						if (modern) {
							if (owner.equals("org/bukkit/Material")) {
								switch (name) {
									case "values":
										super.visitMethodInsn(opcode, "org/bukkit/craftbukkit/util/CraftLegacy", "modern_" + name, desc, itf);
										return;
									case "ordinal":
										super.visitMethodInsn(Opcodes.INVOKESTATIC, "org/bukkit/craftbukkit/util/CraftLegacy", "modern_" + name, "(Lorg/bukkit/Material;)I", false);
										return;
								}
							}

							super.visitMethodInsn(opcode, owner, name, desc, itf);
							return;
						}

						if (owner.equals("org/bukkit/ChunkSnapshot") && name.equals("getBlockData") && desc.equals("(III)I")) {
							super.visitMethodInsn(opcode, owner, "getData", desc, itf);
							return;
						}

						Type retType = Type.getReturnType(desc);

						if (EVIL.contains(owner + " " + desc + " " + name) || (owner.startsWith("org/bukkit/block/") && (desc + " " + name).equals("()I getTypeId")) || (owner.startsWith("org/bukkit/block/") && (desc + " " + name).equals("(I)Z setTypeId")) || (owner.startsWith("org/bukkit/block/") && (desc + " " + name).equals("()Lorg/bukkit/Material; getType"))) {
							Type[] args = Type.getArgumentTypes(desc);
							Type[] newArgs = new Type[args.length + 1];
							newArgs[0] = Type.getObjectType(owner);
							System.arraycopy(args, 0, newArgs, 1, args.length);

							super.visitMethodInsn(Opcodes.INVOKESTATIC, "org/bukkit/craftbukkit/util/CraftEvil", name, Type.getMethodDescriptor(retType, newArgs), false);
							return;
						}

						if (owner.equals("org/bukkit/DyeColor")) {
							if (name.equals("valueOf") && desc.equals("(Ljava/lang/String;)Lorg/bukkit/DyeColor;")) {
								super.visitMethodInsn(opcode, owner, "legacyValueOf", desc, itf);
								return;
							}
						}

						if (owner.equals("org/bukkit/Material")) {
							if (name.equals("getMaterial") && desc.equals("(I)Lorg/bukkit/Material;")) {
								super.visitMethodInsn(opcode, "org/bukkit/craftbukkit/util/CraftEvil", name, desc, itf);
								return;
							}

							switch (name) {
								case "values":
								case "valueOf":
								case "getMaterial":
								case "matchMaterial":
									super.visitMethodInsn(opcode, "org/bukkit/craftbukkit/util/CraftLegacy", name, desc, itf);
									return;
								case "ordinal":
									super.visitMethodInsn(Opcodes.INVOKESTATIC, "org/bukkit/craftbukkit/util/CraftLegacy", "ordinal", "(Lorg/bukkit/Material;)I", false);
									return;
								case "name":
								case "toString":
									super.visitMethodInsn(Opcodes.INVOKESTATIC, "org/bukkit/craftbukkit/util/CraftLegacy", name, "(Lorg/bukkit/Material;)Ljava/lang/String;", false);
									return;
							}
						}

						if (retType.getSort() == Type.OBJECT && retType.getInternalName().equals("org/bukkit/Material") && owner.startsWith("org/bukkit")) {
							super.visitMethodInsn(opcode, owner, name, desc, itf);
							super.visitMethodInsn(Opcodes.INVOKESTATIC, "org/bukkit/craftbukkit/util/CraftLegacy", "toLegacy", "(Lorg/bukkit/Material;)Lorg/bukkit/Material;", false);
							return;
						}

						super.visitMethodInsn(opcode, owner, name, desc, itf);
					}
				};
			}
		}, 0);

		return cw.toByteArray();
	}
}
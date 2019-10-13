package io.github.woolmc.wool.command.sender;

import java.util.Set;

import org.bukkit.Server;
import org.bukkit.block.Block;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.plugin.Plugin;

import net.minecraft.block.entity.CommandBlockBlockEntity;

public class WoolCommandBlockSender implements BlockCommandSender {
	
	private CommandBlockBlockEntity handle;

	public WoolCommandBlockSender(CommandBlockBlockEntity block) {
		this.handle = block;
	}
	
	@Override
	public String getName() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Server getServer() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void sendMessage(String arg0) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public void sendMessage(String[] arg0) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public PermissionAttachment addAttachment(Plugin arg0) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public PermissionAttachment addAttachment(Plugin arg0, int arg1) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public PermissionAttachment addAttachment(Plugin arg0, String arg1, boolean arg2) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public PermissionAttachment addAttachment(Plugin arg0, String arg1, boolean arg2, int arg3) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Set<PermissionAttachmentInfo> getEffectivePermissions() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean hasPermission(String arg0) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean hasPermission(Permission arg0) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean isPermissionSet(String arg0) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean isPermissionSet(Permission arg0) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void recalculatePermissions() {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public void removeAttachment(PermissionAttachment arg0) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public boolean isOp() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setOp(boolean arg0) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public Block getBlock() {
		throw new UnsupportedOperationException("Unsupported");
	}
	
	public CommandBlockBlockEntity getHandle() {
		return this.handle;
	}

}

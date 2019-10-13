package io.github.woolmc.wool.config;

import io.github.woolmc.wool.functions.TBiConsumer;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Optional;

public interface SimpleConfig {
	default void load(File file) {
		YamlConfiguration yml;
		if (file.exists()) {
			yml = new YamlConfiguration();
			try {
				yml.load(file);
			} catch (IOException | InvalidConfigurationException e) {
				e.printStackTrace();
			}
		} else
			yml = save(file);

		// add config loading here
		forFields(this, (f, s) -> f.set(this, yml.get(s)));
	}

	default YamlConfiguration save(File file) {
		try {
			File parent = file.getParentFile();
			if (parent != null && !parent.exists()) parent.mkdirs();

			if (!file.exists()) file.createNewFile();
			YamlConfiguration yml = new YamlConfiguration();

			// add config saving here
			forFields(this, (f, s) -> yml.set(s, f.get(this)));

			// save file
			yml.save(file);
			return yml;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	static void forFields(SimpleConfig instance, TBiConsumer<Field, String> iterator) { // iterates through the fields and gets their yaml paths
		Field[] getFields = instance.getClass().getFields();
		for (Field field : getFields)
			Optional.ofNullable(field.getAnnotation(YamlPath.class))
				.ifPresent(y -> iterator.accept(field, y.path()));
	}
}

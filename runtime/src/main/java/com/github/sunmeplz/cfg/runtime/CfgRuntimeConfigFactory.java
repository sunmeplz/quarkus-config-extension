package com.github.sunmeplz.cfg.runtime;

import io.smallrye.config.ConfigSourceContext;
import io.smallrye.config.ConfigSourceFactory;
import io.smallrye.config.PropertiesConfigSource;
import org.eclipse.microprofile.config.spi.ConfigSource;

import java.util.Collections;
import java.util.Map;

public class CfgRuntimeConfigFactory implements ConfigSourceFactory.ConfigurableConfigSourceFactory<CfgRuntimeTimeConfig> {

    @Override
    public Iterable<ConfigSource> getConfigSources(ConfigSourceContext context, CfgRuntimeTimeConfig config) {
        return Collections.singletonList(new PropertiesConfigSource(Map.of(
            "another.property", "Hello %s".formatted(config.name().orElse("Unnamed"))
        ),"cfg-source",100));
    }
}

package com.github.sunmeplz.cfg.runtime;

import io.smallrye.config.ConfigSourceContext;
import io.smallrye.config.ConfigSourceFactory;
import io.smallrye.config.PropertiesConfigSource;
import io.smallrye.config.SmallRyeConfig;
import io.smallrye.config.SmallRyeConfigBuilder;
import org.eclipse.microprofile.config.spi.ConfigSource;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CfgConfigFactory implements ConfigSourceFactory.ConfigurableConfigSourceFactory<CfgBuildTimeConfig> {

    @Override
    public Iterable<ConfigSource> getConfigSources(ConfigSourceContext context, CfgBuildTimeConfig config) {
        return Collections.singletonList(new PropertiesConfigSource(Map.of(
            "another.property", "Hello %s".formatted(config.name().orElse("Unnamed"))
        ),"cfg-source",100));
    }
}

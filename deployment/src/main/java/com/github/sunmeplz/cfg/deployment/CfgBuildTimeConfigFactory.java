package com.github.sunmeplz.cfg.deployment;

import io.smallrye.config.ConfigSourceContext;
import io.smallrye.config.ConfigSourceFactory;
import io.smallrye.config.PropertiesConfigSource;
import org.eclipse.microprofile.config.spi.ConfigSource;

import java.util.Collections;
import java.util.Map;

public class CfgBuildTimeConfigFactory implements ConfigSourceFactory.ConfigurableConfigSourceFactory<CfgBuildTimeConfig> {

    @Override
    public Iterable<ConfigSource> getConfigSources(ConfigSourceContext context, CfgBuildTimeConfig config) {
        return Collections.singletonList(new PropertiesConfigSource(Map.of(
            "build.another.property", "Hello %s".formatted(config.name().orElse("Unnamed"))
        ),"cfg-build-source",100));
    }
}

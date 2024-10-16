package com.github.sunmeplz.cfg.deployment;

import com.github.sunmeplz.cfg.runtime.CfgBuildAndRuntimeFixedConfig;
import io.smallrye.config.ConfigSourceContext;
import io.smallrye.config.ConfigSourceFactory;
import io.smallrye.config.PropertiesConfigSource;
import org.eclipse.microprofile.config.spi.ConfigSource;

import java.util.Collections;
import java.util.Map;

public class CfgBuildAndRunTimeConfigFactory implements ConfigSourceFactory.ConfigurableConfigSourceFactory<CfgBuildAndRuntimeFixedConfig> {

    @Override
    public Iterable<ConfigSource> getConfigSources(ConfigSourceContext context, CfgBuildAndRuntimeFixedConfig config) {
        return Collections.singletonList(new PropertiesConfigSource(Map.of(
            "build-and-runtime.another.property", "Hello %s".formatted(config.name().orElse("Unnamed"))
        ),"cfg-build-and-runtime-source",100));
    }
}

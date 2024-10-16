package com.github.sunmeplz.cfg.runtime;

import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;
import io.smallrye.config.ConfigMapping;

import java.util.Optional;

@ConfigMapping(prefix = "com.github.sunmeplz")
@ConfigRoot(phase = ConfigPhase.BUILD_TIME)
public interface CfgBuildTimeConfig {
    /**
     * Simple name
     * @return name
     */
    Optional<String> name();
}

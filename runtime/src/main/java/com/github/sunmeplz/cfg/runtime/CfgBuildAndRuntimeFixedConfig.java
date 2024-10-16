package com.github.sunmeplz.cfg.runtime;

import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;
import io.smallrye.config.ConfigMapping;

import java.util.Optional;

@ConfigMapping(prefix = "com.github.sunmeplz.build-and-runtime")
@ConfigRoot(phase = ConfigPhase.BUILD_AND_RUN_TIME_FIXED)
public interface CfgBuildAndRuntimeFixedConfig {
    /**
     * Simple name
     * @return name
     */
    Optional<String> name();
}

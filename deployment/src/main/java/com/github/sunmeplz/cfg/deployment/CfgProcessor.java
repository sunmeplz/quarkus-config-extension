package com.github.sunmeplz.cfg.deployment;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;
import io.quarkus.deployment.builditem.nativeimage.ServiceProviderBuildItem;
import io.smallrye.config.ConfigSourceFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class CfgProcessor {
    private static final String FEATURE = "cfg";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }
}

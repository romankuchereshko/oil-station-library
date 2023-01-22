package com.simulation.library.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.simulation.library.domain.Value;
import com.simulation.library.domain.properties.FrameConfigurations;
import lombok.Data;

@Data
@Configuration
@ConfigurationProperties("frame")
public class FrameConfigurationsImpl implements FrameConfigurations {

    private Value voltage;

    private Value current;

    private Value speed;

    private Value frequency;

    private Value temperature;

    private Value pressure;

    private Value liquidFlowRate;

}

package com.simulation.library.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@EnableConfigurationProperties
@PropertySource({ "classpath:lib-application.properties" })
public class LibAutoConfiguration {

}

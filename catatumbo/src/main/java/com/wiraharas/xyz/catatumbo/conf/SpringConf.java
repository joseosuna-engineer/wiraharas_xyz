/*
 * Copyright 2016 Wiraharas AG.
 */
package com.wiraharas.xyz.catatumbo.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 *
 * @author Jose Osuna (Trebol-IT)
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.wiraharas.xyz.catatumbo.controller")
public class SpringConf {

}

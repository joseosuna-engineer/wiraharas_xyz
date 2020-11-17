package com.wiraharas.xyz.catatumbo.conf;

import com.wiraharas.xyz.catatumbo.entity.Cuenta;
import com.wiraharas.xyz.catatumbo.entity.Titular;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.wiraharas.xyz.catatumbo.controller",
    "com.wiraharas.xyz.catatumbo.service.impl"})
public class SpringConfig {

    @Bean
    @Scope("prototype")
    public Cuenta cuenta() {
        return new Cuenta();
    }

    @Bean
    @Scope("prototype")
    public Titular titular() {
        return new Titular();
    }

}

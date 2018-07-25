/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.borrow.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 
 * @author jinlilong
 * @version $Id: CorsConfiguration.java, v 0.1 2018年7月23日 上午10:52:36 jinlilong Exp $
 */
@Configuration
public class CorsConfiguration {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowCredentials(true).allowedMethods("POST");
            }
        };
    }

}

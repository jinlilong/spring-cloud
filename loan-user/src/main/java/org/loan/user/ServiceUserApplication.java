/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * @author jinlilong
 * @version $Id: ServiceUserApplication.java, v 0.1 2018年7月19日 上午10:28:25 jinlilong Exp $
 */
@EnableEurekaClient
@SpringBootApplication
@MapperScan("org.loan.core.dao")
@ComponentScan(basePackages = { "org.loan.core.service", "org.loan.user", "org.loan.core.config" })
public class ServiceUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceUserApplication.class, args);
    }
}

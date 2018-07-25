/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 
 * @author jinlilong
 * @version $Id: ServiceZuulApplication.java, v 0.1 2018年7月19日 上午10:28:25 jinlilong Exp $
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ServiceZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceZuulApplication.class, args);
    }
}

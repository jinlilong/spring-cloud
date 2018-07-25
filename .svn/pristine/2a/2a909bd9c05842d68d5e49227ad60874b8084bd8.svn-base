/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.borrow;

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
@ComponentScan(basePackages = { "org.loan.core.service", "org.loan.borrow",
                                "org.loan.core.config" })
public class ServiceBorrowApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceBorrowApplication.class, args);
    }
}

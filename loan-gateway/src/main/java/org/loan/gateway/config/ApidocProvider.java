/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.gateway.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @author jinlilong
 * @version $Id: ApidocProvider.java, v 0.1 2018年7月23日 上午9:49:03 jinlilong Exp $
 */
@Component
@Primary
@EnableAutoConfiguration
@EnableSwagger2
@Profile({ "dev", "test" })
public class ApidocProvider implements SwaggerResourcesProvider {

    @Override
    public List get() {
        List resources = new ArrayList<>();
        resources.add(swaggerResource("user", "/apidoc/user/v2/api-docs", "2.0"));
        resources.add(swaggerResource("borrow", "/apidoc/borrow/v2/api-docs", "2.0"));
        return resources;
    }

    private SwaggerResource swaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }

}

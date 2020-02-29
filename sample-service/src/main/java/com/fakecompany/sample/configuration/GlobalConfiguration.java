package com.fakecompany.sample.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

@Configuration
public class GlobalConfiguration {

    @Value("${prop.swagger.title}")
    private String title;

    @Value("${prop.swagger.description}")
    private String description;

    @Value("${prop.swagger.version}")
    private String version;

    @Value("${prop.swagger.base-package}")
    private String basePackage;

    public GlobalConfiguration() {
    }

    @Bean
    public Docket api() {
        Contact contact = new Contact("API Support", "support@example.com", "http://example.com/support");

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfo(title, description, version, "http://www.appsdeveloperblof.com/service.html", contact,
                        "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList<>()))
                .select()
                .apis(RequestHandlerSelectors.basePackage(basePackage))
                .paths(PathSelectors.any())
                .build();
    }
}
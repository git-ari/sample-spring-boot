package com.fakecompany.sample.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Data
@Configuration
@ConfigurationProperties("fakecompany")
public class ErrorProperties {

    private Map<String, ErrorProp> errors;

    @Data
    public static class ErrorProp {

        private Integer code;
        private Integer httpStatus;
        private String message;
        private String exceptionName;
    }
}


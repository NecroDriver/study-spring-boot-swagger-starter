package com.xin.swagger;

import com.xin.swagger.configuration.EnableStudySwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableStudySwagger2
public class StudySpringBootSwaggerStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudySpringBootSwaggerStarterApplication.class, args);
    }

}

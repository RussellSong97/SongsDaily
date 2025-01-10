package com.jooree.web.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "포트폴리오 사용자 API",
                description = "PORTFOLIO FOR JOOREE API Documentation",
                version ="v1",
                contact = @Contact(
                        name = "Song Joo Ree",
                        email = "joorees@naver.com"
                ),
                license = @License(
                        name = "Java 17, SpringBoot 3.2.5 , Thymeleaf"
                )
        )
)
public class SwaggerConfig {
    // http://localhost:8081/swagger-ui/index.html
}

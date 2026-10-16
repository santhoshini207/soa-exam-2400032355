package com.klef.soa.exam.configuration;




import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

 @Bean
  public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Museum Membership API")
                        .version("1.0")
                        .description("REST API Documentation for Museum Membership Service")
                        .contact(new Contact()
                                .name("Museum Membership Team")
                                .email("museum@gmail.com")));
    }
}



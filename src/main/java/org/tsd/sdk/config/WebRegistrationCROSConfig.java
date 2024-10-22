package org.tsd.sdk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebRegistrationCROSConfig {
	
	@Bean
    WebMvcConfigurer corsConfigurer(){
        return new WebMvcConfigurer() { 
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("*").allowedOrigins("*").allowedHeaders("*")
                        .allowedMethods("*").allowedMethods("*").allowCredentials(true);
            }
        };
    }
	
}
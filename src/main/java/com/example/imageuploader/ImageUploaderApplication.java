package com.example.imageuploader;

import com.example.imageuploader.services.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
@ConfigurationPropertiesScan
@SpringBootApplication
public class ImageUploaderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImageUploaderApplication.class, args);
    }
    @Bean
    CommandLineRunner init(StorageService storageService) {
        return (args) -> {
            storageService.deleteAll();
            storageService.init();
        };
    }
}

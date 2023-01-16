package com.example.demo.pdf;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class PdfConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            PdfRepository repository) {
        return args -> {
            Pdf usingDocker = new Pdf(
                    0,
                    0000000000,
                    "usingDocker",
                    "O'reily",
                    LocalDate.now()
            );
            repository.saveAll(
                    List.of(usingDocker)
            );
        };
    }
}

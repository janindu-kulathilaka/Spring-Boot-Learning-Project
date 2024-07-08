package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student janindu = new Student(
                    "janindu",
                    "janidusandeepa2020@gmail.com",
                    LocalDate.of(2001, 11, 12),
                    22
            );
            Student chathumi = new Student(
                    "chathumi",
                    "chathumi.c.f27@gmail.com",
                    LocalDate.of(2001, 11, 27),
                    22
            );


            repository.saveAll(
                    List.of(janindu, chathumi)
            );
        };
    }
}

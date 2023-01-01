package com.adebayo.test.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student ade = new Student(
                    "Adebayo",
                    "adebayo@gmail.com",
                    LocalDate.of(1992, Month.FEBRUARY, 10)
            );

            Student pelumi = new Student(
                    "Pelumi",
                    "pelumi@gmail.com",
                    LocalDate.of(1994, Month.AUGUST, 27)
            );
            studentRepository.saveAll(
                    List.of(ade, pelumi)
            );
        };
    }
}

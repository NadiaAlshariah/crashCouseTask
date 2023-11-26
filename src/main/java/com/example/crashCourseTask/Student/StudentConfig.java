package com.example.crashCourseTask.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student nadia = new Student(
                    "Nadia",
                    "nadiakalid@gmail.com",
                    LocalDate.of(2003, Month.JULY,9)
            );

            Student ahmad = new Student(
                    "ahmad",
                    "ahmad@gmail.com",
                    LocalDate.of(1955, Month.JULY,9)
            );
            studentRepository.saveAll(
                    List.of(nadia, ahmad)
            );
        };
    }
}

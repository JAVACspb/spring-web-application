package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {


    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student roman = new Student(
                    "Roma",
                    21,
                    LocalDate.of(2001, Month.AUGUST, 19),
                    "romagrek01@gmail.com"
                    );
            Student kirya = new Student(
                    "kirya",
                    21,
                    LocalDate.of(2002, Month.MAY, 28),
                    "kiryaShpek@gmail.com"
            );
            repository.saveAll(List.of(roman,kirya));
        };
    }
}

package com.example.student;

import com.example.student.dp.Singleton;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    StudentApplication studentApplication;
    @Bean
    public Singleton newSingleton() {
        return new Singleton();
    }
    Config(StudentApplication studentApplication){
        this.studentApplication = studentApplication;
    }
}

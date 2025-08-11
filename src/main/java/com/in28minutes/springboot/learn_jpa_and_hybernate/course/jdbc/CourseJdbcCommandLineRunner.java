package com.in28minutes.springboot.learn_jpa_and_hybernate.course.jdbc;

import com.in28minutes.springboot.learn_jpa_and_hybernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "AWS", "Khushi"));
        repository.insert(new Course(12, "React", "Tanu"));
        repository.insert(new Course(13, "Spring", "Kartick"));
        repository.delete(12);
    }
}

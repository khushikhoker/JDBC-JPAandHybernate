package com.in28minutes.springboot.learn_jpa_and_hybernate.course;

import com.in28minutes.springboot.learn_jpa_and_hybernate.course.jdbc.CourseJdbcRepository;
import com.in28minutes.springboot.learn_jpa_and_hybernate.course.jpa.CourseJpaRepository;
import com.in28minutes.springboot.learn_jpa_and_hybernate.course.springJpa.CourseSpringDataJPARepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJPARepositroy repository;

    @Override
    public void run(String... args) throws Exception {
//        repository.insert(new Course(1, "AWS", "Khushi"));
//        repository.insert(new Course(12, "React", "Tanu"));
//        repository.insert(new Course(13, "Spring", "Kartick"));
//        repository.delete(12);
//        System.out.println(repository.findById(13L));

          repository.save(new Course(1, "AWS", "Khushi"));
        repository.save(new Course(12, "React", "Tanu"));
        repository.save(new Course(13, "Spring", "Kartick"));
        repository.deleteById(12L);
        System.out.println(repository.findById(13L));
    }
}

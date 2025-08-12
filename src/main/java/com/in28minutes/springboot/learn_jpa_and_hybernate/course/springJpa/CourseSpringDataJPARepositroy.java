package com.in28minutes.springboot.learn_jpa_and_hybernate.course.springJpa;

import com.in28minutes.springboot.learn_jpa_and_hybernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJPARepositroy extends JpaRepository<Course, Long>{

    List<Course> findByAuthor(String author);

    List<Course> findByName(String Name);
}

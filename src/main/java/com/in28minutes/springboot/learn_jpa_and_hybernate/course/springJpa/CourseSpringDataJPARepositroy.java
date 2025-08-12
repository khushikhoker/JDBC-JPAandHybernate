package com.in28minutes.springboot.learn_jpa_and_hybernate.course.springJpa;

import com.in28minutes.springboot.learn_jpa_and_hybernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJPARepositroy extends JpaRepository<Course, Long>{
}

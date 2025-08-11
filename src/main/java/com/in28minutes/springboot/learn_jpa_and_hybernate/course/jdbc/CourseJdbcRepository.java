package com.in28minutes.springboot.learn_jpa_and_hybernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    @Autowired
    private JdbcTemplate springJdbcTemplate;

    public static String INSERT_QUERY =
            """ 
                    insert into course (id, name, author)
                    values(1,'Learn AWS','in28Minutes');
                    """;
    public void insert() {
        springJdbcTemplate.update(INSERT_QUERY);
    }
}

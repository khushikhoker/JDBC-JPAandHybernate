package com.in28minutes.springboot.learn_jpa_and_hybernate.course.jdbc;

import com.in28minutes.springboot.learn_jpa_and_hybernate.course.Course;
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
                    values(?,?,?);
                    """;

    public static String DELETE_QUERY =
            """
                    delete from course where (id = ?);
                    """;

    public void insert(Course course) {
        springJdbcTemplate.update(INSERT_QUERY,course.getId(), course.getName(), course.getAuthor());
    }

    public void delete(long id) {
        springJdbcTemplate.update(DELETE_QUERY, id);
    }
}

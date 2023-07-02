package com.spring.jdbc.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Config {
    @Bean
    public DriverManagerDataSource getDriverManagerDataSource() {
        String url = "jdbc:mysql://Localhost:3306/spring_jdbc_demo";
        String username = "root";
        String password = "HMmy124#";
        return new DriverManagerDataSource(url, username, password);
    }

    @Bean(name = {"jdbcTemplate"})
    public JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(getDriverManagerDataSource());
    }

    @Bean(name = {"studentDao"})
    public StudentDao getStudentDaoImplementation() {
        return new StudentDaoImplementation(getJdbcTemplate());
    }
}

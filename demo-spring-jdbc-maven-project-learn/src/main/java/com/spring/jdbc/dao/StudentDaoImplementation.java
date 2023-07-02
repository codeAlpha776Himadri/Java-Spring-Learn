package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entity.Student;

public class StudentDaoImplementation implements StudentDao {

    private JdbcTemplate jdbcTemplate = null;

    public StudentDaoImplementation(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }

    public StudentDaoImplementation() {
        super();
    }

    @Override
    public int insert(Student student) {
        String query = "insert into student(id,name,city) values(?,?,?);";
        return this.jdbcTemplate == null ? 0
                : this.jdbcTemplate.update(query, student.getId(), student.getName().toLowerCase(),
                        student.getCity().toLowerCase());

    }

    @Override
    public int update(Student student) {
        int oldStudentId = student.getId();
        String query = "update student set name=? , city=? where id=?";
        return this.jdbcTemplate.update(query, student.getName(), student.getCity(), oldStudentId);
    }

    @Override
    public int delete(int studentId) {
        String query = "delete from student where id=?";
        return this.jdbcTemplate.update(query, studentId);
    }

    @Override
    public Student getStudentById(int studentId) {
        String query = "select * from student where id=?";
        return this.jdbcTemplate.queryForObject(query, new RowMapper<Student>() {
            // annonymous class
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student student = new Student();
                student.setId(rs.getInt(1));
                student.setName(rs.getString(2));
                student.setCity(rs.getString(3));
                return student;
            }
        }, studentId);
    }

    @Override
    public List<Student> getAllStudents() {
        String query = "select * from student";
        return this.jdbcTemplate.query(query, new RowMapper<Student>() {
            // annonymous class
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student student = new Student();
                student.setId(rs.getInt(1));
                student.setName(rs.getString(2));
                student.setCity(rs.getString(3));
                return student;
            }
        });
    }

    @Override
    public List<Student> getStudentsByName(String name) {
        String query = "select * from student where name=?";

        // this is more convenient than annonymous class as no redundancy
        RowMapper<Student> rowMapper = new RowMapperImplementation();
        return this.jdbcTemplate.query(query, rowMapper, name);
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}

package com.mtie.cruddemo.dao;

import com.mtie.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findAll();

    void update(Student theStudent);

    void delete(Student theStudent);
    void deleteById(Integer id);
}
package com.mtie.springunimappingdemo.dao;

import com.mtie.springunimappingdemo.entity.Instructor;


public interface AppDAO {
    //void save(Instructor theInstructor);
    //Instructor findInstructorById(Integer id);
    void delete(AppDAO theInstructor);
    void deleteById(Integer id);
}



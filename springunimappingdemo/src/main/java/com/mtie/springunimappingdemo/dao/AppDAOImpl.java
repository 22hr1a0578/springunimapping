package com.mtie.springunimappingdemo.dao;

import com.mtie.springunimappingdemo.entity.Instructor;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.mtie.springunimappingdemo.entity.Instructor;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class AppDAOImpl implements AppDAO{
    @Autowired
    private EntityManager entityManager;
     public AppDAOImpl(EntityManager entityManager){
         this.entityManager=entityManager;
     }
   /* @Override
         @Transactional
        public void save(Instructor theInstructor){
             entityManager.persist(theInstructor);
         }

    @Override
    public Instructor findInstructorById(Integer theId)
     {
         return entityManager.find(Instructor.class,theId);
     }*/
    @Override
    public void delete(AppDAO theInstructor){
        entityManager.remove(theInstructor);
    }
    @Transactional
    public void deleteById(Integer id){
         Instructor theInstructor=entityManager.find(Instructor.class,id);

            if(theInstructor!=null){
                entityManager.remove(theInstructor);
            }

    }
}

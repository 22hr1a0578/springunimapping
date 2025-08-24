package com.mtie.springunimappingdemo;

import com.mtie.springunimappingdemo.dao.AppDAO;
import com.mtie.springunimappingdemo.entity.Instructor;
import com.mtie.springunimappingdemo.entity.InstructorDetail;
import org.aspectj.apache.bcel.generic.Instruction;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringunimappingdemoApplication {


	public static void main(String[] args) {

		SpringApplication.run(SpringunimappingdemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDAO appDAO) {
		return runner -> {
			System.out.println("hello");
			//createInstructor(appDAO);
			//findInstructorById(appDAO);
			deleteInstructorById(appDAO,6);
		};
	}

	/*public void createInstructor(AppDAO appDAO) {
		Instructor tempInstructor = new Instructor("ram", "j", "ram@gameil.com");


		InstructorDetail tInstructorDetail = new InstructorDetail("sri","h");
		tempInstructor.setInstructorDetail(tInstructorDetail);
		System.out.println("Saving instructor" + tempInstructor);
		appDAO.save(tempInstructor);
	}*/
	/*public void findInstructorById(AppDAO appDAO){
	int theId=7;
	    System.out.println("id of student"+theId);

		Instructor myInstructor=appDAO.findInstructorById(theId);
		System.out.println("fetching the instruction id"+myInstructor);
		System.out.println("fetching details"+myInstructor.getInstructorDetail());
	}*/
	public void deleteInstructorById(AppDAO appDAO,Integer id){
		appDAO.deleteById(id);
		System.out.println("Deleted"+id);
	}
}

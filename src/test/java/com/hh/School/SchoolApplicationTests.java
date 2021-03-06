package com.hh.School;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import com.hh.School.entity.Student;
import com.hh.School.entity.TheClass;

@SpringBootTest
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
class SchoolApplicationTests {

	@Test
	void contextLoads() {
	}
	
	
	@Test
	void Student_class_example() {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("student_issued");
		EntityManager eManager = emFactory.createEntityManager();
		eManager.getTransaction().begin();
		//插入数据
		TheClass class1 = new TheClass();
		class1.setClassid(101);
		class1.setClassname("101班");
		
		TheClass class2 = new TheClass();
		class2.setClassid(102);
		class2.setClassname("102班");
		
		eManager.persist(class1);
		eManager.persist(class2);
		
		Student st1 = new Student();
		st1.setSno(1001);
		st1.setSname("Hehuan");
		st1.setTheClass(class1);
		
		Student st2 = new Student();
		st2.setSno(1002);
		st2.setSname("zhaeye");
		st2.setTheClass(class1);
		
		Student st3 = new Student();
		st3.setSno(1003);
		st3.setSname("Marry");
		st3.setTheClass(class2);
		eManager.persist(st1);
		eManager.persist(st2);
		eManager.persist(st3);
		
		eManager.getTransaction().commit();
		eManager.close();
		emFactory.close();
	}

}

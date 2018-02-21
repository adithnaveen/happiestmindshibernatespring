package com.hm.db;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DBClient {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext3.xml");
		
		IStudentDAO dao = (IStudentDAO) context.getBean("studentDao");
		
		
		// insert 
		Student student1 = new Student(); 
		student1.setStudentId(101);
		student1.setStudentName("Harry");
		student1.setAge(23);

		Student student2 = new Student(); 
		student2.setStudentId(102);
		student2.setStudentName("Scott");
		student2.setAge(33);

		Student student3 = new Student(); 
		student3.setStudentId(103);
		student3.setStudentName("Peter");
		student3.setAge(43);

//		dao.create(student1);
//		dao.create(student2);
//		dao.create(student3);

//		Student student = dao.getStudent(101);
//		System.out.println(student.getStudentId() +", " + student.getStudentName() +", " + 
//				student.getAge());
		
		// dao.delete(101);
		dao.update(102, 88);
		List<Student> list = dao.listStudent();
		

		for(Student temp : list){
			System.out.println(temp.getStudentId() +", " + 
					temp.getStudentName()+", " + temp.getAge());
		}
		
		
		System.out.println("Client Executed... ");
		
	}
}









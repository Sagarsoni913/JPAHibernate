package com.tns.client;

import com.tns.entities.Student;
import com.tns.service.StudentService;
import com.tns.service.StudentServiceImpl;


public class Client 
{

	public static void main(String[] args) 
	{
		
		// CRUD operation calling activity
		Student student = new Student();
		
		StudentService service = new StudentServiceImpl();
		
		// Create Operation
		
		//student.setStudentid(16);
	    //student.setName("Raj");
	    //service.addStudent(student);
		
		
	// Retrieve Operation
		service.findStudentById(4);
		System.out.println("ID is: "+student.getStudentid());
		System.out.println("Name is: "+student.getName());
		
		
		
	/*//Update Operation
		student  =service.findStudentById(1);
		student.setName("Avantika ");
		service.updateStudent(student);
		
		
		*/
		/*service.findStudentById(2);
		System.out.println("ID is: "+student.getStudentid());
		System.out.println("Name is: "+student.getName());*/
		
		
		// Delete Operation
//		student=service.findStudentById(2);
//		service.removeStudent(student);
//		System.out.println("Row removed");
		
		
	}

}
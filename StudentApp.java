package skp.All.Controller;

import java.util.List;

import skp.All.entity.Student;
import skp.All.repository.StudentRepository;

public class StudentApp {
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("naven");
		student.setRoolnumber("126");
		student.setCollege("a1 global college");
		student.setBranch("civil");
		student.setClgAddress("markapuram");
		student.setAddress("Halhari");
		student.setPhoneNumber("345678900");
		
		
		StudentRepository studentRepository = new StudentRepository();  //insert
		studentRepository.saveStudent(student);
		
//		StudentRepository studentRepository = new StudentRepository();  //find id
//		System.out.println( studentRepository.findById(1L));
		
		
//		StudentRepository studentRepository = new StudentRepository();
//		 List findAll=studentRepository.findAll();
//		 findAll.forEach(System.out::println);
		
//		StudentRepository studentRepository = new StudentRepository();
//		 List findAll=studentRepository.findNames();
//		 findAll.forEach(System.out::println);
		
		
//		 StudentRepository studentRepository = new StudentRepository(); // delete the data in  table 
//		 studentRepository.delete(1L);
		
//		StudentRepository studentRepository = new StudentRepository(); // update the  data in table 
//		Student s = new Student (1L,"naven","126","a1 global","civil","markapuram","harhari","345678");
//		studentRepository.updateStudent(s);
		
	
		
		
		
	}


}

package edu.umsl.midterm;

import java.util.ArrayList;
import java.util.List;

public class StudentApp {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		
		StudentApp studentApp = new StudentApp();
		
		list.add(studentApp.createStudent("Hannah", "Robertson", 1234, "11/21/96"));
		list.add(studentApp.createStudent("Bob", "Doe", 3282, "10/22/91"));
		list.add(studentApp.createStudent("Alana", "Roberts", 1234, "1/2/04"));
		list.add(studentApp.createStudent("Andrea", "Thomas", 9424, "8/9/94"));
		list.add(studentApp.createStudent("Bill", "Simpson", 9278, "4/5/89"));
		
		studentApp.printStudents(list);
	}
	
	public Student createStudent(String firstName, String lastName, int ssn, String dateOfBirth) {
		return new Student(firstName, lastName, ssn, dateOfBirth);

	}
	
	public void printStudents(List<Student> list) {

		for (Student s : list) {

			System.out.println("First Name: " + s.getFirstName());
			System.out.println("Last Name: " + s.getLastName());
			System.out.println("SSN: " + s.getSsn());
			System.out.println("DOB: " + s.getDateOfBirth());
		}

}
	
}

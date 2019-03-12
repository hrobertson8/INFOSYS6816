package edu.umsl.midterm;

public class Student {
	
	String firstName;
	String lastName;
	int ssn;
	String dateOfBirth;
	
	public Student(String firstName, String lastName, int ssn, String dateOfBirth){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.dateOfBirth = dateOfBirth;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}

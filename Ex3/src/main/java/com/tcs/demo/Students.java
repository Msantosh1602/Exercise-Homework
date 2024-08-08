package com.tcs.demo;

public class Students {
	
	private String name;
	private String fatherName;
	private String dob;
	private char gender;
	
	public Students() {
		
	}
	
	public Students(String name, String fatherName, String dob, char gender) {
		super();
		this.name = name;
		this.fatherName = fatherName;
		this.dob = dob;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

}

package com.example.springbootswagger2.model;

import io.swagger.annotations.ApiModelProperty;

public class Student {
	@ApiModelProperty(notes = "Name of the Student",name="name",required=true,value="test name")
	private String name;
	@ApiModelProperty(notes = "Surname of the Student",name="surname",required=true,value="test class")
	private String surname;	

	public Student(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
		
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", surname=" + surname + "]";
	}

}

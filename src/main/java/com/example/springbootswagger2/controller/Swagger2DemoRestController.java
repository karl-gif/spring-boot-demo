package com.example.springbootswagger2.controller;


import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootswagger2.model.Student;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "Swagger2DemoRestController", description = "REST Apis related to Student Entity!!!!")
@RestController
public class Swagger2DemoRestController {

	private static int count = 1;

	private static final Logger LOGGER = LogManager.getLogger("Swagger2DemoRestController");

	List<Student> students = new ArrayList<Student>();
	{
		students.add(new Student("Sam", "Smith"));
		students.add(new Student("Peter", "Andrews"));
		students.add(new Student("Shane", "Peters"));
		students.add(new Student("Alex", "Jackson"));
	}

	@ApiOperation(value = "Get list of Students in the System ", response = Iterable.class, tags = "getStudents")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Suceess|OK"),
			@ApiResponse(code = 401, message = "not authorized!"), 
			@ApiResponse(code = 403, message = "forbidden!!!"),
			@ApiResponse(code = 404, message = "not found!!!") })

	@RequestMapping(value = "/getStudents", method = RequestMethod.GET)
	public List<Student> getStudents() throws InterruptedException {

		Thread.sleep(10000);

		LOGGER.info(String.format("Info logged - Count %s", count));

		count++;
		
		return students;
	}

}

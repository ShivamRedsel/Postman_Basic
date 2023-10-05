package com.telusko.postman;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@RequestMapping("dates")
	public String name() {
		return "today date is is "+ new java.util.Date();
	}

	@GetMapping(value="search/{roll}")
	public String Search(@PathVariable int roll) {
		if(roll==111) {
			return "student name is Shivam";
		}
		else {
			
			return "No name";
		}
	}
	@RequestMapping(value="find")
	public String find(@RequestParam(value="roll") int roll) {
		if(roll==111) {
			return "student name is Shivam by [using ReqPar]";
		}
		
		else {
			
			return "No name [using ReqPar]";
		}
		
	}
	
	@PostMapping(value="findByName")
	public String findbyname(@RequestBody String name) {
		if(name.equalsIgnoreCase("Shivam")){
			return "student  name is Shivam by [using PostMap]";
		}
		else if(name.equalsIgnoreCase("Shivam Rai")) {
			return "student  name is Shivam by [using PostMap]";
		}
		else {
			
			return "No name in db";
		}
		
	}
}

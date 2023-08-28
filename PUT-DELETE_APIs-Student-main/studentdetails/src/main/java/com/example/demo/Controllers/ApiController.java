package com.example.demo.Controllers;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.StudentService;
import com.example.demo.Models.Student;
@RestController
public class ApiController {
	
	@Autowired
	StudentService studentservice;
	
	
	@GetMapping("/student")
	public List<Student> showStudentDetails(){
		
		return studentservice.getStudentDetails();
	}
}

package com.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.entity.StudentData;
import com.ems.exception.AppExceptions;
import com.ems.service.StudentService;

@RestController
@RequestMapping("student/")
public class StudentController {

	@Autowired
	private StudentService service;
	
	@PostMapping("save")
	public ResponseEntity<String> saveStudent(@RequestBody StudentData data)
	{
		try {
			return new ResponseEntity<String>(service.addStudent(data),HttpStatus.CREATED);
		}
		catch (Exception e) {
			throw new AppExceptions(e.getMessage());
		}
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable Integer id){
		try {
		return new ResponseEntity<String>(service.deleteStudent(id),HttpStatus.OK);
		}
		catch (Exception e) {
			throw new AppExceptions(e.getMessage());
		}
	}
	
	@GetMapping("{id}")
	public ResponseEntity<StudentData> getStudent(@PathVariable Integer id){
		try {
		return new ResponseEntity<StudentData>(service.getStudent(id),HttpStatus.OK);
		}
		catch (Exception e) {
			throw new AppExceptions(e.getMessage());
		}
	}
	
	@GetMapping("students")
	public ResponseEntity<List<StudentData>> allStudents()
	{
		try {
		return new ResponseEntity<List<StudentData>>(service.getAllStudents(), HttpStatus.OK);
		}
		catch (Exception e) {
			throw new AppExceptions(e.getMessage());
		}
	}
	
}

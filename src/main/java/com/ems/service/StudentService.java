package com.ems.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ems.entity.StudentData;

@Service
public class StudentService {

	private List<StudentData> students=StudentData.getstudents();
	
	public List<StudentData> getAllStudents()
	{
		
		return students;
	}
	
	public String addStudent(StudentData student)
	{
		students.add(student);
		return "Student with id:"+student.getStudentIid()+" is saved";
	}
	
	public String deleteStudent(Integer id)
	{
		int i=0;
		for(StudentData student:students)
		{
			
			if(student.getStudentIid().equals(id))
			{
				students.remove(i);
			}
			i++;
		}
		
		return "Student with id:"+id+" is removed";
	}
	
	public StudentData getStudent(Integer id)
	{
		for(StudentData student:students)
		{
			if(student.getStudentIid().equals(id))
			{
				return student;
			}
		}
		
		
		return null;
	}
}

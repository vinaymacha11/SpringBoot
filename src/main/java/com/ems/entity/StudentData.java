package com.ems.entity;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentData {

	private Integer studentIid;
	private String name;
	private String emailId;
	private Long phoneNumber;
	
	
	public static List<StudentData> getstudents()
	{
		List<StudentData> students=new ArrayList<>();
		
		students.add(new StudentData(1, "VINAY MACHA", "vinay@gmail", 702808l));
		students.add(new StudentData(2, "SOUMYA MACHA", "soumya@gmail", 702808l));
		
		return students;
	}
}

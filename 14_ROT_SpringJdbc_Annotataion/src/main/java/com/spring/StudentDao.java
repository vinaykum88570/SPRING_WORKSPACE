package com.spring;

import java.util.List;
import java.util.Map;

public interface StudentDao {

	public void insertStudent(Student stud);
	public void updateStudent(int studentNum, String studentName, int studentMarks);
	public void deleteStudent(int studentNum);
	public List<Map<String,Object>> listStudents();
	
}

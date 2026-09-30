package com.spring;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoiImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;
		
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insertStudent(Student stud) {
		String SQL = "insert into student values(?,?,?)";
		jdbcTemplate.update(SQL,stud.getStudentNum(),stud.getStudentName(),stud.getStudentMarks());
		System.out.println("Student Inserted");
	}

	@Override
	public void updateStudent(int studentNum, String studentName, int studentMarks) {
		String SQL = "update student set studentMarks = ? where studentNum = ?";
		jdbcTemplate.update(SQL,studentMarks,studentNum);
		System.out.println("Student Updated");
	}

	@Override
	public void deleteStudent(int studentNum) {
		String SQL = "delete from student 	where studentNum = ?";
		jdbcTemplate.update(SQL,studentNum);
		System.out.println("Student Deleted");
		
	}

	@Override
	public List<Map<String, Object>> listStudents() {
		String SQL = "select * from student";
		return jdbcTemplate.queryForList(SQL);
	}

	
}

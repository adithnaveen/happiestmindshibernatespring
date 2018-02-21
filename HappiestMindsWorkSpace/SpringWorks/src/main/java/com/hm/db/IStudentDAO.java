package com.hm.db;

import java.util.List;

import javax.sql.DataSource;

public interface IStudentDAO {
	public void create(Student student);

	public Student getStudent(int studentId);

	public List<Student> listStudent();

	public void delete(int studentId);

	public void update(int studentId, int age);
	
	// to set datasource 
	public void setDataSource(DataSource dataSource);
}

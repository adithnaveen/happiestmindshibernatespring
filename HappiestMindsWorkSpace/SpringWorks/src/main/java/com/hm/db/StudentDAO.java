package com.hm.db;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDAO implements IStudentDAO{
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	
	public void create(Student student) {
		String sql="insert into student(studentid, studentname, age) values( ?,?,?)";
		jdbcTemplateObject.update(sql, student.getStudentId(), 
			student.getStudentName(), student.getAge());
	}
	
	public Student getStudent(int studentId) {
		String sql="select * from student where studentid=?";
		
		
//		Student student = jdbcTemplateObject.queryForObject(sql, new Object[]{studentId}, 
//					new BeanPropertyRowMapper<Student>(Student.class));
		
		Student student = jdbcTemplateObject.queryForObject(sql, new Object[]{studentId},
					new StudentMapper());
		
		
		return student; 
	}
	public List<Student> listStudent() {
		String sql="select * from student";
		List<Student> list = jdbcTemplateObject.query(sql, new StudentMapper());
		return list; 
	}
	public void delete(int studentId) {
		String sql="delete from student where studentid=?";
		jdbcTemplateObject.update(sql, studentId);
	}
	public void update(int studentId, int age) {
		String sql="update student set age=? where studentid=?";
		jdbcTemplateObject.update(sql, age, studentId);
	}
	public void setDataSource(DataSource dataSource) {
			// the datasource information will be given via 
		// applicationcontext.xml 
			this.dataSource = dataSource; 
			jdbcTemplateObject = new JdbcTemplate(dataSource);
	} 
	
}

package com.demo.dao;

import java.util.List;

import com.demo.bean.Student;

public interface StudentDao {

	void addStudent(Student s);

	List<Student> display();

	List<Student> findByName(String name);

}

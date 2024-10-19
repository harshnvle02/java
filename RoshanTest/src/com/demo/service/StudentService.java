package com.demo.service;

import java.util.List;

import com.demo.bean.Student;

public interface StudentService {

	void addNewStudent(int ch);

	List<Student> display();

	List<Student> findByName(String name);

}

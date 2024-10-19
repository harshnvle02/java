package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.bean.Student;

public class StudentDaoImpl implements StudentDao{

	List<Student> list = new ArrayList<>();
	
	public void addStudent(Student s) {
		
		list.add(s);
	}

	@Override
	public List<Student> display() {

		return list;
	}

	@Override
	public List<Student> findByName(String name) {
		
		List<Student> newlist = new ArrayList<>();
		for(Student s : list)
		{
			if(s != null)
			{
				if(s.getName().equals(name))
				{
					newlist.add(s);
				}
			}
			else {
				return null;
			}
		}
		return newlist;
	}
}

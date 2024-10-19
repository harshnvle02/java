package com.demo.bean;

public class Student {

	private int id;
	private String name;
	private String subject;
	private int m1;
	
	
	public Student() {
		super();
	}

	public Student(int id, String name, String subject, int m1) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.m1 = m1;
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getM1() {
		return m1;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", subject=" + subject + ", m1=" + m1;
	}
	
}

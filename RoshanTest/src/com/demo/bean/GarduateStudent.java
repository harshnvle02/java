package com.demo.bean;

public class GarduateStudent extends Student {
	
	private String specSub;
	private int marks;
	
	public GarduateStudent() {
		super();
	}

	public GarduateStudent(int id, String name, String sub, int m1, String specSub, int marks) {
		super(id,name,sub,m1);
		this.specSub = specSub;
		this.marks = marks;
	}

	public String getSecSub() {
		return specSub;
	}

	public void setSecSub(String specSub) {
		this.specSub = specSub;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		
		return super.toString()+"GarduateStudent [secSub=" + specSub + ", marks=" + marks + "]";
	}
	
	
	

}

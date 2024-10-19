package com.demo.bean;

public class MasterStudent extends Student {
	
	private String thesis_sub;
	private int thesis_maarks;
	
	public MasterStudent() {
		super();
	}

	public MasterStudent( int id, String name, String sub, int m1, String thesis_sub, int thesis_maarks) {
		super(id,name,sub,m1);
		this.thesis_sub = thesis_sub;
		this.thesis_maarks = thesis_maarks;
	}

	public String getThesis_sub() {
		return thesis_sub;
	}

	public void setThesis_sub(String thesis_sub) {
		this.thesis_sub = thesis_sub;
	}

	public int getThesis_maarks() {
		return thesis_maarks;
	}

	public void setThesis_maarks(int thesis_maarks) {
		this.thesis_maarks = thesis_maarks;
	}

	@Override
	public String toString() {
		
		return super.toString()+"]"+"MasterStudent [thesis_sub=" + thesis_sub + ", thesis_maarks=" + thesis_maarks + "]";
	}
	
	

}

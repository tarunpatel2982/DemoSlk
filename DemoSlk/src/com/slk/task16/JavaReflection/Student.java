package com.slk.task16.JavaReflection;

public class Student {

	
	private int studId;
	private String studName;
	 private boolean deceased;
	 
	 public Student(String studName, int studId) {
	      this.studName = studName;
	      this.studId = studId;
	      deceased = false;
	   }
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	
	 public boolean isDeceased() {
	      return deceased;
	   }
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + "]";
	}
	
	
}

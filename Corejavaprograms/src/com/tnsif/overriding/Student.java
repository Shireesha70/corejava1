package com.tnsif.overriding;

public class Student extends Teacher {
	@Override
	void teaching() {
		System.out.println("maths");
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.teaching();
	}

}

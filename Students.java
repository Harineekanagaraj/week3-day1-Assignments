package org.overloading;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println(id);
	}
	public void getStudentInfo( String name) {
		System.out.println(name);
	}
	public void getStudentInfo( char email) {
		System.out.println(email);
	}
		public void getStudentInfo( double mobilenumber) {
			System.out.println(mobilenumber);
	}
	public static void main(String[] args) {
	Students std=new Students();
	std.getStudentInfo(1716);
	std.getStudentInfo("hari");
	std.getStudentInfo("abc@gmail.com");
	std.getStudentInfo(987654321);
	
	}
}

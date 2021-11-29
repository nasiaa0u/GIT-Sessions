package com.nasir.model;

public class Employee {
	static String fname;
	static String lname;
public static  String getfname() {
	return fname;	
}
	public void setfname(String fname) {
		Employee.fname= fname;
	}
	public static  String getlname() {
		return lname;	
}
	public void setlname(String lname) {
		Employee.lname= lname;
}
	public Employee (String fname,String lname) {
	Employee.fname= fname;
	Employee.lname= lname;
		
}
}


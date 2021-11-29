package com.nasir.services;

import java.util.Random;
import java.util.Scanner;

import com.nasir.model.Employee;

public class Connect {

String email,password;
String range = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789!@$%^&*";
Scanner sc=new Scanner(System.in);
Employee employee=new Employee(sc.nextLine(),sc.nextLine());
public char[] generatedPassord() {
	Random random = new Random();
	char[] password= new char[8];
	for(int i=0;i<8;i++) {
		password[i]= range.charAt(random.nextInt(range.length()));
	}
	return password;
}
public String generatedEmailAddress() {
	return email;
}
public void ShowCredential() {
}
}
	




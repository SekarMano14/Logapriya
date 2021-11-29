package org.exception.copy;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Handling3 {
	public static void empid() throws EmployeeMisMactchException {
		Scanner s = new Scanner(System.in);
		String id = s.next();
		if (id.startsWith("13")) {
			System.out.println("My Employee");
		} 
		else {
			System.out.println("Not My Employee");
			throw new EmployeeMisMactchException();
		}}
	public static void main(String[] args) throws EmployeeMisMactchException {
		try {
			empid();
		} 
		catch (EmployeeMisMactchException e) {
			System.out.println("Handles");
//			print exception
			e.printStackTrace();
			
//			get message
			String msg = e.getMessage();
			System.err.println(msg);
		} 
		finally {
			System.out.println("Finally");
		}	}}
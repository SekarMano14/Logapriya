package org.exception.copy;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Handling2 {
//throw and throws
	public static void empid() throws IOException, SQLException {
		Scanner s = new Scanner(System.in);

		String id = s.next();
		if (id.startsWith("13")) {
			System.out.println("My Employee");
		} else {
			System.out.println("Not My Employee");
			throw new IOException();
		}

	}

	public static void main(String[] args) throws IOException, SQLException {
		try {
			empid();
		} 
		catch (IOException e) {
			System.out.println("Handles");
		}
		
		finally {
			System.out.println("Finally");
		}
	}

}

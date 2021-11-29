package org.exception;

import java.io.File;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Handling {
	public static void main(String[] args) {

		// ArithmeticException
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
			System.out.println(4 / 0);
		} catch (ArithmeticException e) {
			System.out.println("dont / 0");
		}
		System.out.println(5);
		System.out.println(6);

		System.out.println();
		// using super class exception
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
			System.out.println(4 / 0);
		} catch (Exception e) {
			System.out.println("All Handles");
			// print ur unknown exception
			e.printStackTrace();
		}
		System.out.println(5);
		System.out.println(6);

		System.out.println();
		// try with multiple catches
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
			// System.out.println(4 / 0);
			String s = "hai";
			System.out.println(s.charAt(5));
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic");
		} catch (NullPointerException e) {
			System.out.println("Null");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String");
		}
		System.out.println(5);
		System.out.println(6);
		
		System.out.println();
		// try with multiple catches--try will accept only one exception
				System.out.println(1);
				System.out.println(2);
				System.out.println(3);
				try {
					 System.out.println(4 / 0);
					String s = "hai";
					System.out.println(s.charAt(1));
				} 
				catch (ArithmeticException e) {
					System.out.println("Arithmetic");
				} 
				catch (NullPointerException e) {
					System.out.println("Null");
				} 
				catch (StringIndexOutOfBoundsException e) {
					System.out.println("String");
				}
				System.out.println(5);
				System.out.println(6);
				
				System.out.println();
				// try with multiple catches---with exception hierachy
				System.out.println(1);
				System.out.println(2);
				System.out.println(3);
				try {
					String s = "hai";
					System.out.println(s.charAt(5));
				} 
				catch (ArithmeticException e) {
					System.out.println("Arithmetic");
				} 
				catch (NullPointerException e) {
					System.out.println("Null");
				} 
				catch (Exception e) {
					System.out.println("String");
				}
				System.out.println(5);
				System.out.println(6);

	}

}

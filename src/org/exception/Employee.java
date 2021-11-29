package org.exception;

import java.io.File;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
////		 IOException
//		File f= new File("");
//		f.createNewFile();
//		
//		NumberFormatException
		String num = "10000Ruppes";
		System.out.println(num+500);
		int pp = Integer.parseInt(num);
		System.out.println(pp+500);

		// InputMismatchException
		Scanner ss = new Scanner(System.in);
		int nm = ss.nextInt();
		System.out.println(nm);

		// IndexOutOfBoundsException
		List<Integer> li = new LinkedList<Integer>();
		li.add(10);
		li.add(20);
		System.out.println(li.get(2));

		// ArrayIndexOutOfBoundsException
		int b[] = { 10, 20, 30 };
		System.out.println(b[3]);

		// StringIndexOutOfBoundsException
		String a = "hai";
		System.out.println(a.charAt(3));

		// NullPointerException
		String s = null;
		System.out.println(s.length());
		// ArithmeticException
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4 / 0);
		System.out.println(5);
		System.out.println(6);
	}

}

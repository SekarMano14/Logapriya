package org.constructor;

public class Company extends Employee {
	public Company() {
		super(10);
		System.out.println("child Deafult Constructor");
	}

	public Company(int a) {
		super();
		System.out.println("child Int para Constructor");
	}
	
	public static void main(String[] args) {
		new Company();
		new Company(10);
	}

}

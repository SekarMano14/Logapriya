package org.polymorphisim;

public class Employee {

	private void empDetails(String name) {
		System.out.println("Employee name is " + name);

	}

	// datatype
	private void empDetails(int id) {
		System.out.println("Employee id is " + id);

	}

	// datatype order
	private void empDetails(String name, float salary) { // SF--->FS
		System.out.println("Employee name is " + name+"\t"+"Employee salary is " + salary);
		System.out.println("Employee name is " + name+"\n"+"Employee salary is " + salary);

	}

	// datatype count
	private void empDetails(String name, float salary, long phno) { // SFL--->FSL,LFS
		System.out.println("Employee name is " + name);
		System.out.println("Employee salary is " + salary);
		System.out.println("Employee phno is " + phno);

	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.empDetails("Manoj");
		e.empDetails(120);
		e.empDetails("Kumar",2500.23f);
		e.empDetails("Raj",2500.23f,8015727454l);
	}
}

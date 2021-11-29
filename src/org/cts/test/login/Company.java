package org.cts.test.login;  //Hierachile
//Access
//specifiers Child    keyword  Parent
//            sub              Super class
 //           Derived           BaseClass
public class Company extends EmployeeDetails{
	
	public void companyId() {
		System.out.println("Company id is 5678");
	}
	public void companyName() {
		System.out.println("Company name is CTS");
	}
	
	public static void main(String[] args) {
		Company c= new Company();
		c.companyId();
		c.companyName();
		c.employeeId();
		c.employeeName();
		
		
	}

}

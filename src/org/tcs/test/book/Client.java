package org.tcs.test.book; //Hierachile


//import packagename.Classname;
//import org.cts.test.login.EmployeeDetails;
//import org.cts.test.login.Company;

import org.cts.test.login.*;//import all class in this package
public class Client extends EmployeeDetails {

	private void clientId() {
		System.out.println("Client id is 6789");
	}

	private void clientName() {
		System.out.println("Client name is Flipkart");
	}
	
	public static void main(String[] args) {
		Client c= new Client();
		c.clientId();
		c.clientName();
	    c.employeeId();
	    c.employeeName();
	
		
		
	}
	
}

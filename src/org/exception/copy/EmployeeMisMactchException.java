package org.exception.copy;
public class EmployeeMisMactchException  extends Exception {
//userdefine Exception	
	@Override
	public String getMessage() {
		return "Employee id is mismatching";}}
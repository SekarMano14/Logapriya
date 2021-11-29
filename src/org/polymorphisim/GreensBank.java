package org.polymorphisim;

public class GreensBank extends RBIBank {
	
	@Override
	public void savings() {
		System.out.println("Savings 8%");
	}
	
	public void current() {
		System.out.println("Current 6%");
	}
	private void deposit() {
		System.out.println("Deposit 6%");
	}
	
	public static void main(String[] args) {
		GreensBank g= new GreensBank();
		g.savings();
		g.current();
		g.deposit();
		g.fixed();
		System.out.println();
		RBIBank r= new RBIBank();
		r.savings();
		r.current();
		r.fixed();
		System.out.println();
		RBIBank s= new GreensBank();
		s.savings();
		s.current();
		s.fixed();
		
//		RHS--->logics
//		LHS-->Method
		
	}
	 

}

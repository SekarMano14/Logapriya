package org.abstraction;

public class GreensBank implements RBIBank,SBIBank {
	@Override
	public void salary() {
		System.out.println("Salary 6%");
	}
	@Override
	public void savings() {
		System.out.println("Savings 7%");
	}
	@Override
	public void current() {
		System.out.println("Current 6%");
	}
	@Override
	public void fixed() {
		System.out.println("Fixed 5%");
	}
	private void deposit() {
		System.out.println("Deposit 6%");
	}
public static void main(String[] args) {
	GreensBank g= new GreensBank();
	g.salary();
	g.savings();
	g.current();
	g.fixed();
	g.deposit();
	System.out.println();
	RBIBank r= new GreensBank();
	r.savings();
	r.current();
	r.fixed();
	System.out.println();
	SBIBank s= new GreensBank();
	s.salary();
	s.savings();
}
	


}

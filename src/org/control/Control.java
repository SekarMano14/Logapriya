package org.control;

public class Control {
	public static void main(String[] args) {
		// // if
		// // if(condition) {statements}
		// // =--->assign
		// // ==--->compare
		// // <,>,<=,>=,+,-,*,/, %
		//
		// int empid = 1234;
		// // 1234==1234 12340==1234
		// if (empid == 1234) {
		// System.out.println("Valid Employee id");
		// }
		//
		// // if else
		// // if(condition) {statements} //true
		// // else { statements} //false
		//
		// int eid = 12340;
		// if (eid == 1234) { // 12340==1234
		// System.out.println("Valid employee id");
		// } else {
		// System.out.println("Invalid Employee id");
		// }
		//
		// // nested if
		// // if() {
		// // if() { }
		// // }
		//
		// int age = 10, weight = 40;
		// if (age >= 18) { // 20>=18 10>=18
		// if (weight >= 50) { // 60>=50 40>=50
		// System.out.println("Able to donate blood");
		// } else {
		// System.out.println("Cant Donate blood");
		// }
		// } else {
		// System.out.println("Cant Able to donate");
		// }
		//
		// // AND / OR
		// // AND--->Logical AND(&&) BitWise AND(&)
		// // T T T
		// // T F F
		// // F T F
		// // F F F
		// // if(condition1 && condition) { statements}
		//
		// int age1 = 20, weight1 = 60;
		// if (age1 >= 18 && weight1 >= 50) { // 20>=18 10>=18
		// System.out.println("Able to donate blood");
		// } else {
		// System.out.println("Cant Able to donate");
		// }
		//
		// // OR--->Logical OR(||) BitWise OR(|)
		// // T T T
		// // T F T
		// // F T T
		// // F F F
		// // if(condition1 || condition) { statements}
		// int ag = 6, height = 130;
		// if (ag <= 5 || height <= 120) { // 3<=5 6<=5 100<=120
		// System.out.println("Half Ticket");
		// } else {
		// System.out.println("Full tikcet");
		//
		// // if ladder or else if
		// // if() {}
		// // else if() {}
		// int a = 30, b = 50, c = 100;
		// if (a > b && a > c) { // 1.30>20 && 30>10 2.30>50 3.30>50
		// System.out.println("A is Greater");
		// } else if (b > a && b > c) { // 2.50>30 && 50>10 3.50>30&&50>100
		// System.out.println("B is Greater");
		// } else {
		// System.out.println("C is greater");
		// }
		//
		// // looping--do same set of action and again based on condition
		// // for, while, do while
		// // for
		// // start end ++ / --
		// // for(intilizze; condition; incre / decree) { statements}
		//// 1 2 4
		// for (int i = 0; i < 5; i++) {
		//// 3
		// System.out.println(i);
		// }
		// }

		// nested for
		// for() { //3
		// for() { //2
		//
		// }
		// }
//		            1      2     5
		for (int i = 0; i < 3; i++) {
//			            3
//			           3.1     3.2    3.4
			for (int j = 0; j < 3; j++) {
//				               3.3
				System.out.println(j);
			}
//                             4			
			System.out.println(i);
		}
		
		System.out.println();
//		while--entry level checking
//		while(condition) {statements		}
		int a=10;
		while(a<15) {  //10<15
			System.out.println(a);
			a++; //10+1=11
		}
		System.out.println();
//		do while--entry level checking
//		do {statements		}
//		while(condition);
		int a1=100;
		do {
			System.out.println(a1);
			a1++; //100+1=101
		}
		while(a1<15);  //101<15
		
//		break
//		continue
//		System.exit(0);
		
//		break
		System.out.println("---Break----");
		System.out.println("Start");
		for (int i = 0; i <5; i++) {
			if(i==2) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("End");
		
//		continue
		System.out.println("---continue----");
		System.out.println("Start");
		for (int i = 0; i <5; i++) {
			if(i==2) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("End");
		
		
////		System.exit(0)
//		System.out.println("---System.exit(0)----");
//		System.out.println("Start");
//		for (int i = 0; i <5; i++) {
//			if(i==2) {
//				System.exit(0);
//			}
//			System.out.println(i);
//		}
//		System.out.println("End");

		
//		switch case
//		switch (key) {
//		case value:
//			break;
//
//		default:
//			break;
//		}
		
		int day=5;
		switch (day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;

		default:
			System.out.println("Pls Enter the valid day");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

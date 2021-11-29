package org.collection;

import java.util.*;

public class Employee {
	public static void main(String[] args) {
		List<Integer> li= new ArrayList<>();
//		add-addvalues  to list
		li.add(10);  //0
		li.add(20);//1
		li.add(80);//2
		li.add(30);//3
		li.add(70);//4
		li.add(50);//5
		System.out.println(li);
		li.add(10);//6
		li.add(40);//7
		li.add(20);//8
		li.add(60);//9
		System.out.println(li);
		
//		size
		int size = li.size();
		System.out.println(size);
		
//		get particular value
		Integer it = li.get(4);
		System.out.println(it);
		
//		indexof value
		int io = li.indexOf(10);
		System.out.println(io);
		
//		last index of
		int lo = li.lastIndexOf(10);
		System.out.println(lo);
		
//		prsent or not
		boolean ct = li.contains(50);
		System.out.println(ct);
		
//		add the value
		li.add(100);
		System.out.println(li);
		
//		add in particular place
		li.add(2, 200);
		System.out.println(li);
		
//		replace
		li.set(2, 300);
		System.out.println(li);
//		remove
		li.remove(2);
		System.out.println(li);
		
//		clear 
//		li.clear();
//		System.out.println(li);
//		
//		empty
		boolean l = li.isEmpty();
		System.out.println(l);
		
//		Create new List
		List<Integer> l2= new LinkedList<Integer>();
		System.out.println(l2);
		
//		add values--list 1 to list 2
		l2.addAll(li);
		System.out.println("List ...1 "+li);
		System.out.println("List ...2 "+l2);
		
//		compare
		boolean ee = l2.equals(li);
		System.out.println(ee);
		
//		add some values to list 2
		l2.add(120);
		l2.add(150);
		l2.add(160);
		l2.add(180);
		System.out.println(l2);
		
//	/get common values
//	l2.retainAll(li);
//	System.out.println(l2);
	
//	remove all--remove common values
	l2.removeAll(li);
	System.out.println(l2);
//		get all values
//	Normal for loop
	System.out.println("====Normal for loop====");
	for (int i = 0; i <li.size(); i++) {
		System.out.println(li.get(i));
	}
	
//	Enhanced  for loop
	System.out.println("====Enhanced for loop====");
	for (Integer x : li) {
		System.out.println(x);
	}
	
	System.out.println("==ForEach Method===");
//	forEach method-->1.8
	li.forEach(System.out::println);
		
	}

}

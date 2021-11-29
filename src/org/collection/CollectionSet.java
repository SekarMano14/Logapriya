package org.collection;

import java.util.*;

public class CollectionSet {
	public static void main(String[] args) {
		Set<Integer> si= new LinkedHashSet<>();
		si.add(10);
		si.add(50);
		si.add(60);
		si.add(20);
		si.add(60);
		si.add(50);
		si.add(40);
		si.add(30);
		si.add(10);
		System.out.println(si);
		
//		size
//		control+2   L
		int size = si.size();
		System.out.println(size);
		
//		contains
		boolean vt = si.contains(50);
		System.out.println(vt);
		
//		remove
		si.remove(20);
		System.out.println(si);
		
//		clear
//		si.clear();
//		System.out.println(si);
		
//		isempty
		boolean em = si.isEmpty();
		System.out.println(em);
		
//		get all values
//		Enhanved for loop
		System.out.println("-----Enahnaced for loop-----");
		for (Integer x : si) {
			System.out.println(x);
		}
//		for each method
		System.out.println("--For Each Method---");
		si.forEach(System.out::println);
		
//		List
		List<Integer> li= new ArrayList<>();
//		add-addvalues  to list
		li.add(10);  //0
		li.add(20);//1
		li.add(80);//2
		li.add(30);//3
		li.add(70);//4
		li.add(50);//5
		li.add(10);//6
		li.add(40);//7
		li.add(20);//8
		li.add(60);//9
		li.add(40);//10
		System.out.println(li);
		
//		duplicate remove
		Set<Integer> s2= new LinkedHashSet<>();
		s2.addAll(li);
		System.out.println(s2);
		
//		duplicate count
		System.out.println(li.size()-s2.size());
		
//		Ascending order
//		ASCII values  a-z--->97-122  A-Z-->65-90
//		num--0-9--->48-57  special char-->33-47  space-->32
		Set<Character> s3= new TreeSet<>();
		s3.add('A');
		s3.add('5');
		s3.add('a');
		s3.add(' ');
		s3.add('%');
		System.out.println(s3);
}

}

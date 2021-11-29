package org.collection;

import java.util.*;
import java.util.Map.Entry;

public class CollectionMap {
	public static void main(String[] args) {

		Map<Integer, String> mp= new Hashtable<Integer, String>();
		mp.put(10, "Java");
		mp.put(20, "Python");
		mp.put(30, "SQL");
		mp.put(40, "C#");
		mp.put(50, "Ruby");
		mp.put(10, "Bigdata");
		mp.put(70, "Bigdata");
		System.out.println(mp);
		
//		size
		int size = mp.size();
		System.out.println(size);
		
//		get a particular
		String st = mp.get(20);
		System.out.println(st);
		
//		key present or not
		boolean ck = mp.containsKey(20);
		System.out.println(ck);
		
//		value is present or not
		boolean cv = mp.containsValue("Java");
		System.out.println(cv);
		
//		remove
		String nm = mp.remove(20);
		System.out.println(nm);
		System.out.println(mp);
		
//		key only
		Set<Integer> ks = mp.keySet();
		System.out.println(ks);
		
//		values only
		Collection<String> vl = mp.values();
		System.out.println(vl);
		
//		key value as pair---entry
		Set<Entry<Integer, String>> et = mp.entrySet();
		System.out.println(et);
		
//		get all values
//		Enhanced for loop
		System.out.println("---Enahnced for loop---");
		for(Entry<Integer, String> x:et) {
//			key value
			System.out.println(x);
//			key
			System.out.println(x.getKey());
//			value
			System.out.println(x.getValue());
			System.out.println();
		}
		
		
	}
}

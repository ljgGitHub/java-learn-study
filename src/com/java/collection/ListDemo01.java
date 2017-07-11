package com.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo01 {
	public static void main(String[] args) {
		List<List<String>> listCollection = new ArrayList<List<String>>();
		List<String> list1 = new ArrayList<String>();
		list1.add("LIST AAA1");
		list1.add("LIST AAA2");
		list1.add("LIST AAA3");
		listCollection.add(list1);
		List<String> list2 = new ArrayList<String>();
		list2.add("LIST BBB1");
		list2.add("LIST BBB2");
		list2.add("LIST BBB3");
		listCollection.add(list2);
		List<String> list3 = new ArrayList<String>();
		list3.add("LIST CCC1");
		list3.add("LIST CCC2");
		list3.add("LIST CCC3");
		listCollection.add(list3);
		System.out.println(listCollection.toString());
	}
}

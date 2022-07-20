package com.svkp.collections;

import java.util.Set;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		Set<String> ts = new TreeSet<>();

		ts.add("vijay\n");
		ts.add("Arun\n");
		ts.add("Kiran\n");
		ts.add("Madhu\n");
		ts.add("Ram\n");
		ts.add("Pavan\n");

		for (String value : ts)

			System.out.print( value + "  ");

		System.out.println();
	}
}
package com.svkp.collections;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht1 = new Hashtable<>();
		Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>();


		ht1.put(11, "VIjay");
		ht1.put(24, "Arun");
		ht1.put(33, "Ram");

		ht2.put(40, "Sundhar");
		ht2.put(05, "Madhu");
		ht2.put(16, "Bunny");

		
		System.out.println("Student ID with Names : " + ht1);
		System.out.println("Student ID with Names : " + ht2);

	}

}

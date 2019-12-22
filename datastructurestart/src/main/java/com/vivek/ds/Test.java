package com.vivek.ds;// Java code to illustrate String

import java.io.*; 
import java.lang.*; 

class Test {
    public static void main(String[] args)
	{ 
		// Declare String without using new operator 
		String s = "GeeksforGeeks";

		String s1 = new String(s.toCharArray(), 0, 5);
		System.out.println(s1);
		//int pointAt = s.codePointAt(0);
		//System.out.println(pointAt);
	} 
} 

package com.CodingTest.KMG.run;

import java.util.Scanner;

public class Step3 {
	//백준 2739문제 
	public static void main1(String[] args) {
		
	     Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
	     if(n > 1 && n <= 9) {
		     for(int i = 1; i <= 9; i++) {
		    	 System.out.println( n + " * " + i + " = " + n * i);
			 }
		 }		    
	}
	//백준 10950문제 
	public static void main2(String[] args) {
		
	     Scanner sc = new Scanner(System.in);
	     int t = sc.nextInt();
	    
	    for(int i = 0; i < t ; i++) {
	    	int a = sc.nextInt();
	    	int b = sc.nextInt();
	    	
	    	System.out.println(a+b);
	    }
	     
	    sc.close();
	     
	}
	
	
	
	
	
	
	
	
	
}

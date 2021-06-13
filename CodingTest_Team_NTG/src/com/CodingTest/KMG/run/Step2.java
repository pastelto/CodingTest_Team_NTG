package com.CodingTest.KMG.run;

import java.util.Scanner;

public class Step2 {
	//백준 1330문제 
	 public static void main1(String[] args){
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        
	        if(a > b){
	            System.out.println(">");
	        }else if(a < b){
	            System.out.println("<");
	        }else if(a == b){
	            System.out.println("==");
	        }
	        
	    }
	 //백준 9498문제 
	 public static void main2(String[] args){
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        
	        if(a >= 90){
	            System.out.println("A");
	        }else if(a >= 80){
	            System.out.println("B");
	        }else if(a >= 70){
	            System.out.println("C");
	        }else if(a >= 60){
	            System.out.println("D");
	        }else{
	            System.out.println("F");
	        }
	    }
	 //백준 2753문제 
	 public static void main3(String[] args) {
			
	     Scanner sc = new Scanner(System.in);
	     int date = sc.nextInt();	     
	     if(date % 4 == 0 && (date % 100 != 0 || date % 400 == 0)) {
	    	 System.out.println(1);
	     }else {
	    	 System.out.println(0);
	     }
	 }
	 //백준 14681문제 
	 public static void main4(String[] args) {
			
	     Scanner sc = new Scanner(System.in);
	     int a = sc.nextInt();
	     int b = sc.nextInt();
	     
	     if(a > 0 && b > 0) {
	    	 System.out.println(1);
	     }else if(a > 0 && b < 0) {
	    	 System.out.println(4);
	     }else if(a < 0 && b > 0) {
	    	 System.out.println(2);
	     }else if(a < 0 && b < 0) {
	    	 System.out.println(3);
	     }

	 }
	 //백준 2884문제 
	 public static void main5(String[] args) {
			
	     Scanner sc = new Scanner(System.in);
	     int h = sc.nextInt();
	     int m = sc.nextInt();
	     
	     if(m < 45) {
	    	 h--;
	    	 m = 60 - (45 - m);
	    	 if(h < 0) {
	    		 h = 23;
	    	 }
	    	 System.out.println(h + " " + m);
	     }else {
	    	 System.out.println(h + " " + (m - 45));
	     }

	 }
}

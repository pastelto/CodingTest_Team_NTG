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
}

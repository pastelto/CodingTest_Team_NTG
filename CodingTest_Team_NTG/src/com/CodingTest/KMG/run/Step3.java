package com.CodingTest.KMG.run;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
	//백준 8393문제 
	public static void main3(String[] args) {
		
	     Scanner sc = new Scanner(System.in);
	     int a = sc.nextInt();
	     int k = 0;
	     
	     for(int i=1; i <= a; i++) {
	    	k += i;
	     }
	     System.out.println(k);
	     
	}
	//백준 15552 문제 
	public static void main4(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    int k = Integer.parseInt(br.readLine());
	    //StringTokenizer st;
	    for(int i=0; i < k; i++) {
	    	String s = br.readLine();
	    	int a = Integer.parseInt(s.split(" ")[0]);
	    	int b = Integer.parseInt(s.split(" ")[1]);
	    	bw.write(a+b+"\n");
	    }
	    br.close();
	    bw.flush();
	    bw.close();
	}
	//백준 2741문제 
	public static void main5(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    int k = Integer.parseInt(br.readLine());
	    //StringTokenizer st;
	    for(int i=1; i <= k; i++) {
	    	
	    	
	    	bw.write(i+"\n");
	    }
	    br.close();
	    bw.flush();
	    bw.close();
	}
	
	
	
	
	
	
	
}

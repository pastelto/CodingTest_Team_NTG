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
	//백준 2742문제
		public static void main6(String[] args) throws IOException {
			
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			    int n = Integer.parseInt(br.readLine());
			    
			    for(int i =n; i >= 1; i--) {
			    	System.out.println(i);
			    }
			    br.close();
			    bw.flush();
			    bw.close();
			
	}
	//백준 11021문제
		public static void main7(String[] args) {
			
			Scanner sc = new Scanner(System.in);
		    int t = sc.nextInt();
		    
		    for(int i=0; i<t; i++) {
		    	int a = sc.nextInt();
			    int b = sc.nextInt();
		    	System.out.println("Case #" + (i+1) +" : " + (a+b) );
		    }
		    sc.close();
		}
	//백준 11022문제
		public static void main8(String args[]) {
			 
			Scanner in = new Scanner(System.in);
	 
			int a = in.nextInt();
	 
			for (int i = 1; i <= a; i++) {
				int c = in.nextInt();
				int d = in.nextInt();
				
				System.out.println("Case #" + i + ": "+ c +"+"+ d +"="+ (c + d));
			}
	 
			in.close();
		}
	//백준 2438문제 
		public static void main9(String args[]) {
			 
			Scanner in = new Scanner(System.in);
	 
			int a = in.nextInt();
	 
			for (int i = 1; i <= a; i++) {
				for(int j =1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println("*");
			}
	 
			in.close();
		}
	//백준 2439문제
		public static void main10(String args[]) {
			 
			Scanner in = new Scanner(System.in);
	 
			int a = in.nextInt();
	 
			for(int i =1; i <= a; i++) {
				for(int k =1; k <= a-i; k++) {
					System.out.print(" ");
				}
				for(int j =1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			in.close();
		}
	//백준 10871문제
		public static void main11(String args[]) {
			 
			Scanner in = new Scanner(System.in);
	 
			int a = in.nextInt();
			int b = in.nextInt();
			int arr[] = new int[a];
			
			for(int i= 0; i< a;i++) {
				arr[i] = in.nextInt();
			}
	 
			in.close();
			
			for(int i =0; i<a; i++) {
				if(arr[i] < b) {
					System.out.print(arr[i] + " ");
				}
			}
		}
}

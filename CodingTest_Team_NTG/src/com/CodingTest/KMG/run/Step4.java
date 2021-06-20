package com.CodingTest.KMG.run;

import java.util.Scanner;

public class Step4 {

	public static void main1(String args[]) {
		 //백준 10952문제 
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a + b);
			
		}
	}
	//백준 10951문제 
	public static void main2(String args[]) {
 		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
            int result = a + b;
			System.out.println(result);
		}
	}
	//백준 1110문제
	
		public static void main3(String args[]) {
	 
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int num = n;
			int cnt = 0;
			
			while(true) {
				num = num % 10 * 10 + (num / 10 + num % 10) % 10;
				cnt++;
				if(n==num) {
					break;
				}
			}
			System.out.println(cnt);
			sc.close();
			
		
	}

}

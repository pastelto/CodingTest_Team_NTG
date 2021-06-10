package com.CodingTest.KDH.basic;

import java.util.Scanner;

public class IF {
	
	public void if01() {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.println(">");
		} else if(a<b) {
			System.out.println("<");
		} else if(a==b) {
			System.out.println("==");
		}
	}

}

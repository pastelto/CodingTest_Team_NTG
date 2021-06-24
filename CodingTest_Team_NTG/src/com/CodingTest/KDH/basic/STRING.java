package com.CodingTest.KDH.basic;

import java.util.Scanner;

public class STRING {

	public void s01() {
		
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);
		int i = (int)ch;
		
		System.out.println(i);
		
	}
	
	public void s02() {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 0; i < num; i++) {
			int enter = sc.nextInt();
			sum += enter;
		}
		System.out.println(sum);
	}
	
}

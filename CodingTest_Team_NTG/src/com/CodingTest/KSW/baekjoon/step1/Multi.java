package com.CodingTest.KSW.baekjoon.step1;

import java.util.Scanner;

public class Multi {

	public static void main(String[] args) {
		
		// (세 자리 수) × (세 자리 수) 
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(a * (b % 10));
		System.out.println(a * ((b % 100) - (b % 10)) / 10);
		System.out.println(a * (b / 100));
		System.out.println(a * b);
		

	}

}

package com.CodingTest.KSW.baekjoon.step7;

import java.util.Scanner;

public class Nsum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		String str = sc.next();
		
		for(int i = 0; i < n; i++) {
			sum += str.charAt(i)-'0';
			
		}

		System.out.println(sum);
	}

}

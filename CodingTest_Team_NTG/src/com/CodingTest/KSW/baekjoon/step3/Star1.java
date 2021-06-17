package com.CodingTest.KSW.baekjoon.step3;

import java.util.Scanner;

public class Star1 {

	public static void main(String[] args) {
	// 별찍기
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 0 ; j < i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

package com.CodingTest.KSW.baekjoon.step2;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		
		// 두 수 비교하기 
		
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a > b) {
			System.out.println('>');
		}else if(a < b) {
			System.out.println('<');
		}else if(a == b) {
			System.out.println("==");
		}

	}

}

package com.CodingTest.KSW.baekjoon.step2;

import java.util.Scanner;

public class Quadrant {

	public static void main(String[] args) {
		// 4분면 구하기 
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x > 0 && y > 0) {
			System.out.println(1);
		}else if (x < 0 && y > 0) {
			System.out.println(2);
		}else if (x < 0 && y < 0) {
			System.out.println(3);
		}else if( x > 0 && y < 0) {
			System.out.println(4);
		}
		
	}

}

package com.CodingTest.KDH.basic;

import java.util.Scanner;

public class IF {

	public void if01() {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a > b) {
			System.out.println(">");
		} else if (a < b) {
			System.out.println("<");
		} else if (a == b) {
			System.out.println("==");
		}
	}

	public void if02() {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		if (0 <= a && a <= 100) {
			if (a >= 90) {
				System.out.println("A");
			} else if (a >= 80) {
				System.out.println("B");
			} else if (a >= 70) {
				System.out.println("C");
			} else if (a >= 60) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
		}

	}

	public void if03() {

		// 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.

		Scanner sc = new Scanner(System.in);

		int year = sc.nextInt();

		if (year % 4 == 0) {
			if (year % 400 == 0 || year % 100 != 0) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		} else {
			System.out.println(0);
		}

	}
	
	public void if04() {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x > 0) {
			if(y > 0) {
				System.out.println(1);
			} else if(y < 0) {
				System.out.println(4);
			}
		} else if(x < 0) {
			if(y > 0) {
				System.out.println(2);
			} else if(y < 0) {
				System.out.println(3);
			}
		}
	}

}

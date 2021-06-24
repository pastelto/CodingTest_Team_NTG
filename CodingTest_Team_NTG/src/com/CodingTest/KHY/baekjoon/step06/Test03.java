package com.CodingTest.KHY.baekjoon.step06;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		// 등차수열: An = A1+(n-1)d
		//A2-A1 = A3-A2
		int count = 0;

		// 1~99까지는 전부 등차 수열
		if (num < 100) {
			count = num;

		} else {
			count = 99;

			for (int i = 100; i <= num; i++) {
				int a = i / 100;
				int b = (i % 100) / 10;
				int c = (i % 10) / 1;
				
				if((b-a)==(c-b)) {
					count++;
				}
			}

		}

		System.out.println(count);

	}

}

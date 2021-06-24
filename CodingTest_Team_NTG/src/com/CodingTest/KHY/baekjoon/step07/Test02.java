package com.CodingTest.KHY.baekjoon.step07;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		sc.nextLine();
		String str=sc.nextLine();

		int sum = 0;
		for (int i = 0; i < num; i++) {
//			sum+=str.charAt(i)-'0';
			sum += Character.getNumericValue(str.charAt(i));
		}

		System.out.println(sum);
	}

}

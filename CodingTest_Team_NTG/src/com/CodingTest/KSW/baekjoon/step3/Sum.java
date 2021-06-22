package com.CodingTest.KSW.baekjoon.step3;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
	//n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 하나 입력해주세요.");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		
		System.out.println(sum);

	}

}

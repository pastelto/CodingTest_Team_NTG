package com.CodingTest.KHY.baekjoon.step08;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int sum = 1;
		int count = 1;

		while(true) {
			if(num<=sum) {
				break;
			}else {
				sum += count*6;
				count++;
			}
		}
		System.out.println(count);
	}
}

//백준이 틀렸다고 함.....
//public class Test02 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		int num = sc.nextInt();
//		int sum = 0;
//		int count = 0;
//
//		for (int i = 0; i < num; i++) {
//			sum += i * 6;
//			if(num == 1) {
//				count = 1;
//			}else if (num < sum) {
//				count = i + 1;	
//				break;
//			}
//		}
//		System.out.println(count);
//	}
//}
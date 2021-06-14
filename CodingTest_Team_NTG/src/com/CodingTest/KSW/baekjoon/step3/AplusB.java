package com.CodingTest.KSW.baekjoon.step3;

import java.util.Scanner;

public class AplusB {

	public static void main(String[] args) {
		
	// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	// 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
	// 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		
		Scanner sc = new Scanner(System.in);
		
		int index = sc.nextInt();
		
		int arr[] = new int[index]; // 테스트 케이스 --> 배열 
		
		for(int i = 0; i< index; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[i] = a + b;
		}
		
		for(int j : arr) {
			System.out.println(j);
		}

	}

}

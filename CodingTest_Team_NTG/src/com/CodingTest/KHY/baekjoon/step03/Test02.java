package com.CodingTest.KHY.baekjoon.step03;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int testNum = sc.nextInt();
		int[][] arr = new int[testNum][2];

		for (int i = 0; i < testNum; i++) {

			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		for(int i = 0;i<testNum;i++) {
			System.out.println(arr[i][0]+arr[i][1]);
		}
	}
}
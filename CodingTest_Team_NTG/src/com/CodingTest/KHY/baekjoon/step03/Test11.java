package com.CodingTest.KHY.baekjoon.step03;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int x = sc.nextInt();
		
		int arr[] = new int[num];
		for(int i = 0;i<num;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<num;i++) {
			if(arr[i] < x) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}

package com.CodingTest.KHY.baekjoon.step05;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		
		for(int i = 0; i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int max = 0; 
		int count = 0;
		for(int i = 0; i<arr.length;i++) {
			
			max = Math.max(max, arr[i]);
			
			if(max==arr[i]) {
				count = i;
			}
			
		}

		System.out.println(max);
		System.out.println(count+1);
	}

}

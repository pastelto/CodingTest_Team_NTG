package com.CodingTest.KSW.baekjoon.step5;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int index = 0;
		int[] arr = new int[9];
		int count = 0;
		
		for(int i = 0; i < 9 ; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int num : arr) {
			count++;
			
			if(num > max) {
				max = num;
				index = count;				
			}
			
		}
		
		System.out.print(max + "\n" + index);

	}

}

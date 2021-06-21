package com.CodingTest.KHY.baekjoon.step05;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		String mul = (num1*num2*num3)+"";
		int arr[] = new int[mul.length()];
		
		for(int i =0;i<arr.length;i++) {
			arr[i]=Character.getNumericValue(mul.charAt(i));
		}
		int count = 0;
		
		for(int i=0;i<=9;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i==arr[j]) {
					count++;
				}
				
			}
			System.out.println(count);
			count = 0;
		}

	}

}

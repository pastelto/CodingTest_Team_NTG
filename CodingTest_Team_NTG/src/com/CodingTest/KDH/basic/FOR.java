package com.CodingTest.KDH.basic;

import java.util.Scanner;

public class FOR {

	public void FOR01() {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 1; i < 10; i++) {
			
			System.out.println(num + " * " + i + " = " +  num*i);
			
		}
	}
	
	public void FOR02() {
		
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		int arr[] = new int[count];
		
		for(int i = 0; i< count; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			arr[i] = num1 + num2;
		}
		
		for(int sum : arr) {
			System.out.println(sum);
		}
	}
	
}

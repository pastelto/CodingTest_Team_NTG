package com.CodingTest.BTH.step05;

import java.util.Scanner;

public class MacimumValue {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = { sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(),
				sc.nextInt(), sc.nextInt() };
		sc.close();
		
		int count = 0;
		int max = 0;
		int index = 0;
		
		for(int value : arr) {
			count++;
			
			if(value > max) {
				max = value;
				index = count;
			}
		}
		System.out.println(max + "\n" + index);
	}

}

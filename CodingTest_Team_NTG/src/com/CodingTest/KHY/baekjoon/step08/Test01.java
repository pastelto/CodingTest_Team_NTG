package com.CodingTest.KHY.baekjoon.step08;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valA = sc.nextInt();
		
		int valB = sc.nextInt();
		
		int valC = sc.nextInt();
		
		int bep = 1;
		int result = 0;
		
		while(true) {
			
			if(valB>=valC) {
				result=-1;
				break;
			}else {
				result = (valA)/(valC-valB)+1;
				break;
			}
		}
		System.out.println(result);
	}
}

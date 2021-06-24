package com.CodingTest.KSW.baekjoon.step6;

import java.util.Scanner;

public class Arithmetic {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println(arithmetic(sc.nextInt()));
	
	}
	
	
	public static int arithmetic(int num) {
		
		int count = 0; // 한수의 수 
		
		if(num < 100) {
			return num;
		} 
		else { 
			count = 99;
			if(num == 1000) { // 예외처리
				num = 999;
			}
			
			for(int i= 100; i<=num; i++) {
				int hun = i / 100; // 백의자리수
				int ten = (i / 10) % 10; // 십의자리
				int one = i % 10;
				
				if((hun-ten) == (ten-one)) {
					count++;
				}
			}
			
		}
		return count;
		
	}

}

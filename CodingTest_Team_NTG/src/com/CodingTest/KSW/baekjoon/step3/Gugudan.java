package com.CodingTest.KSW.baekjoon.step3;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("2~9 사이의 정수를 입력해주세요.");
		
		int num = sc.nextInt();
		
		for(int i = 1; i<=9; i++ ) {
			System.out.println(num + " * " + i +" = " + (num*i));
		}
			
	}

}

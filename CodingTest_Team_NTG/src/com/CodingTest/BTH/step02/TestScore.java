package com.CodingTest.BTH.step02;

import java.util.Scanner;

public class TestScore {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a;
		
		a = sc.nextInt(); // 시험점수 입력
		
		if(a >= 90 && a <= 100) {
			System.out.println("A");
		}else if(a >= 80 && a <= 89) {
			System.out.println("B");
		}else if(a >= 70 && a <=79) {
			System.out.println("C");
		}else if(a >= 60 && a <= 69) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}

	}

}

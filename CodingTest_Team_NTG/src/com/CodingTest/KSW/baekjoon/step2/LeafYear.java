package com.CodingTest.KSW.baekjoon.step2;

import java.util.Scanner;

public class LeafYear {

	public static void main(String[] args) {
		
		// 입력받은 년도가 윤년인지 구하기 1 < year <= 4000
		
		Scanner sc = new Scanner(System.in);
		
		int year;
		
		year = sc.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
	}

}

package com.CodingTest.BTH.step02;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a;
		
		a = sc.nextInt(); // 연도 입력
		
		if(a %4 == 0) {
			if(a %400 == 0) System.out.println("1");
			else if(a %100 == 0) System.out.println("0");  
			else System.out.println("1");
			
		}else {
			System.out.println("0");
		}
			
	}

}

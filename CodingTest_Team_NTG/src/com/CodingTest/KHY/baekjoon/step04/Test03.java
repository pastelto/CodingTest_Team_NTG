package com.CodingTest.KHY.baekjoon.step04;

//피보나치개념 학습!

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int numC = num;
		int count =1;
		
		
		if(0>num||num>99) {
			System.out.print("다시입력해주세요: ");
			num = sc.nextInt();
		}
		
		while(true) {
			
			numC = (numC%10)*10+(numC%10+numC/10)%10;
			
			if(numC==num) {
				break;
			}
			
			count++;
		}
		
		System.out.println(count);
	}

}

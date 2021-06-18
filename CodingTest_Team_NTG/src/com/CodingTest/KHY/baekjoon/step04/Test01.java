package com.CodingTest.KHY.baekjoon.step04;

import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> listNum1 = new ArrayList<Integer>();
		ArrayList<Integer> listNum2 = new ArrayList<Integer>();
		
		while(true) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			if(num1==0&&num2==0) {
				break;
			}
			
			listNum1.add(num1);
			listNum2.add(num2);
		}
		int i = 0;
		
		while(i<listNum1.size()) {
			System.out.println(listNum1.get(i)+listNum2.get(i));
			i++;
		}

	}

}

package com.CodingTest.KHY.baekjoon.step07;

//문제 링크: https://www.acmicpc.net/problem/5622

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test08 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String input = sc.nextLine().toUpperCase();
		

		String[][] phone = new String[10][3];
		String num = "1234567890";
		String alp = "ABC DEF GHI JKL MNO PQRS TUV WXYZ";

		for (int i = 0; i < phone.length; i++) {

			phone[i][0] = String.valueOf(num.charAt(i)); //각 다이얼 넘버
			phone[i][2] = (i+2)+""; //다이얼 거는데 걸리는 시간

		}
		//다이얼 별 알파벳 
		
		phone[0][1] = "";
		phone[9][1] = "operator";
		StringTokenizer st = new StringTokenizer(alp);

		while (st.hasMoreTokens()) {
			for (int i = 1; i < phone.length-1; i++) {
				phone[i][1] = st.nextToken();
			}
		}
		
		//출력용
//		for (int i = 0; i < phone.length; i++) {
//			for (int j = 0; j < phone[i].length; j++) {
//				System.out.print(phone[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		int sum = 0;
		
		for(int i = 0; i< phone.length;i++) {
			for(int j = 0; j< input.length();j++) {
				if(phone[i][1].contains(input.charAt(j)+"")) {
					sum+=Integer.parseInt(phone[i][2]);
				}
			}
		}
		
		System.out.println(sum);
	}

}

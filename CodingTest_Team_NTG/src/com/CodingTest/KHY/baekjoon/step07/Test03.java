package com.CodingTest.KHY.baekjoon.step07;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String inputStr = sc.nextLine();
		String str = "abcdefghijklmnopqrstuvwxyz";
		
		char arr[] = new char[26];
		int answer[] = new int[26];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			answer[i]=-1;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < inputStr.length(); j++) {
				if (arr[i] == inputStr.charAt(j)) {
					if(answer[i]==-1) { //중복되는 경우는 먼저나온 순서로
						answer[i] = j;
					}
				} 
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(answer[i]+" ");
		}
	}

}

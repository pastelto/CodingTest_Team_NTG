package com.CodingTest.KHY.baekjoon.step07;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		String arr[][] = new String[num][2];

		int count = 0;

		while (count < num) {

			arr[count][0] = sc.next();
			arr[count][1] = sc.nextLine();

			count++;
		}
		String answer[] = new String[num];
		String str = "";

		for (int i = 0; i < num; i++) {

			for (int j = 0; j < arr[i][1].length(); j++) {
				for (int k = 0; k < Integer.parseInt(arr[i][0]); k++) {

					str += arr[i][1].charAt(j);
				}
			}
			answer[i] = str.trim();
			str = "";
		}
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);

		}
	}

}

package com.CodingTest.KHY.baekjoon.step07;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		String arr[] = new String[num];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		String copy[] = new String[num];
		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i].charAt(0) + "";
			for (int j = 1; j < arr[i].length(); j++) {
				if (arr[i].charAt(j - 1) == arr[i].charAt(j)) {
					copy[i] += "";
				} else {

					copy[i] += arr[i].charAt(j);
				}
			}

		}

		int count[] = new int[num];
		for (int i = 0; i < copy.length; i++) {
			count[i] = 0;
			for (int j = 0; j < copy[i].length(); j++) {
				for (int k = j + 1; k < copy[i].length(); k++) {
					if (copy[i].charAt(j) == copy[i].charAt(k)) {
						count[i] += 1;
					}
				}
			}
		}
		int result = 0;
		for (int i = 0; i < count.length; i++) {
			if (count[i] == 0) {
				result++;
			}
		}
		System.out.println(result);
		
	}

}

package com.CodingTest.KHY.baekjoon.step07;

import java.util.ArrayList;
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine().toUpperCase();

		String alp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		String[][] arr = new String[26][2];

		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = String.valueOf(alp.charAt(i));
			arr[i][1] = "0";
		}

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < arr.length; j++) {
				if (str.charAt(i) == arr[j][0].charAt(0)) {
					arr[j][1] = String.valueOf(Integer.valueOf(arr[j][1]) + 1);
				}
			}

		}

		int a = 0;

		for (int i = 0; i < arr.length; i++) {

			a = Math.max(a, Integer.valueOf(arr[i][1]));
		}

		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i][1].equals(a + "")) {
				list.add(arr[i][0]);
			}
		}

		if (list.size() == 1) {
			System.out.println(list.get(0));
		} else {
			System.out.println("?");
		}

	}

}

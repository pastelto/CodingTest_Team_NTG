package com.CodingTest.KSW.baekjoon.step7;

import java.util.Scanner;
import java.util.StringTokenizer;

public class NumberOfWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(str," ");
		
		System.out.println(st.countTokens());
	}

}

package com.CodingTest.KSW.baekjoon.step5;

import java.util.ArrayList;
import java.util.Scanner;

public class Mod {

	public static void main(String[] args) {
	// 10개의 정수를 입력받아 42로 나눈 나머지 중 중복되지 않는 값의 수  구하기 
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		int count = 0;
		String mod[] = new String[10];
		ArrayList<String> list = new ArrayList<>();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			mod[i] = Integer.toString(arr[i] % 42);
		}
		
		for(String remain : mod) {
			if(!list.contains(remain)) {
				list.add(remain);
			}
		}
		System.out.println(list.size());
	}

}

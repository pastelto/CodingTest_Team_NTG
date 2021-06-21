package com.CodingTest.KHY.baekjoon.step05;

import java.util.Arrays;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int[] arr = new int[num];


		for(int i =0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int maxVal = arr[num-1];
		int minVal = arr[0];
		
		System.out.println(minVal+" "+maxVal);

	}

}
//이클립스에는 실행되는 데 백준에서 에러남~
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Scanner;
//import java.util.StringTokenizer;
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		int num = sc.nextInt();
//
//		int[] arr = new int[num];
//
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		String a;
//		try {
//			a = bf.readLine();
//			StringTokenizer st = new StringTokenizer(a);
//			for (int i = 0; i < num; i++) {
//				arr[i] = Integer.parseInt(st.nextToken());
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		int maxVal = arr[0];
//		int minVal = arr[0];
//		for (int i = 0; i < num; i++) {
//			maxVal = (Math.max(maxVal, arr[i]));
//			minVal = (Math.min(maxVal, arr[i]));
//		}
//
//		System.out.println(maxVal);
//		System.out.println(minVal);
//
//	}
//
//}

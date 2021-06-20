package com.CodingTest.KDH.basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FOR {

	public void FOR01() {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 1; i < 10; i++) {

			System.out.println(num + " * " + i + " = " + num * i);

		}
	}

	public void FOR02() {

		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();

		int arr[] = new int[count];

		for (int i = 0; i < count; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			arr[i] = num1 + num2;
		}

		for (int sum : arr) {
			System.out.println(sum);
		}
	}

	public void FOR03() {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= num; i++) {

			sum = sum + i;

		}
		System.out.println(sum);
	}

	public void FOR04() { // 다시 공부하기

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int num = Integer.parseInt(br.readLine()); // 반복횟수

			for (int i = 0; i < num; i++) {
				int num1 = Integer.parseInt(br.readLine()); // 값1
				int num2 = Integer.parseInt(br.readLine()); // 값2
				bw.write((num1 + num2) + "\n");
			}

			bw.close();

		} catch (Exception e) {

		}

	}

	public void FOR05() {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			System.out.println(i);
		}
	}

	public void FOR06() {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = num; i >= 1; i--) {

			System.out.println(i);
		}
	}

	public void FOR07() {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Case #" + i + ": " + (a + b));
		}
	}

	public void FOR08() {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a + b));
		}
	}

	public void FOR09() {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void FOR10() {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {

			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

	public void FOR11() {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] arr = new int[n];
		int[] arr1 = new int[n];
		int count = 0;
		
		for(int i = 0; i <= n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int j = 0; j <= n; j++) {
			if(arr[j] < x) {
				arr1[count] = arr[j];
				count++;
			}
			for(int k = 0; k < count; k++) {
				System.out.print(arr1[k] + " ");
		}
		
		
		}
	}
	
}
	



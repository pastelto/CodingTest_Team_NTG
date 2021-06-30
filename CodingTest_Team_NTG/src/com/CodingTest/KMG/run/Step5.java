package com.CodingTest.KMG.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Step5 {
	//백준 10818문제 
	public static void main1(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int index = 0;
		int[] arr = new int[N];
		while (st.hasMoreTokens()) {
			arr[index] = Integer.parseInt(st.nextToken());
			index++;
		}

		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[N - 1]);

	}
	//백준 2562문제 
	public static void main2(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[9];

		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int max = 0;
		int index = 0;
		int count = 0;

		for (int value : arr) {
			count++;
			if (value > max) {
				max = value;
				index = count;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}	
	//백준 2577문제 
	public static void main3(String args[]) {

		Scanner sc = new Scanner(System.in);

		int value = (sc.nextInt() * sc.nextInt() * sc.nextInt());
		String str = Integer.toString(value);
		sc.close();

		for (int i = 0; i < 10; i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if ((str.charAt(j) - '0') == i) {
					count++;
				}
			}
			System.out.println(count);
		}

	}
	//백준 3052문제 
	public static void main4(String args[]) throws NumberFormatException, IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> ha = new HashSet<Integer>();
		
		for(int i=0;i<10; i++) {
			ha.add(Integer.parseInt(br.readLine()) % 42);
		}
		System.out.println(ha.size());
	}
	//백준 1546문제
	public static void main5(String args[]) throws NumberFormatException, IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double arr[] = new double[Integer.parseInt(br.readLine())];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), "  ");
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}
		double sum =0;
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length;i++) {
			sum += ((arr[i]/arr[arr.length-1])*100);
		}
		System.out.println(sum/arr.length);
		
		
	}
}

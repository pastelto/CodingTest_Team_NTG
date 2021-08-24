package com.CodingTest.KSW.baekjoon.step8;

import java.util.Scanner;

public class BigAplusB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		String str2 = sc.next();
		
		int max_length = Math.max(str1.length(), str2.length()); // 두 수 중 가장 긴 자리수
		
		int[] a = new int[max_length +1]; // 마지막 자리수의 올림이 있을 수 있으므로 +1
		int[] b = new int[max_length +1];
		
		// a 
		for(int i=str1.length()-1, index=0; i>=0; i--, index++) {
			a[index] = str1.charAt(i) - '0'; // 맨 뒤 문자부터 역순으로 저장
		}
		
		// b 
		for(int i=str2.length()-1, index=0; i>=0; i--, index++) {
			b[index] = str2.charAt(i) - '0'; // 맨 뒤 문자부터 역순으로 저장
		}
		
		for(int i=0; i<max_length; i++) {
			int value = a[i] + b[i];
			a[i] = value % 10; // 더한 값의 10으로 나눈 나머지가 자리값
			a[i+1] += (value / 10); // 더한 값의 10으로 나눈 몫이 올림값
		}
		
		//a 역순정렬
		// 가장 높은 자리수가 0일 수도 있기 때문에 0이 아닐 경우에만 출력
		StringBuilder sb = new StringBuilder();
		if(a[max_length] != 0) {
			sb.append(a[max_length]);
		}
		for(int i = max_length-1; i>=0; i--) {
			sb.append(a[i]);
		}
		
		System.out.println(sb);
		

	}

}

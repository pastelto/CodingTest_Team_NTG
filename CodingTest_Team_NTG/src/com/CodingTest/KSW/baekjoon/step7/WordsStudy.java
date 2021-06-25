package com.CodingTest.KSW.baekjoon.step7;

import java.util.Scanner;

public class WordsStudy {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[26]; // 영문자 26개
		
		String s = sc.next();
		
		for(int i = 0; i < s.length(); i++) {
			
			if( 65 <= s.charAt(i) && s.charAt(i) <= 90) { // 대문자 범위 
				arr[s.charAt(i)-'A']++ ; // 해당 인덱스 값 +1
			}
			else { // 소문자
				arr[s.charAt(i)-'a']++;
			}

		}
		
		int max = -1; // arr[i] == 0 일 때 해당 문자가 1번 존재 
		char ch = '?';
		
		for(int i = 0; i < 26; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = (char)(i+65); // 대문자로 출력하기 위해서 
			}
			else if (arr[i] == max) {
				ch ='?';
			}
		}
		
		System.out.print(ch);
		
	}
}
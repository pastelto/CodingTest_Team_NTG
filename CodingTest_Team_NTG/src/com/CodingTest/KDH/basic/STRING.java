package com.CodingTest.KDH.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class STRING {

	public void s01() {

		Scanner sc = new Scanner(System.in);

		char ch = sc.next().charAt(0);
		int i = (int) ch;

		System.out.println(i);

	}

	public void s02() {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < num; i++) {
			int enter = sc.nextInt();
			sum += enter;
		}
		System.out.println(sum);
	}

	public void s03() {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		for (char ch = 'a'; ch <= 'z'; ch++)
			System.out.print(s.indexOf(ch) + " ");
		// String.indexOf(값) ; String 내의 값의 인덱스를 반환

	}

	public void s04() {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt(); // 테스트 케이스의 개수

		for (int i = 0; i < t; i++) { // 새로운 문자열을 만들 횟수 (위에서 입력받은 t)

			int num = sc.nextInt(); // 문자열의 문자를 반복할 횟수
			String s = sc.next(); // 문자열 받기

			for (int j = 0; j < s.length(); j++) { // 문자열의 길이만큼 반복
				for (int k = 0; k < num; k++) { // num 만큼 문자를 반복해서
					System.out.print(s.charAt(j)); // 새로운 문자열로 출력
				}
			}
			System.out.println();
		}
	}

	public void s05() throws IOException { // NEED TO THINK MORE

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[26]; // 알파벳 26개
		String s = br.readLine().toUpperCase(); // 대문자 only

		for (int i = 0; i < s.length(); i++) {
			if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') { // 대문자 범위
				arr[s.charAt(i) - 'A']++;
			}

			int max = -1;
			char ch = '?';
			for (int j = 0; j < 26; j++) {

				if (arr[j] > max) {
					max = arr[j];
					ch = (char) (j + 65); // 대문자 출력 -> 65 더해줌
				} else if (arr[j] == max) {
					ch = '?';
				}
			}
			System.out.print(ch);
		}
	}

	public void s06() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 입력받은 걸 공백으로 분리

		br.close();

		System.out.println(st.countTokens());

	}

	public void s07() throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		String[] arr = br.readLine().split(" ");
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//
////		int num1 = Integer.valueOf(arr[0]);
////		int num2 = Integer.valueOf(arr[1]);
//
//		int[] rev = new int[2];
//
//		for (int i = 0; i < arr.length; i++) {
//			String rNum = " ";
//			if (!arr[i].isEmpty()) { // 빈 배열이 아니면,
//				for (int j = 2; j <= 0; j--) {
//					rNum += arr[i].charAt(j);
//					System.out.println("1. " + arr[i].charAt(j));
//					System.out.println("rev : " + rev[i]);
//
//				}
////				rev[i] = Integer.valueOf(rNum);
//				System.out.println("rNum : " + rNum);
//			}
//
//		}
//
////		System.out.println(Math.max(rev[0], rev[1]));

		Scanner sc = new Scanner(System.in);
		String[] arr = new String[2];
		String[] rArr = new String[2];

		for (int i = 0; i < 2; i++) {
			arr[i] = sc.next();
			StringBuffer sb = new StringBuffer(arr[i]);
			rArr[i] = sb.reverse().toString();
		}

		System.out.println(Math.max(Integer.valueOf(rArr[0]), Integer.valueOf(rArr[1])));

	}

	public void s08() {
		
		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine().toUpperCase();
		
		int time = 0;
		for(int i = 0; i < num.length(); i++) {
		switch(num.charAt(i)) {
		case 1: time += 2; break;
		case 'A': 
		case 'B':
		case 'C':
			time += 3; break;
		case 'D': 
		case 'E':
		case 'F':
			time += 4; break;
		case 'G': 
		case 'H':
		case 'I':
			time += 5; break;
		case 'J': 
		case 'K':
		case 'L':
			time += 6; break;
		case 'M': 
		case 'N':
		case 'O':
			time += 7; break;
		case 'P':
		case 'Q':
		case 'R': 
		case 'S':
			time += 8; break;
		case 'T':
		case 'U': 
		case 'V':
			time += 9; break;
		case 'W':
		case 'X': 
		case 'Y':
		case 'Z':
			time += 10; break;
		case 0 : 
			time += 11; break;
		}
		
		}
		System.out.println("time : " + time);
	}
	
}
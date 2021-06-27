package com.CodingTest.KDH.basic;

import java.util.Scanner;

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

	public void s05() { // NEED TO THINK MORE

		Scanner sc = new Scanner(System.in);

		String str = sc.next().toUpperCase(); // 모두 대문자

		int[] alp = new int[26]; // 알파벳 갯수
		int[] arr = new int[26];

		for (int i = 0; i < alp.length; i++) { // a의 아스키 코드값을 빼주어 인덱스에 활용
			if (65 <= str.charAt(i)) {
				arr[str.charAt(i) - 97]++; // 해당 알파벳 등장 시 1개씩 증가
			}
		}
	}
}

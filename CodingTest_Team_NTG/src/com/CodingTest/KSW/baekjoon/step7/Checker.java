package com.CodingTest.KSW.baekjoon.step7;

import java.util.Scanner;

public class Checker {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 그룹단어 check
		// 문자열의 문자가 연속되지 않으면서 앞서 해당 문자가 입력된 경우가 있으면 그룹단어x

		int count = 0;
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			if (check() == true) {
				count++;
			}
		}

		System.out.println(count);
	}

	private static boolean check() {
		boolean[] check = new boolean[26]; // 영어 26개 문자
		int prev = 0;
		String str = sc.next();

		for (int i = 0; i < str.length(); i++) {
			int now = str.charAt(i); // (현재 문자 저장)

			// 앞 문자와 i 번째 문자가 같지 않을 때
			if (prev != now) {
				// 해당 문자가 처음 나오는 경우
				if (check[now - 'a'] == false) {
					check[now - 'a'] = true; // true 로 변경
					prev = now; // 다음 글자를 위해 prev 도 변경
				}

				// 해당 문자가 이미 나온 적이 있으면 ( 그룹단어가 아님 )
				else {
					return false; // 함수 종료
				}
			}

			// 앞 문자와 i 번째 문자가 같을 때 ( 연속된 문자 )
			else {
				continue;
			}
		}
		return true;

	}

}

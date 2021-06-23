package com.CodingTest.KSW.baekjoon.step5;

import java.util.Scanner;

public class OverAvg {

	public static void main(String[] args) {
		// 대학생 새내기 90%는 자신이 반에서 평균은 넘는다고 생각한다.

		Scanner sc = new Scanner(System.in);

		int c = sc.nextInt();
		int[] arr;

		for (int i = 0; i < c; i++) { // test case 반복

			int n = sc.nextInt();

			arr = new int[n]; // n 크기 배열 생성

			double sum = 0;

			for (int j = 0; j < n; j++) { // 성적입력
				int score = sc.nextInt();
				arr[j] = score;
				sum += score;
			}

			double avg = sum / n; // 성적 평균
			double studentNum = 0; // 평균이 넘는 학생 수

			for (int j = 0; j < n; j++) { // 반복문으로 평균 넘는 학생
				if (arr[j] > avg) {
					studentNum++;
				}
			}

			System.out.printf("%.3f%%\n", (studentNum / n) * 100);

		}

	}
}

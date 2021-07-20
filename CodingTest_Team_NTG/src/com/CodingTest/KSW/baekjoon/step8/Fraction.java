package com.CodingTest.KSW.baekjoon.step8;

import java.util.Scanner;

public class Fraction {

	public static void main(String[] args) {
		/*
		 * 나열된 분수들을 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번,
		 * 4번, 5번, … 분수라고 하자. X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
		 */

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		int cross = 1;
		int prevSum = 0;

		while (true) {
			// 직전 대각선 누적합 + 해당 대각선 개수를 이용하여 범위 판별
			if (x <= prevSum + cross) {
				if (cross % 2 == 1) {// 대각선이 홀수
					// 분모가 큰 수부터 시작
					// 분모 = 대각선개수 - (x번째 - prevSum - 1)
					// 분자 = x번째 - prevSum

					System.out.println((cross - (x - prevSum - 1)) + "/" + (x - prevSum));
					break;
				} else { // 대각선이 짝수, 홀수일 때와 출력 반대
					System.out.println((x - prevSum) + "/" + (cross - (x - prevSum - 1)));
					break;
				}
			} else {
				prevSum += cross;
				cross++;
			}
		}
	}

}

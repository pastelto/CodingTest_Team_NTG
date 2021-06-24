package com.CodingTest.KDH.basic;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Function {

	public void F01() {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 정수 N개
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		long sum = 0;

		for (int i = 0; i < n; i++) {
			sum += a[i];
		}

		System.out.println(sum);

	}

	public class Test { // 1번문제 백준 버전
		long sum(int[] a) {
			long ans = 0;

			for (int i = 0; i < a.length; i++) {
				ans += a[i];
			}

			return ans;
		}
	}

	public void F02() { // 주말에

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean selfNums[] = new boolean[10001]; // 배열 인덱스 활용을 위한

		for (int i = 1; i <= 10000; i++) { // 1부터 10000보다 같거나 작은 수 
			int value = d(i); // d(i) 함수 밑에 
			if (value <= 10000) { // 최대값 10000 
				selfNums[value] = true; // d함수의 리턴값을 지정한 value
			}
		}
		try {
			for (int i = 1; i <= 10000; i++) {
				if (!selfNums[i])// 아닌 경우
					bw.write(String.valueOf(i) + "\n");
			}
		} catch (Exception e) {
		} finally {
			try {
				if (bw != null) {
					bw.flush();
					bw.close();
				}
			} catch (Exception e2) {

			}
		}
		
//		private static int d(int x) { // 셀프넘버 x값 입력 받아오기
//			int result = x;
//			while (true) {
//				if (x == 0) break; // x가 0일 때 break;
//				result += x % 10; // x를 10으로 남은 나머지들 합
//				x = x / 10; // x는 10으로 나눈 후의 몫
//			}
//			return result;
//		}

	}


	
	public void F03() { // 주말에

}
}

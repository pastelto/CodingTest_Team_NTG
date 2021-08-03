package com.CodingTest.KHY.baekjoon.step08;

import java.util.Scanner;

//파스칼 삼각형 방법도 해보기
public class Test06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// test 케이스
		int test = sc.nextInt();

		// arr[i][0]=k(층) arr[i][1]=n(호)
		int[][] arr = new int[test][2];

		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}

		// a층 b호 = a층 b-1호 + a-1층 b호

		int[][] room = new int[15][15];

		for (int i = 1; i < room.length; i++) {
			room[i][0] = 0; //없는 칸
			room[0][i] = i;
		}

		for (int i = 1; i < room.length; i++) {
			for (int j = 1; j < room[i].length; j++) {
				room[i][j] = room[i][j - 1] + room[i-1][j];
			}
		}

		int[] result = new int[test];
		for (int i = 0; i < test; i++) {
			result[i] = room[arr[i][0]][arr[i][1]];
		}

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}

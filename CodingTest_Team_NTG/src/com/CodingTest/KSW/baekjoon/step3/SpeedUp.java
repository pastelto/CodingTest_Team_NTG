package com.CodingTest.KSW.baekjoon.step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SpeedUp {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int t = Integer.parseInt(br.readLine());
			// String 값으로 받은 데이터를 int로 변환해준다.
			// 한 줄 씩 입력받기 위해 readLine

			for (int i = 0; i < t; i++) {
				String[] arr = br.readLine().split(" ");
				bw.write(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]) + "\n");
			}

			bw.close();

		} catch (Exception e) {

		}

	}
}

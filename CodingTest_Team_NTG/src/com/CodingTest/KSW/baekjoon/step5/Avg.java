package com.CodingTest.KSW.baekjoon.step5;

import java.util.Arrays;
import java.util.Scanner;

public class Avg {

	public static void main(String[] args) {
		// 점수 중 최댓값 M , 모든 점수를 점수/M*100 으로 수정 
		// 새로운 점수의 평균 구하기 
		
		Scanner sc = new Scanner(System.in);
		
		int tNum = sc.nextInt(); // 시험 개수 
		double[] oArr = new double [tNum];
		double[] tArr = new double[tNum];
		double sum = 0;
		double avg = 0;
		
		for(int i = 0 ; i < tNum; i++) {
			oArr[i] = sc.nextInt();
		}
		
		Arrays.sort(oArr);
		
		for(int i = 0; i < tNum; i++) {
			tArr[i] = oArr[i]/oArr[tNum-1]*100;
		}
		
		for(int i = 0; i < tNum; i++) {
			sum += tArr[i];
		}
		
		avg = sum/tNum;
		
		
		System.out.println(avg);

	}

}

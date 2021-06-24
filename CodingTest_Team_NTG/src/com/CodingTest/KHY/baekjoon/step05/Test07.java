package com.CodingTest.KHY.baekjoon.step05;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int arr[][] = new int[num][];

		int count = 0;
		int first;

		while (count < num) { // 배열에 값 넣기
			first = sc.nextInt();
			arr[count] = new int[(first + 1)];
			arr[count][0] = first;
			for (int i = 1; i < arr[count].length; i++) {
				arr[count][i] = sc.nextInt();
			}
			count++;
		}
		/*
		//입력한 전체 배열 출력하기(확인용)
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		*/
		
		int[] avg = new int[num];
		for (int i = 0; i < avg.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				avg[i] += arr[i][j];
			}
			avg[i] = avg[i] / arr[i][0];
		}
		/*
		//각 라인별 평균값 출력(확인용)
		for(int i=0;i<avg.length;i++) {
			System.out.println(avg[i]);
		}
		*/
		int peo = 0;
		double[] peoArr = new double[num];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				if(arr[i][j]>avg[i]) {
					peo++;
				}
			}
			peoArr[i] = Math.round((((double)peo/arr[i][0])*100)*1000)/1000.0;
			peo = 0;
		}
		//Math.rount는 소수점 아래 0이 여러개면 절삭시켜서 이 출력코드는 틀린거로 뜸!
//		for (int i = 0; i < peoArr.length; i++) {
//			System.out.println(peoArr[i]+"%");
//		}
		
		for (int i = 0; i < peoArr.length; i++) {
			System.out.println(String.format("%.3f", peoArr[i])+"%");
		}
	}

}

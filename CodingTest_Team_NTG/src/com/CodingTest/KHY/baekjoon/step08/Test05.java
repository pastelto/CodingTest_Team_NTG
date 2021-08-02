package com.CodingTest.KHY.baekjoon.step08;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int num = sc.nextInt();
		
		int[][] arr = new int[num][3];
		int[] result = new int[num];
		
		for(int i=0;i<arr.length;i++) {
			arr[i][0]=sc.nextInt(); //H 호텔 층 수
			arr[i][1]=sc.nextInt(); //W 각층 방 수
			arr[i][2]=sc.nextInt(); //N 몇 번째 손님
		}

		// 1번 라인 먼저 입실 후 2번 라인 입실
		// N/H=>몫은 완벽하게 입실된 라인 수 => 나머지 있는 경우 방 넘버는 몫+1
		// N%H=>마지막 라인에서 입실한 층 수
		
		for(int i=0;i<arr.length;i++) {
			if((arr[i][2]%arr[i][0])==0) {
				result[i] = arr[i][0]*100 + (arr[i][2]/arr[i][0]);
			}else {
				result[i] = (arr[i][2]%arr[i][0])*100 + (arr[i][2]/arr[i][0])+1;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(result[i]);
		}
		
		
	}

}

package com.CodingTest.KSW.baekjoon.step8;

import java.util.Scanner;

public class Hive {

	public static void main(String[] args) {
		/* 육각형으로 이루어진 벌집이 있다.
		 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다. 
		 숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오. 
		 예를 들면, 13까지는 3개, 58까지는 5개를 지난다.*/
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int cnt = 1; // 최소루트 
		int range = 2; // 범위 (최솟값 기준) 
		
		if(n==1) {
			System.out.println(1);
		}
		else {
			while(range <= n) { // 범위가 n이 될 때까지 반복
				range = range + (6 * cnt); // 범위를 다음 범위 최솟값으로 초기화 
				cnt++;
			}
			System.out.println(cnt);
		}

	}

}

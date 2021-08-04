package com.CodingTest.KSW.baekjoon.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Snail {

	public static void main(String[] args) throws IOException{
		/* 땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
		   달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.
		   달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.*/
		
		/*Scanner sc = new Scanner(System.in);

		int up = sc.nextInt();
		int down = sc.nextInt();
		int length = sc.nextInt();
		
		int day = (length - down) / (up-down);
		
		// 하루에 꼭대기까지 올라가지 못했을 경우 
		if((length-down)% (up-down) != 0) {
			day++; 
		}
		System.out.print(day);*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int length = Integer.parseInt(st.nextToken());
		
		int day = (length - down) / (up - down);
		if((length-down)%(up-down)!=0) {
			day++;
		}
		System.out.println(day);
	}
}

package com.CodingTest.KSW.baekjoon.step8;

import java.util.Scanner;

public class FlyMeToTheAlphaCenturi {

	public static void main(String[] args) {
		/* 이전 작동시기에 k광년을 이동하였을 때는 k-1 , k 혹은 k+1 광년만을 다시 이동할 수 있다. 
		 * 예를 들어, 이 장치를 처음 작동시킬 경우 -1 , 0 , 1 광년을 이론상 이동할 수 있으나 사실상 음수 혹은 0 거리만큼의 이동은 의미가 없으므로 1 광년을 이동할 수 있으며, 
		 * 그 다음에는 0 , 1 , 2 광년을 이동할 수 있는 것이다. ( 여기서 다시 2광년을 이동한다면 다음 시기엔 1, 2, 3 광년을 이동할 수 있다. )
		 * 김우현은 공간이동 장치 작동시의 에너지 소모가 크다는 점을 잘 알고 있기 때문에 x지점에서 y지점을 향해 최소한의 작동 횟수로 이동하려 한다. 
		 * 하지만 y지점에 도착해서도 공간 이동장치의 안전성을 위하여 y지점에 도착하기 바로 직전의 이동거리는 반드시 1광년으로 하려 한다.*/
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt(); // 테스트 케이스
		
		for(int i = 0 ; i < t; i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int distance = y-x;
			
			int max = (int)Math.sqrt(distance); // 거리의 루트갑에서 소수점은 버린다.
			
			if(max == Math.sqrt(distance)) {
				System.out.println(max*2-1);
			}
			else if(distance <= max * max + max) {
				System.out.println(max * 2);
			}
			else {
				System.out.println(max * 2 + 1);
			}
			
		}

	}

}

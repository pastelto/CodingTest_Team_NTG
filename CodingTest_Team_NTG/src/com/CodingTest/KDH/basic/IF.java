package com.CodingTest.KDH.basic;

import java.sql.Time;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class IF {

	public void if01() {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a > b) {
			System.out.println(">");
		} else if (a < b) {
			System.out.println("<");
		} else if (a == b) {
			System.out.println("==");
		}
	}

	public void if02() {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		if (0 <= a && a <= 100) {
			if (a >= 90) {
				System.out.println("A");
			} else if (a >= 80) {
				System.out.println("B");
			} else if (a >= 70) {
				System.out.println("C");
			} else if (a >= 60) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
		}

	}

	public void if03() {

		// 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.

		Scanner sc = new Scanner(System.in);

		int year = sc.nextInt();

		if (year % 4 == 0) {
			if (year % 400 == 0 || year % 100 != 0) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		} else {
			System.out.println(0);
		}

	}
	
	public void if04() {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x > 0) {
			if(y > 0) {
				System.out.println(1);
			} else if(y < 0) {
				System.out.println(4);
			}
		} else if(x < 0) {
			if(y > 0) {
				System.out.println(2);
			} else if(y < 0) {
				System.out.println(3);
			}
		}
	}
	
	public void if05() {
		/* 상근이는 매일 아침 알람을 듣고 일어난다. 알람을 듣고 바로 일어나면 다행이겠지만, 항상 조금만 더 자려는 마음 때문에 매일 학교를 지각하고 있다.
		상근이는 모든 방법을 동원해보았지만, 조금만 더 자려는 마음은 그 어떤 것도 없앨 수가 없었다.
		이런 상근이를 불쌍하게 보던, 창영이는 자신이 사용하는 방법을 추천해 주었다.
		바로 "45분 일찍 알람 설정하기"이다.
		이 방법은 단순하다. 원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것이다. 
		어차피 알람 소리를 들으면, 알람을 끄고 조금 더 잘 것이기 때문이다. 
		이 방법을 사용하면, 매일 아침 더 잤다는 기분을 느낄 수 있고, 학교도 지각하지 않게 된다.
		현재 상근이가 설정한 알람 시각이 주어졌을 때, 창영이의 방법을 사용한다면, 이를 언제로 고쳐야 하는지 구하는 프로그램을 작성하시오. */
		
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		int nMin = 0;
		while(min >= 0 && min < 60 && hour >= 0 && hour < 24) { // 시간제한
			if(min < 45) {
				if(hour == 0) { // 자정일 때
					hour = 23;
				}
				nMin = 60 + (min - 45); 
				
				break;
			} else if (min >= 45 && min < 60) {
				nMin = min - 45;
				break;
		}
	} System.out.println(hour + "시 " + nMin + "분");
	}
}

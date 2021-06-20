package com.CodingTest.KHY.baekjoon.step04;

/*EOF 활용 문제!*/

/*
 
	Scanner 클래스 EOF에 hasNext() 사용
	입력된 토큰이 있으면 true 아니면 false
	
	while(sc.hasNextLine()){
	//내용
	 }
 
	while(sc.hasNext()){
	 //내용
	}
	 
	while(sc.hasNextInt()){
	 //내용
	}
  
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> listNum1 = new ArrayList<Integer>();
		ArrayList<Integer> listNum2 = new ArrayList<Integer>();

		while (sc.hasNextInt()) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			listNum1.add(num1);
			listNum2.add(num2);
		}
		int i = 0;

		while (i < listNum1.size()) {
			System.out.println(listNum1.get(i) + listNum2.get(i));
			i++;
		}

	}

}

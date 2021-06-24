package com.CodingTest.KSW.baekjoon.step6;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class SelfNumber {

	public static void main(String[] args) {
		/*마치 피보나치 수열처럼 특정한 방식으로 수열을 만든다.
		n(123)=123+1+2+3=129이다. 이때 123을 129의 생성자라고 부른다.
		1~10000의 수 중에 생성자가 없는 수(셀프 넘버가 아닌 수)를 한 줄에 하나씩 출력한다.*/
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean selfNums[] = new boolean[10001]; // 배열 인덱스 활용을 위한 
		
		for(int i=1; i <= 10000; i++) { // 1~10000 반복
			int value = d(i); // d 함수 리턴값 활용 
			if(value <= 10000) { // 최대값 10000 이하일 경우 
				selfNums[value] = true; // d함수의 리턴값을 지정한 value 
			}
		}
		try {
			for(int i = 1; i <= 10000; i++) {
				if(!selfNums[i])// 셀프넘버가 아닐 경우 
					bw.write(String.valueOf(i)+"\n");
			}
		} catch (Exception e) {			
		} finally {
			try {
				 if(bw != null) {
					 bw.flush();
					 bw.close();
				 }
			}catch (Exception e2) {
				
			}
		}

	
	}

	private static int d(int x) { // 셀프넘버 구하기 
		int result = x;
		while (true) {
			if(x == 0)
				break;
			result += x % 10; // 자릿수의 값 더하기
			x = x / 10;
		}
		return result;
	}
}

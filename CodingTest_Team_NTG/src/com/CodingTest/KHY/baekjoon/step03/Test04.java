package com.CodingTest.KHY.baekjoon.step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Test04 { /*꼭 나중에 다시 풀어보기!!!!!!*/

	public static void main(String[] args) {
		/*BufferedReader, BufferedWriter 사용*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		try {
			int size = Integer.parseInt(br.readLine());
			
			for(int i = 0; i<size;i++) {
				
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				int num1 = Integer.parseInt(st.nextToken());
				int num2 = Integer.parseInt(st.nextToken());
				
				int sum = num1 + num2;
				
				bw.write(sum+" ");
				bw.newLine();
			}
			bw.flush();
		
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

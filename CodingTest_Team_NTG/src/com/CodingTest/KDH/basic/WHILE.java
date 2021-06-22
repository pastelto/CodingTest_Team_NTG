package com.CodingTest.KDH.basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class WHILE {

	public void W01() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			int num = sc.nextInt();
			int num1 = sc.nextInt();

			if (num == 0 && num1 == 0) {
				return;
			} else {

				int sum = num + num1;
				System.out.println(sum);

			}
		}
	}

	public void W02() {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {

			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.println(a + b);

		}

	}
	
	public void W03() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int ori = num;
		int count = 1;
		
		try {
			while (num > 0) {
			
				int num10 = (num % 10) * 10; // 주어진 수의 가장 오른쪽 자리
				int num1 = ((num / 10) + (num % 10)) % 10; // 나머지

				num = num10 + num1;
				
				if(num == ori) {
					break;
				}
				count++;
			}
			
		} catch (NumberFormatException e) {
			
		}
		bw.write("count : " + String.valueOf(count));
		bw.flush();
		br.close();
		bw.close();
		}

	}
	



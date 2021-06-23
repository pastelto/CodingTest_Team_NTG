package com.CodingTest.KDH.basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public void ARRAY01() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num;
		try {
			num = Integer.parseInt(br.readLine());
			int[] arr = new int[num];
			int iNum = 0;

			for (int i = 0; i < num; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}

			for (int j = 1; j < num; j++) {
				for (int k = 0; k < j; k++) {
					if (arr[j] < arr[k]) {
						iNum = arr[j];
						arr[j] = arr[k];
						arr[k] = iNum;
					}
				}
			}
			bw.write(arr[0] + " " + arr[num - 1]);
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		bw.flush();
		br.close();
		bw.close();
	}

	public void ARRAY02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int[] arr = new int[9];
			int max = 0; // 가장 큰 값
			int num = 0;

			for (int i = 0; i < 9; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}

			for(int i=0; i<9; i++) {
				if(max < arr[i]) { 
					max = arr[i]; 
					num = i + 1;
					
				} 
			}
			
			bw.write("max : " + max);
			bw.write("count : " + num);
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		bw.flush();
		br.close();
		bw.close();
		
	}
	
	public void ARRAY03() throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int count = 0;
//		try {
//			int num = (Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()));
//			String str = Integer.toString(num);
//			
//			
//			for(int i = 0; i < 10; i++ ) {
//				count = 0;
//				for(int j = 0; j < str.length(); j++) {
//					if((str.charAt(j)-'0') == i) {
//						count ++;
//					}
//				}
//
//				bw.write(count);
//				
//			}
//		} catch (NumberFormatException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//
//		
//		br.close();
//		bw.close();
//	
		
		Scanner sc = new Scanner(System.in);

		int num = (sc.nextInt() * sc.nextInt() * sc.nextInt());
		String str = Integer.toString(num);

		for(int i = 0; i < 10; i++ ) {
			int count = 0;
			for(int j = 0; j < str.length(); j++) {
				if((str.charAt(j)-'0') == i) {
					count ++;
				}
			}

			System.out.println(count);
		}
	}
	
	
	public void ARRAY04() { // X
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int count = 10;
		int index = 0;
		
			for(int i = 0; i < 10; i++) {
				int a = sc.nextInt();
				arr[i] = a % 42;
				System.out.println("arr[" + i + "] : " + arr[i]);
		
			}
			
			for(int j = 1; j < 10; j++) {
				if(arr[index++] == arr[j]) {
					count--;
				}
			}
			
			System.out.println(count);

	}
	
	public void ARRAY04_1() {
		
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[10]; // 10개의 값이 담기는 배열
		int count = 0;
		String mod[] = new String[10]; // 나머지 값이 담기는 곳
		ArrayList<String> list = new ArrayList<>();

		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt(); 
			mod[i] = Integer.toString(arr[i] % 42); // 42로 나눈 나머지
		}

		for(String rm : mod) { // 나머지 값이 담긴 길이만큼 돌림
			if(!list.contains(rm)) { // 
				list.add(rm);
			}
		}
		System.out.println(list.size());
	}
	
	public void ARRAY05() {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); // 과목 수 
		int max = 0; // 최대값이 담길 곳
		int n;
		int count = 0;
		double sum = 0;
		double[] arr = new double[num]; // 성적이 담길 배열
		double[] newScore = new double[num]; // 새로운 성적이 담길 곳
		
		
		for(int i = 0; i < num; i++) {
			
			arr[i] = sc.nextInt(); // 성적이 담김	
		}
		
//		for (int j = 1; j < num; j++) { // 점수 중 최소~최대값 순으로 (2)
//			for (int k = 0; k < j; k++) {
//				if (arr[j] < arr[k]) {
//					n = arr[j];
//					arr[j] = arr[k];
//					arr[k] = n;
//				}
//			}
//		}
		
		Arrays.sort(arr); // 배열 순서대로 정리 (1)
		
		for(int k = 0; k < num; k++) {
//			System.out.println("arr : " + arr[count]);
			newScore[k] = arr[count++]/arr[num-1]*100;
//			System.out.println("점수 " + newScore[k]);
		}
		
		for(int i = 0; i < num; i++) {
			sum += newScore[i];
//			System.out.println("sum : " + sum);
		}
//		System.out.println("sum : " + sum);
//		System.out.println("num : " + num);
		System.out.println(sum/num);
		
	}
	
	public void ARRAY06() {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String[] arr = new String[num]; // 갯수만큼 배열크기 지정

		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.next(); // O 아니면 X
		}

		for(int i = 0; i < arr.length; i++) {
			int count = 0; // O가 연속으로 나오는 횟수
			int sum = 0; // 누적점수

			for(int j = 0; j <arr[i].length();j++) {

				if(arr[i].charAt(j) == 'O') {
					count++; // O가 연속으로 나오면 count++;
				}
				else {
					count = 0; // X가 나오면 count = 0 으로 다시 셋팅
				}
				sum += count; 
			}

			System.out.println(sum);
		}

	}


}
		
		
	


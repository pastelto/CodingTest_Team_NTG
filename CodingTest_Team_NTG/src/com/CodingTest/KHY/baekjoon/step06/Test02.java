package com.CodingTest.KHY.baekjoon.step06;

import java.util.ArrayList;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println((12345 / 10000)); //1
//		System.out.println((12345 % 10000)/1000); //2
//		System.out.println((12345 % 1000)/100); //3
//		System.out.println((12345 % 100)/10); //4
//		System.out.println((12345 % 10)/1); //5
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		for (int i = 1; i <= 10000; i++) {
				list.add(i + (i / 10000)+((i % 10000)/1000)+((i % 1000)/100)+((i % 100)/10)+((i % 10)/1));
			
		}
		
		int arr[] = new int[10001];
		for(int i = 0;i<arr.length;i++) {
			arr[i]=i;
		}
		
		for(int i = 0; i<list.size();i++) {
			for(int j=0;j<arr.length;j++) {
				if(list.get(i)==arr[j]) {
					arr[j] = 0;
				}
			}
		}
		
		for(int i = 0; i<list.size();i++) {
			if(arr[i]!=0) {
				System.out.println(arr[i]);
			}
		}
		
	}

}

package com.CodingTest.KMG.run;

public class Step6 { //함수 
	//백준 15596문제 
	class Test{
		long sum(int[] a) {
			long sum = 0;
			
			for(int i =0; i<a.length;i++) {
				sum += a[i];
			}
			return sum;
		}
	}
	//백준 4673문제 
	public static void main(String[] args) {
		boolean[] check = new boolean[10001];
		
		for(int i =1; i < 10001; i++) {
			int n = d(i);
			if(n < 10001) {
				check[n] = true;
			}
		}
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i < 10001; i++) {
			if(!check[i]) {
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
		
		
		
	}
	
	public static int d (int number) {
		int sum = number;
		
		while(number != 0) {
			sum = sum + (number % 10);
			number = number/10;
		}
		return sum;
	}
}

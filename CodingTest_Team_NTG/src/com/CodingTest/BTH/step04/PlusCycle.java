package com.CodingTest.BTH.step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlusCycle {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int conut = 0;
		int copy = N;
		
		do {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			conut++;
		}while(copy != N);
		
		System.out.println(conut);

	}

}

package com.CodingTest.KSW.baekjoon.step6;

public class Nsum {

	public static long sum(int[] a) {
		
		long total = 0;
		
		for(int i = 0; i < a.length; i++) {
			total += a[i];
		}
		return total;
	}

}

package com.CodingTest.KHY.baekjoon.step06;

//정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
//long sum(int[] a); 메소드로 함수 구현

public class Test01 {

	long sum(int[] a) {
        long ans = 0;
        
        for(int i=0;i<a.length;i++) {
        	ans+=a[i];
        }
        return ans;
    }

}


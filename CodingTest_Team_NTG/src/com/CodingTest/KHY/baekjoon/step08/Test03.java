package com.CodingTest.KHY.baekjoon.step08;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1/1 ->  //1
//		1/2 -> 2/1 ->  //2->3
//		3/1 -> 2/2 -> 1/3 ->  //3->6
//		1/4 -> 2/3 -> 3/2 -> 4/1 ->  //4->10
//		5/1 -> 4/2 -> 3/3 -> 2/4 ->1/5->  //5->15
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//등차 수열: n(n+1)/2

		int sum = 0;
		int n = 0;
		while(sum < num) {
			n++;
			sum = n*(n+1)/2;
		}
		
		//n-1번까지의 합
		int sum1 = ((n-1)*n)/2;
		int count = num - sum1;
		
		//홀수인 경우 분자가 n->n-1->...->1
		//홀수인 경우 분모가 1->2->...->n
		
		int top = 0;
		int down = 0;
		
		if(n%2 == 1) {
			top = n - count + 1;
			down = count;
		}
		
		//짝수인 경우 분자가 1->2->...->n
		//짝수인 경우 분모가 n->n-1->...->1
		else if(n%2 == 0) {
			top = count;
			down = n - count + 1;
		}
		
		System.out.println(top+"/"+down);
	}

}

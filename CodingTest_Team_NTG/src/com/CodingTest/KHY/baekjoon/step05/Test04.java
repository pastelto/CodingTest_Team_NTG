package com.CodingTest.KHY.baekjoon.step05;

//두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
//
//수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int[] modArr = new int[42];
		
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}

		for(int i=0;i<modArr.length;i++) {
			modArr[i] = 0;
		}
		for(int i=0;i<modArr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i==arr[j]%42) { //modArr 인덱스가 나머지랑 같은 값이면 0->1로 바꿈 
					modArr[i]=1;
				}
			}
		}
		int count = 0;
		for(int i=0;i<modArr.length;i++) {
			if(modArr[i] != 0) { //modArr 값이 0이 아닌것의 개수를 셈
				count++;
			}
		}
		System.out.println(count);
	}

}


/*
  
//이코드 공부하기!  

//HashSet은 중복이 불가능함


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> set = new HashSet<Integer>();
        int[] arr = new int[10];

        for(int i=0; i<10; i++){
            arr[i] = Integer.parseInt(br.readLine());
            set.add(arr[i]%42); //중복되는 값은 한번만 담긴다.
        }

        System.out.println(set.size());
    }
}

*/
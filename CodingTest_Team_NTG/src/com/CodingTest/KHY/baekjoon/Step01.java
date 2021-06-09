package com.CodingTest.KHY.baekjoon;

import java.util.Scanner;

public class Step01{
	//2021-06-07
	public void test1(){
		System.out.println("Hello World!");
	}
	public void test2() {
		System.out.println("강한친구 대한육군");
		System.out.println("강한친구 대한육군");
	}
	public void test3() {
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
	}
	//2021-06-08
	public void test4() {
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
	}
	public void test5() {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a+b);
	}
	public void test6() {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a-b);
	}
	//2021-06-09
	public void test7() {
		//두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a*b);
	}
	public void test8() {
		//두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a/b);
	}
	public void test9() {
		//두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}
}

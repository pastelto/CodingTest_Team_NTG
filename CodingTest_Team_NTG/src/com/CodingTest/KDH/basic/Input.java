package com.CodingTest.KDH.basic;

import java.util.Scanner;

public class Input {

	  public void input01() {// 백준 문제 제출 형식 (가운데 static 꼭 필수로 적어주기!)
		  //Hello World!를 출력하시오.
		        System.out.println("Hello World!");
		}
	  
	  public void input02() {
		  //대회를 뜰 줄 모르는 지박령 kriii를 위해서 격려의 문구를 출력해주자.
			  System.out.println("강한친구 대한육군");
			  System.out.println("강한친구 대한육군");
		  
	  }
	  
	  public void input03(){
		  //아래 예제와 같이 고양이를 출력하시오.
		  	System.out.println("\\    /\\");
			System.out.println(" )  ( ')");
			System.out.println("(  /  )");
			System.out.println(" \\(__)|");
			
	  }
	  
	  public void input04() {
		  //아래 예제와 같이 개를 출력하시오.
		  System.out.println("|\\_/|");
			System.out.println("|q p|   /}");
			System.out.println("( 0 )\"\"\"\\");
			System.out.println("|\"^\"`    |");
			System.out.println("||_/=\\\\__|");
	  }
	
	  public void input05() { 
		  //두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
			  	Scanner sc = new Scanner(System.in);
			  	int a = sc.nextInt();
			  	int b = sc.nextInt();
			  	
			  	int c = a + b;
			  	System.out.println(c);
			  }
	  
	  public void input06() {
		  //두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
		  		Scanner sc = new Scanner(System.in);	
		  		int a;
		  		int b;
		  		a = sc.nextInt();
		  		b = sc.nextInt();		
		  		System.out.println(a-b);
	  }
	  
	  public void input07() {
		  //두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.
		          Scanner sc = new Scanner(System.in);
		  			  	int a = sc.nextInt();
		  			  	int b = sc.nextInt();
		  			  	
		  			  	System.out.println(a*b);
		      }
	
	  public void input08() {
		  //두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
		         Scanner sc = new Scanner(System.in);
		  		        int a = sc.nextInt();
		  		        int b = sc.nextInt();
		  		System.out.println(a/b);
		      }
		 
	  public void input09() {
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

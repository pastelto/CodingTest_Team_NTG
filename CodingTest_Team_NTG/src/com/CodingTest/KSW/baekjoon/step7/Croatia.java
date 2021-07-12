package com.CodingTest.KSW.baekjoon.step7;

import java.util.Scanner;

public class Croatia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int count = 0;
		
		for(int i = 0; i < str.length(); i ++) {
			char ch = str.charAt(i);
			
			if(ch == 'c') {
				if(i < str.length()-1) {
					if(str.charAt(i+1) == '=') {
						i++; // i+1 까지가 하나의 문자
					}
					else if(str.charAt(i+1)=='-') {
						i++;
					}
				}
			}
			else if(ch == 'd') {
				if(i < str.length()-1) {
					if(str.charAt(i+1)=='z') {
						if(i < str.length()-2) {
							if(str.charAt(i+2)== '=') { // dz= 일 경우 
								i += 2;
							}
						}
					}
					else if(str.charAt(i+1)=='-') {
						i++;
					}
				}
			}
			else if(ch == 'l') {
				if(i <str.length()-1) {
					if(str.charAt(i+1) == 'j') { //lj
						i++;
					}
				}
			}
			else if(ch == 'n') {
				if(i < str.length()-1) {
					if(str.charAt(i+1) == 'j') { // nj
						i++;
					}
				}
			}
			else if(ch == 's') {
				if(i < str.length()-1) {
					if(str.charAt(i+1) == '=') { //s=
						i++;
					}
				}
			}
			else if(ch == 'z') {
				if(i <str.length()-1) {
					if(str.charAt(i+1) == '=') { //z=
						i++;
					}
				}
			}
			count++;
		}		
		System.out.println(count);
	}
}

package com.CodingTest.KHY.baekjoon.step07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test06 {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		try {
			String str = br.readLine();
			ArrayList<String> list = new ArrayList<String>();
			
			StringTokenizer st = new StringTokenizer(str);
			
			while(st.hasMoreTokens()) {
				list.add(st.nextToken());
			}
			
			System.out.println(list.size());
					
					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}

}

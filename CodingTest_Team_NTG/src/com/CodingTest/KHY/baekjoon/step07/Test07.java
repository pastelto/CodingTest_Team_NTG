package com.CodingTest.KHY.baekjoon.step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test07 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = new String[2];
		int answer[] = new int[2];
		try {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);

			while (st.hasMoreTokens()) {
				for (int i = 0; i < arr.length; i++) {
					arr[i] = st.nextToken();
				}
			}

			for (int i = 0; i < arr.length; i++) {
				String restr = "";
				for (int j = arr[i].length() - 1; j >= 0; j--) {
					restr += arr[i].charAt(j);
				}
				answer[i] = Integer.parseInt(restr);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Math.max(answer[0], answer[1]));
	}

}

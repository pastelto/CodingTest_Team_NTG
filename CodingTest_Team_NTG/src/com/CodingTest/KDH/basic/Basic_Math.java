package com.CodingTest.KDH.basic;

import java.io.IOException;
import java.util.Scanner;

public class Basic_Math {

	public void bm01() throws NumberFormatException, IOException {

		// 방법 1 -> Integer.parseInt의 범위는 2^31-1까지라서 NumberFormat 에러발생
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		int fc = Integer.parseInt(br.readLine());
//		int vc = Integer.parseInt(br.readLine());
//		int p = Integer.parseInt(br.readLine());
//		int bep;
//		int num = -1;
//
//		for (int n = 0; n < 210000001; n++) {
//
//			bep = (p * n) - fc - (vc * n);
//
//			if (bep > 0) {
//				System.out.println(n);
//				break;
//			} else if (n == 210000000 && bep < 0) {
//				System.out.println(num);
//			} else {
//				continue;
//			}
//		}

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		if (num2 >= num3) {
			System.out.println(-1);
		} else {
			System.out.println(num1 / (num3 - num2) + 1);
		}
	}

}

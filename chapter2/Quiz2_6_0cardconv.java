package chapter2;

import java.util.Scanner;

public class Quiz2_6_0cardconv {
	static int cardConv(int x, int r, char[] d) {
		int digits = 0; // 자릿수

		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[digits++] = dchar.charAt(x % r); // r로 나눈 나머지를 저장
			x /= r;
		} while (x != 0);
		for (int i = 0; i < digits / 2; i++) {
			char temp = d[i];
			d[i] = d[digits - i -1];
			d[digits - i -1] = temp;
		}
		return digits;
	}
	
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int num;
		int cd;
		int dno; // 변환후 자릿수 
		int selection;
		int retry;
		char[] cno = new char[32];

		System.out.println("10진수를 기수 변환합니다.");
		do {
			do {
				System.out.println("변환하는 음이 아닌 정수:");
				num = sc.nextInt();

			} while (num<0);

			do {
				System.out.println("어떤 진수로 변환할까요?(2~36)");
				cd = sc.nextInt();
			} while (cd<2 || cd>36);
			
//			System.out.println("0. 순서대로 배열할까요, 1. 역순으로 배열할까요?");
//			selection = sc.nextInt();
			 
			dno = cardConv(num, cd, cno);
		
			System.out.println(cd+"진수로는 ");
			for (int i = 0; i < dno; i++) {
				System.out.print(cno[i]);
			}
			System.out.println("입니다.");

			System.out.println("한번 더할까요? 1. 예 / 0. 아니오");
			retry = sc.nextInt();

		}while(retry == 1);
	}

}

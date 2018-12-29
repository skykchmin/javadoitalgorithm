package chapter2;

import java.util.Scanner;

public class Quiz2_6_0cardconv {
	static int cardConv(int x, int r, char[] d) {
		int digits = 0; // �ڸ���

		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[digits++] = dchar.charAt(x % r); // r�� ���� �������� ����
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
		int dno; // ��ȯ�� �ڸ��� 
		int selection;
		int retry;
		char[] cno = new char[32];

		System.out.println("10������ ��� ��ȯ�մϴ�.");
		do {
			do {
				System.out.println("��ȯ�ϴ� ���� �ƴ� ����:");
				num = sc.nextInt();

			} while (num<0);

			do {
				System.out.println("� ������ ��ȯ�ұ��?(2~36)");
				cd = sc.nextInt();
			} while (cd<2 || cd>36);
			
//			System.out.println("0. ������� �迭�ұ��, 1. �������� �迭�ұ��?");
//			selection = sc.nextInt();
			 
			dno = cardConv(num, cd, cno);
		
			System.out.println(cd+"�����δ� ");
			for (int i = 0; i < dno; i++) {
				System.out.print(cno[i]);
			}
			System.out.println("�Դϴ�.");

			System.out.println("�ѹ� ���ұ��? 1. �� / 0. �ƴϿ�");
			retry = sc.nextInt();

		}while(retry == 1);
	}

}

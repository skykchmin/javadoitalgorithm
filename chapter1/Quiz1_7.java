package chapter1;

import java.util.Scanner;

public class Quiz1_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ��Ÿ���� ���� n�� ���� �Է����ּ���");
		int n = sc.nextInt();
		int result = 0; 
		for (int i = 1; i <= n; i++) {
			result += i;
		}
		System.out.println("1���� n������ ��:" + result);
	}

}

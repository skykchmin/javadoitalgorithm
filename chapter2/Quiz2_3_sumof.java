package chapter2;

import java.util.Scanner;

public class Quiz2_3_sumof {
	static int sumof(int[] a) {
		int result = 0;
		
		for (int i = 0; i < a.length; i++) {
			result +=a[i];	
		}
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ������ �Է����ּ���");
		int num = sc.nextInt();
		int[] a = new int[num];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("��Ҹ� �Է����ּ���:");
			a[i] = sc.nextInt();
		}
		System.out.println("��� ����� ����" + sumof(a));
	}

}

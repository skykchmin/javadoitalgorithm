package chapter2;

import java.util.Scanner;

public class Quiz2_4_copyarray {
	static void copy(int[] a, int[] b) {
		for (int i = 0; i < b.length; i++) {
			a[i] = b[i];
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�迭 b�� ����� ������ �Է��ϼ���:");
		
		int num = sc.nextInt();
		int[] b = new int[num];
		int[] a = new int[num];
		
		for (int i = 0; i < b.length; i++) {
			System.out.println("��Ҹ� �Է��ϼ���");
			b[i] = sc.nextInt();
		}
		
		copy(a,b);
	}

}

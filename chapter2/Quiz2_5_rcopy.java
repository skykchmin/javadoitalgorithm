package chapter2;

import java.util.Scanner;

public class Quiz2_5_rcopy {
	static void rcopy(int[] a, int[] b) {
		int num = a.length <= b.length ? a.length : b.length;
		for (int i = 0; i < num; i++)
			a[i] = b[b.length - i - 1];
	}
	
	static void copy(int[] a, int[] b) {
		for (int i = 0; i < b.length; i++) {
			a[i] = b[i];
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
		
		rcopy(a,b);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}

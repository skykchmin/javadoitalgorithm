package chapter5;

import java.util.Scanner;

public class Quiz5_2_gcd {
	static int gcd(int x, int y) {
		
		while (y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
			return (x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ���� �ִ������� ���մϴ�");
		
		System.out.println("������ �Է��ϼ���:");
		int x = sc.nextInt();
		System.out.println("������ �Է��ϼ���:");
		int y = sc.nextInt();
		
		System.out.println("�ִ�������" + gcd(x,y) + "�Դϴ�");
	}

}

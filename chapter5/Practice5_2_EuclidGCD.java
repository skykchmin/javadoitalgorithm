package chapter5;

import java.util.Scanner;

public class Practice5_2_EuclidGCD {
	static int gcd(int x, int y) {
		if(y ==0 )
			return x;
		else 
			return gcd(y, x% y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ������ �ִ� ������� ���մϴ�");
		
		System.out.println("������ �Է��ϼ���:");
		int x = sc.nextInt();
		System.out.println("������ �Է��ϼ���:");
		int y = sc.nextInt();
		
		System.out.println("�ִ� �������"+ gcd(x,y) + "�Դϴ�.");
	}

}

package chapter5;

import java.util.Scanner;

public class Practice5_1_Factorial {

	static int factorial(int n) {
		if(n > 0 )
			return n * factorial(n-1);
		else
			return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���:");
		int x = sc.nextInt();
		
		System.out.println(x+ "�� ���丮����" + factorial(x) + "�Դϴ�.");
	}

}

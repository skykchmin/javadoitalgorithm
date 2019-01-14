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
		
		System.out.println("두 개의 최대공약수를 구합니다");
		
		System.out.println("정수를 입력하세요:");
		int x = sc.nextInt();
		System.out.println("정수를 입력하세요:");
		int y = sc.nextInt();
		
		System.out.println("최대공약수는" + gcd(x,y) + "입니다");
	}

}

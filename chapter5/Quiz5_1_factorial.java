package chapter5;

import java.util.Scanner;

public class Quiz5_1_factorial {
	static int factorial(int x) {
		int result = 1;
		for (int i = 1; i <= x; i++) 
			 result *= i;
		return result; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요:");
		int x = sc.nextInt();
		
		System.out.println(x + "의 팩토리얼은" + factorial(x)+"입니다");
	}

}

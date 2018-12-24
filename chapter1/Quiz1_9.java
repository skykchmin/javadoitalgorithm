package chapter1;

import java.util.Scanner;

public class Quiz1_9 {
		static int sumof(int a, int b) {
			int min; // a, b의 작은 쪽의 값
			int max; // a, b의 큰 쪽의 값

			if (a < b) {
				min = a;
				max = b;
			} else {
				min = b;
				max = a;
			}

			int sum = 0; // 합
			for (int i = min; i <= max; i++)
				sum += i;
			return (sum);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("a를 입력해주세요 ");
		int a = sc.nextInt();
		System.out.println("b를 입력해주세요 ");
		int b = sc.nextInt();

		System.out.println(sumof(a,b));
	}


}

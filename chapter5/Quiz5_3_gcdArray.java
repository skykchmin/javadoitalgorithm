package chapter5;

import java.util.Scanner;

public class Quiz5_3_gcdArray {
	static int gcd(int x, int y) {
		while (y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		return (x);
	}

	// 요솟수 n인 배열 a의 모든 요소의 최대 공약수를 구합니다.
	static int gcdArray(int a[], int start, int no) {
		if (no == 1)
			return a[start];
		else if (no == 2)
			return gcd(a[start], a[start + 1]);
		else
			return gcd(a[start], gcdArray(a, start + 1, no - 1));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 몇 개의 최대 공약수를 구할까요?：");
		int num;
		do {
			num = sc.nextInt();
		} while (num <= 1);

		int[] x = new int[num]; // 길이 num인 배열

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = sc.nextInt();
		}

		System.out.println("최대 공약수는 " + gcdArray(x, 0, num) + "입니다.");
	}
}
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
		System.out.println("배열 b의 요소의 갯수를 입력하세요:");
		
		int num = sc.nextInt();
		int[] b = new int[num];
		int[] a = new int[num];
		
		for (int i = 0; i < b.length; i++) {
			System.out.println("요소를 입력하세요");
			b[i] = sc.nextInt();
		}
		
		copy(a,b);
	}

}

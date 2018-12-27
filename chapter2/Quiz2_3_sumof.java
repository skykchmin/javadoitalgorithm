package chapter2;

import java.util.Scanner;

public class Quiz2_3_sumof {
	static int sumof(int[] a) {
		int result = 0;
		
		for (int i = 0; i < a.length; i++) {
			result +=a[i];	
		}
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("요소의 개수를 입력해주세요");
		int num = sc.nextInt();
		int[] a = new int[num];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("요소를 입력해주세요:");
			a[i] = sc.nextInt();
		}
		System.out.println("모든 요소의 합은" + sumof(a));
	}

}

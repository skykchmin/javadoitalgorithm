package chapter5;

import java.util.Scanner;

public class Quiz5_4_recur2 {

	static void recur2(int n) {
		if( n > 0) {
			recur2(n-2);
			System.out.println(n);
			recur2(n-1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int x = sc.nextInt();
		
		
		recur2(x);

	}

}

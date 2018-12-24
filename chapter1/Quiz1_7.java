package chapter1;

import java.util.Scanner;

public class Quiz1_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 나타내기 위해 n의 값을 입력해주세요");
		int n = sc.nextInt();
		int result = 0; 
		for (int i = 1; i <= n; i++) {
			result += i;
		}
		System.out.println("1부터 n까지의 합:" + result);
	}

}

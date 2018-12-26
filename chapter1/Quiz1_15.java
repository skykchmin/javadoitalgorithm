package chapter1;

import java.util.Scanner;

public class Quiz1_15 {
	static void triangleLB(int n) {
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형입니다.");

		for(int i =1; i<=n; i++) {
			for(int j =1; j<=i; j++ )
				System.out.print('*');
			System.out.println();

		}
	}
	static void triangleLU(int n) {
		System.out.println("왼쪽 위 가 직각인 이등변 삼각형입니다.");
		
		for (int i = 1; i <= n; i++) { 				
			for (int j = 1; j <= n - i + 1; j++) 	
				System.out.print('*');
			System.out.println(); 					
		}
	}
	static void triangleRU(int n) {
		System.out.println("오른쪽 위가 직각인 이등변 삼각형입니다.");

		for (int i = 1; i <= n; i++) { 				
			for (int j = 1; j <= i - 1; j++) 		
				System.out.print(' ');
			for (int j = 1; j <= n - i + 1; j++) 	
				System.out.print('*');
			System.out.println();					
		}
	}
	static void triangleRB(int n) {
		System.out.println("오른쪽 아래가 직각인 이등변 삼각형입니다.");
		
		for (int i = 1; i <= n; i++) { 				
			for (int j = 1; j <= n - i; j++) 		
				System.out.print(' ');
			for (int j = 1; j <= i; j++) 			
				System.out.print('*');
			System.out.println(); 					
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변 길이를 입력해주세요:");
		int n = sc.nextInt();

		triangleLB(n);
		triangleLU(n);
		triangleRU(n);
		triangleRB(n);
	}

}

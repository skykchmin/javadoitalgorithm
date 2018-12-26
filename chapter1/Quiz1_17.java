package chapter1;

import java.util.Scanner;

public class Quiz1_17 {
	static void spira(int n) {
		System.out.println("n단의 피라미드입니다");
		int dan=(n-1)*2+1;
		dan++;
		for(int i = 1; i<=n; i++) {
			for (int j = 1; j <= n - i + 1; j++) 		
				System.out.print(' ');
			for(int j=1; j<=(i-1)*2+1; j++) 
				System.out.print(i);
			System.out.println();

		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n단의 피라미드를 입력하세요:");
		int n = sc.nextInt();
		
		spira(n);
	}

}

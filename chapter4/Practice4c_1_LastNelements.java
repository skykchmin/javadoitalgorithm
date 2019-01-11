package chapter4;

import java.util.Scanner;

public class Practice4c_1_LastNelements {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = 10; 
		int[] a = new int[N];
		int cnt = 0;
		int retry;
		
		System.out.println("정수를 입력하세요.");
		
		do {
			System.out.printf("%d번쨰 정수:", cnt + 1);
			a[cnt++ % N] = sc.nextInt();
			
			System.out.println("계속 할까요? 예.1 / 아니오.0");
			retry = sc.nextInt();
		} while (retry == 1);

		int i = cnt - N;
		if( i<0)
			i=0;
		for (; i < cnt; i++) {
			System.out.printf("%2d번쨰의 정수 = %d\n", i+1, a[i % N]);
		}
	}

}

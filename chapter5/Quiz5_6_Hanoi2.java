package chapter5;

import java.util.Scanner;

public class Quiz5_6_Hanoi2 {

	static void move(int no, int x, int y) {
		if(no > 1)
			move(no - 1, x, 6-x-y);
		
		System.out.println("원반["+no+"]을"+ x + "기둥에서 " + x +"기둥으로 옮김");
		
		if(no > 1)
			move( no -1, 6 - x - y, y);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("하노이의 탑");
		System.out.println("원반 개수");
		int n = sc.nextInt();
		
		move(n,1,3);
	}

}

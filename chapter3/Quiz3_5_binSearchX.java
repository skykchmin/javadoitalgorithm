package chapter3;

import java.util.Scanner;

public class Quiz3_5_binSearchX {
	static int binSearchX(int[] a, int n, int key) {
		
		int pl = 0; // 맨 앞 
		int pr = n -1; // 맨 뒤
		
		do {
			int pc = (pl + pr) / 2;
			if(a[pc] == key) {
				for (; pc > pl; pc--) // key와 같은 맨 앞의 요소를 찾습니다
					if (a[pc - 1] < key) // pc-1에 들어있는 값이 key랑 달라지면 종료 
						break;
					return pc;
			}
			else if(a[pc] < key)
				pl = pc +1;
			else 
				pr = pc =1;
		} while (pl <= pr);
		
		return-1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.println("요소의 갯수를 입력해주세요:");
		int number = sc.nextInt();
		
		int[] a = new int[number];
		for (int i = 0; i < number; i++) {
			System.out.println("x[" + i + "]");
			a[i]= sc.nextInt();
		}
		System.out.println("찾을 요소를 선택해주세요");
		
		int key = sc.nextInt();
		int idx = binSearchX(a, number, key);
	}

}

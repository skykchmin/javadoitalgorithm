package chapter3;

import java.util.Scanner;

public class Quiz3_5_binSearchX {
	static int binSearchX(int[] a, int n, int key) {
		
		int pl = 0; // �� �� 
		int pr = n -1; // �� ��
		
		do {
			int pc = (pl + pr) / 2;
			if(a[pc] == key) {
				for (; pc > pl; pc--) // key�� ���� �� ���� ��Ҹ� ã���ϴ�
					if (a[pc - 1] < key) // pc-1�� ����ִ� ���� key�� �޶����� ���� 
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
		System.out.println("����� ������ �Է����ּ���:");
		int number = sc.nextInt();
		
		int[] a = new int[number];
		for (int i = 0; i < number; i++) {
			System.out.println("x[" + i + "]");
			a[i]= sc.nextInt();
		}
		System.out.println("ã�� ��Ҹ� �������ּ���");
		
		int key = sc.nextInt();
		int idx = binSearchX(a, number, key);
	}

}

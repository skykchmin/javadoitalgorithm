package chapter3;

import java.util.Scanner;

public class Practice3_1_SeqSearch {
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;
		
		while(true) {
			if(i == n)
				return -1;
			if(a[i]== key)
				return i;
			i++;
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��ڼ�:");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.println("x["+i+"]:");
			x[i] = sc.nextInt();
			
		}
		System.out.println("�˻��� ��:");
		int ky = sc.nextInt();
		int idx=seqSearch(x,num,ky);
		
		if(idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky+"��  x["+idx+"]�� �ֽ��ϴ�." );
	}

}

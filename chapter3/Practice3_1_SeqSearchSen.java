package chapter3;

import java.util.Scanner;

public class Practice3_1_SeqSearchSen {
	static int seqSearchsen(int[] a, int n, int key) {
		int i =0;
		
		a[n] = key;
		
		while(true) {
			if(a[i]==key)
				break;
			i++;
		}
		return i == n ? -1 : i;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��ڼ�:");
		int num = sc.nextInt();
		int[] x = new int[num+1]; // ��ҿ� num+1 �ϴ� ������ �����ִ� ���� �־��ֱ� ���ؼ�
		
		for (int i = 0; i < num; i++) {
			System.out.println("x["+i+"]:");
			x[i] = sc.nextInt();
			
		}
		System.out.println("�˻��� ��:");
		int ky = sc.nextInt();
		int idx=seqSearchsen(x,num,ky);
		
		if(idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky+"��  x["+idx+"]�� �ֽ��ϴ�." );
	}

}
package chapter6;

import java.util.Scanner;

public class Practice6_5_insertionSort {
	static void insertionSort(int[] a, int n) {
		for(int i =1; i< n; i++) {
			int j;
			int tmp = a[i];
			for(j = 1; j> 0 && a[j-1] > tmp; j--)
				a[j] = a[j-1];
			a[j] = tmp;
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("�ܼ� ���� ����");
		System.out.print("��ڼ�:");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		for(int i =0; i< nx; i++) {
			System.out.print("x["+i+"]:");
			x[i] = sc.nextInt();
		}
		insertionSort(x, nx);
		
		System.out.println("������������ �����߽��ϴ�");
		for (int i = 0; i < nx; i++) {
			System.out.println("x["+i+"]:");
		}
	}

}

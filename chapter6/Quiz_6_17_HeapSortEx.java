package chapter6;

import java.util.Scanner;

class Quiz_6_17_HeapSortEx {
	// �迭�� ��� a[idx1]�� a[idx2]�� ��ȯ
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// 2�� n ������ ���մϴ�
	static int pow2(int n) {
		int k = 1;

		while (n-- > 0) // n�� 0���� Ŭ������ 2�� ������ ���� k�� ����
			k *= 2;
		return (k);
	}

	// n���� �����̽��� ���   
	static void dispSpace(int n) {
		for (int i = 0; i < n; i++) // ' ' ������ ���
			System.out.print(' ');
	}

	// ���� ���
	static void dispHeap(int a[], int n) { 
		int i = n;
		int height = 1; // Ʈ���� ����
		while ((i >>= 1) > 0) //i�� 1���� ũ�ų� ���� 0���� Ŭ ��
			height++; // Ʈ���� ���̸� ������Ų��.
		i = 0;
		int w = 1;
		Loop: { // ������ ������
			for (int level = 0; level < height; level++) { 
				dispSpace(pow2(height - level) - 3);
				for (int k = 0; k < w; k++) {
					System.out.printf("%02d", a[i++]);
					if (i >= n)
						break Loop;
					if (k < w - 1)
						dispSpace(pow2(height - level + 1) - 2);
				}
				System.out.println();

				dispSpace(pow2(height - level) - 4);
				for (int k = 0; k < w; k++) {
					if (2 * k + i < n)
						System.out.print(" �� ");
					if (2 * k + i + 1 < n)
						System.out.print(" �� ");
					if (k < w - 1)
						dispSpace(pow2(height - level + 1) - 4);
				}
				System.out.println();
				w *= 2;
			}
		}
	
		System.out.println();
		System.out.println();
	}

	// a[left]~a[right]�� ������ �����
	static void downHeap(int[] a, int left, int right) {
		int temp = a[left]; // �Ѹ�
		int child; // ū ���� �ڽ�
		int parent; // �θ�

		for (parent = left; parent < (right + 1) / 2; parent = child) {
			int cl = parent * 2 + 1; // ���� �ڽ�
			int cr = cl + 1; // ������ �ڽ�
			child = (cr <= right && a[cr] > a[cl]) ? cr : cl; // ū ��
			if (temp >= a[child])
				break;
			a[parent] = a[child];
		}
		a[parent] = temp;
	}

	// ������
	static void heapSort(int[] a, int n) {
		for (int i = (n - 1) / 2; i >= 0; i--) { // a[i]~a[n-1]�� ������ �����
			dispHeap(a, n);
			downHeap(a, i, n - 1);
		}

		for (int i = n - 1; i > 0; i--) {
			swap(a, 0, i); // �ִ� ��ҿ� ���� �����ĵ� �ǳ� ��Ҹ� ��ȯ
			dispHeap(a, n);
			downHeap(a, 0, i - 1); // a[0]~a[i-1]�� ������ �����
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("������ ");
		System.out.print("��ڼ���");
		int nx = sc.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]��");
			x[i] = sc.nextInt();
		}

		heapSort(x, nx); // �迭 x�� ������

		System.out.println("������������ �����߽��ϴ�.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "]��" + x[i]);
	}
}
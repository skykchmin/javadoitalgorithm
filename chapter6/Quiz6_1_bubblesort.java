package chapter6;
import java.util.Scanner;

class Quiz6_1_bubblesort {
	// �迭�� ��� a[idx1]�� a[idx2]�� ��ȯ
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// �ܼ���ȯ����
	static void bubbleSort(int[] a, int n) {
		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) // �Ӹ��沿���η� ��ĵ
				if (a[j] > a[j + 1])
					swap(a, j, j + 1);
			
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�ܼ���ȯ����(��������)");
		System.out.print("��ڼ���");
		int nx = sc.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]��");
			x[i] = sc.nextInt();
		}

		bubbleSort(x, nx); // �迭 x�� �ܼ���ȯ����

		System.out.println("������������ �����߽��ϴ�.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "]��" + x[i]);
	}
}
package chapter6;


import java.util.Scanner;

class Quiz6_7_InsertionSortCen {
	// �ܼ���������(���ʹ����迭�� �Ӹ���Ҵ� ����ֽ��ϴ�.)
	static void insertionSort(int[] a, int n) {
		for (int i = 2; i < n; i++) {
			int tmp = a[0] = a[i];
			int j = i;
			for (; a[j - 1] > tmp; j--)
				a[j] = a[j - 1];
			if (j > 0)
				a[j] = tmp;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�ܼ��������� ");
		System.out.print("��ڼ���");
		int nx = sc.nextInt();
		int[] x = new int[nx + 1]; // 1�� �������� ����

		for (int i = 1; i <= nx; i++) { // x[1]~x[nx]�� �о� ����
			System.out.print("x[" + i + "]��");
			x[i] = sc.nextInt();
		}

		insertionSort(x, nx + 1); // �迭 x�� �ܼ���������

		System.out.println("������������ �����߽��ϴ�.");
		for (int i = 1; i <= nx; i++)
			System.out.println("x[" + i + "]��" + x[i]);
	}
}
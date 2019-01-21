package chapter6;

import java.util.Scanner;
// ������(����2��h = ��, 40, 13, 4, 1������� �ű� Ƚ���� ī��Ʈ)

class Quiz6_9_ShellSortEx2{
	// ������(����� �ű� Ƚ���� ��ȯ)
	static int shellSort(int[] a, int n) {
		int count = 0; // �ű� Ƚ��
		int h;
		for (h = 1; h < n / 9; h = h * 3 + 1)
			;

		for (; h > 0; h /= 3)
			for (int i = h; i < n; i++) {
				int j;
				int tmp = a[i];
				for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
					a[j + h] = a[j];
					count++;
				}
				a[j + h] = tmp;
				count++;
			}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("������(���� 2) ");
		System.out.print("��ڼ���");
		int nx = sc.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]��");
			x[i] = sc.nextInt();
		}

		int count = shellSort(x, nx); // �迭 x�� ������

		System.out.println("������������ �����߽��ϴ�.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "]��" + x[i]);
		System.out.println("����� �ű�Ƚ���� " + count + "ȸ�Դϴ�.");
	}
}
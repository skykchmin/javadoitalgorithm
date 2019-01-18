package chapter6;
import java.util.Scanner;

class Quiz6_3_bubblesort3 {
	// �迭�� ��� a[idx1]�� a[idx2]�� ��ȯ
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// �ܼ���ȯ����
	static void bubbleSort(int[] a, int n) {
		int ccnt = 0; // ��Ƚ��
		int scnt = 0; // ��ȯȽ��

		for (int i = 0; i < n - 1; i++) {
			int exchg = 0; // pass�� ���� ��ȯȽ��
			System.out.printf("�н�%d��\n", i + 1);

			for (int j = n - 1; j > i; j--) {
				for (int m = 0; m < n - 1; m++)
					System.out.printf("%3d %c", a[m], (m != j - 1) ? ' ' : (a[j - 1] > a[j]) ? '+' : '-');
				System.out.printf("%3d\n", a[n - 1]);

				ccnt++;
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					exchg++;
					scnt++;
				}
			}
			for (int m = 0; m < n; m++)
				System.out.printf("%3d  ", a[m]);
			System.out.println();
			if (exchg == 0)
				break; /* ��ȯ�� �������� ������ ���� */
		}
		System.out.println("�񱳸� " + ccnt + "ȸ �߽��ϴ�.");
		System.out.println("��ȯ�� " + scnt + "ȸ �߽��ϴ�.");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�ܼ���ȯ����  (��������)");
		System.out.print("��ڼ���");
		int nx = sc.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]��");
			x[i] = sc.nextInt();
		}

		bubbleSort(x, nx); // �迭 x�� �ܼ���ȯ����
	}
}

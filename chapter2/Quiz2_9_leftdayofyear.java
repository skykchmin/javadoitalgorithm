package chapter2;
import java.util.Scanner;
// �� �� ��� �ϼ��� ����

class Quiz2_14_leftDayoffyear {
	// �� ���� �� ��
	static int[][] mdays = {
		{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},	// ���
		{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},	// ����
	};

	// ���� year���� �����ΰ�? (���⣺1����⣺0)
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}

	// ���� y�� m�� d���� �� �� ��� �ϼ��� ����
	static int leftDayofYear(int y, int m, int d) {
		int days = d;
		for (int i = 1; i < m; i++) // 1��~(m-1)���� �� ���� ����
			days += mdays[isLeap(y)][i - 1];
		return 365 + isLeap(y) - days;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retry;							// �ٽ� �� ��?

		System.out.println("�� �� ��� �� ���� ���մϴ�.");

		do {
			System.out.print("�⣺");  int year  = sc.nextInt();	// ��
			System.out.print("����");  int month = sc.nextInt();	// ��
			System.out.print("�ϣ�");  int day   = sc.nextInt();	// ��

			System.out.printf("�� �� %d��°�Դϴ�.\n", leftDayofYear(year, month, day));

			System.out.print("�ѹ� �� �ұ��? (1.����0.�ƴϿ�����");
			retry = sc.nextInt();
		} while (retry == 1);
	}
}
package chapter5;

import java.util.Scanner;

public class Pracitce5_6_Hanoi {

	static String[] name = { "A���", "B���", "C���" };

	// ������ x��տ��� y������� �ű�
	static void move(int no, int x, int y) {
		if (no > 1)
			move(no - 1, x, 6 - x - y);

		System.out.println("����[" + no + "]�� " + name[x - 1] + "���� " + name[y - 1] + "���� �ű�");

		if (no > 1)
			move(no - 1, 6 - x - y, y);
	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ϳ����� ž");
		System.out.println("���� ����");
		int n = sc.nextInt();
		
		move(n,1,3);
	}

}

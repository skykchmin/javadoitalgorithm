package chapter3;

import java.util.Scanner;

public class Quiz3_3_searchIdx {
	
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			if(a[i]==key) {
				idx[count++]=i;
				
			}
		}
		return count;
	}
	
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ������ �Է��ϼ���.:");
		int number = sc.nextInt();
		
		int[] a = new int[number];
		int[] idx = new int[number];
		
		for (int i = 0; i < number; i++) {
			System.out.println("x[" + i + "]:");
			a[i] = sc.nextInt();
		}
		
		System.out.println("�˻��� ���� �Է��ϼ���.:");
		int key = sc.nextInt();
		
		int findnumber= searchIdx(a,number,key,idx);
		
		if(findnumber == 0)
			System.out.println("�˻��� ��Ұ� �����ϴ�");
		else {
		
		for (int i = 0; i < findnumber; i++) {
			System.out.println("�� ���� " + "x[" + idx[i] + "]�� �ֽ��ϴ�.");
		}
		}
		
		System.out.println("�˻� �� ����" + findnumber);
	}

}

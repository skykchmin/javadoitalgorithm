package chapter1;

import java.util.Scanner;

public class Quiz1_14 {

	public static void main(String[] args) {
		System.out.println("�簢���� ����մϴ�");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ��:");
		int number = sc.nextInt(); 
		
		for (int i = 1; i <= number; i++) {
			for(int j=1; j <= number; j++) 
				System.out.print('*');
				System.out.println();
			
			
		}
	}

}

package chapter1;

import java.util.Scanner;

/**
 * @author skykchmin
 *
 */
public class Quiz1_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1���� n������ ���� ��Ÿ���� ���� n�� ���� �Է����ּ���");
		int n = sc.nextInt();

		if(n%2 ==0) {
			int result = 0;
			for(int i = 1; i<=n; i++) {
				while(i<n) {
					result+= i + n;
					n--;
				}
			}
			System.out.println(result);
		}
		else {
			int result = 0;
			for(int i =1; i<=n; i++) {
				while(i!=n) {
					result+= i + n;
					n--;
				}
			}
			System.out.println(result);
		}
		
	}

} 
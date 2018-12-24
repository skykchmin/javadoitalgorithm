package chapter1;

import java.util.Scanner;

/**
 * @author skykchmin
 *
 */
public class Quiz1_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 나타내기 위해 n의 값을 입력해주세요");
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
package chapter1;
import java.util.Scanner;

/**
 * @author skykchmin
 *
 */
public class maxnumber1_1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;

		System.out.println("첫번째 수를 입력하세요");
		a = sc.nextInt();
		System.out.println("두번째 수를 입력하세요");
		b = sc.nextInt();
		System.out.println("세번째 수를 입력하세요");
		c = sc.nextInt();

		int maxnumber = a;
		if(maxnumber < b)
			maxnumber = b;
		else if(maxnumber < c)
			maxnumber = c;


		System.out.println("최대값의 수는 " + maxnumber + "입니다");
	}

}

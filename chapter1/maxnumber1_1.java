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

		System.out.println("ù��° ���� �Է��ϼ���");
		a = sc.nextInt();
		System.out.println("�ι�° ���� �Է��ϼ���");
		b = sc.nextInt();
		System.out.println("����° ���� �Է��ϼ���");
		c = sc.nextInt();

		int maxnumber = a;
		if(maxnumber < b)
			maxnumber = b;
		else if(maxnumber < c)
			maxnumber = c;


		System.out.println("�ִ밪�� ���� " + maxnumber + "�Դϴ�");
	}

}

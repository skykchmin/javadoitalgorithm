package chapter1;

import java.util.Scanner;

class Quiz1_1 {
	static int max4( int a, int b, int c, int d) {
		int max =a;
		
		if(b>max)
			max = b;
		else if(c>max)
			max = c;
		else if(d>max)
			max = d;
		
		return max;
	}
	static int min3(int a, int b, int c) {
		int min3 = a;
		
		if(b<min3)
			min3 = b;
		else if(c<min3)
			min3 = c;
		
		return min3;
	}
	static int min4(int a, int b, int c, int d) {
		int min4 = a;
		
		if(b<min4)
			min4 = b;
		else if(c<min4)
			min4 = c;
		else if(d<min4)
			min4 = d;
		
		return min4;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 수를 입력해주세요");
		int a = sc.nextInt();
		System.out.println("두번째 수를 입력해주세요");
		int b = sc.nextInt();
		System.out.println("세번째 수를 입력해주세요");
		int c = sc.nextInt();
		System.out.println("네번째 수를 입력해주세요");
		int d = sc.nextInt();
		
		int max4result = max4(a,b,c,d);
		System.out.println(max4result);
		
		int min3result = min3(a,b,c);
		System.out.println(min3result);
		
		int min4result = min4(a,b,c,d);
		System.out.println(min4result);
	}
	
}

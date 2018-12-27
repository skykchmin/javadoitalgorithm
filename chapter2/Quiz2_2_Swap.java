package chapter2;

import java.util.Scanner;

public class Quiz2_2_Swap {
	static void swap(int[] a, int idx1, int idx2) {

			int temp = a[idx1];
			a[idx1] = a[idx2];
			a[idx2] = temp;
			System.out.println("a["+idx1+"]" + "와" + "a["+idx2+"]"+"를 교환합니다");
			for (int i = 0; i < a.length; i++) {
				System.out.print("a["+i+"]=" + a[i]);
				System.out.println();
			}
	}
	static void reverse(int a[]) {
		for(int i=0; i<(a.length/2); i++) {
			swap(a, i, a.length-i-1);
		}
		System.out.println("역순 정렬을 마쳤습니다.");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("만들 요수의 갯수를 입력하세요");
		int num = sc.nextInt();
	
		int[] a= new int[num];
		
		
		for(int i=0; i<a.length; i++) {
			System.out.println("요소를 입력해주세요");
			a[i]=sc.nextInt();
		}
		
		reverse(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println("a["+i+"]=" + a[i]);
		}
	}

}

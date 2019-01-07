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
		System.out.println("요소의 갯수를 입력하세요.:");
		int number = sc.nextInt();
		
		int[] a = new int[number];
		int[] idx = new int[number];
		
		for (int i = 0; i < number; i++) {
			System.out.println("x[" + i + "]:");
			a[i] = sc.nextInt();
		}
		
		System.out.println("검색할 값을 입력하세요.:");
		int key = sc.nextInt();
		
		int findnumber= searchIdx(a,number,key,idx);
		
		if(findnumber == 0)
			System.out.println("검색된 요소가 없습니다");
		else {
		
		for (int i = 0; i < findnumber; i++) {
			System.out.println("그 값은 " + "x[" + idx[i] + "]에 있습니다.");
		}
		}
		
		System.out.println("검색 된 갯수" + findnumber);
	}

}

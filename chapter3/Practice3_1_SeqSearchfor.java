package chapter3;

import java.util.Scanner;

public class Practice3_1_SeqSearchfor {
	static int seqSearch(int[] a, int n, int key) {
		
		for (int i = 0; i < n; i++) {
			if(a[i] == key)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요솟수:");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.println("x["+i+"]:");
			x[i] = sc.nextInt();
			
		}
		System.out.println("검색할 값:");
		int ky = sc.nextInt();
		int idx=seqSearch(x,num,ky);
		
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky+"은  x["+idx+"]에 있습니다." );
	}

}

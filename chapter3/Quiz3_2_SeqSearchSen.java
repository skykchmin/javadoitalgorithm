package chapter3;

import java.util.Scanner;

public class Quiz3_2_SeqSearchSen {
	static int seqSearch(int[] a, int n, int key) {
		System.out.print("   |");
		for (int k = 0; k < n; k++)
			System.out.printf("%4d", k);
		System.out.println();

		System.out.print("---+");
		for (int k = 0; k < 4 * n + 2; k++)
			System.out.print("-");
		System.out.println();
		for (int i = 0; i < n; i++) {
		
			System.out.print("   |");
			System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
			System.out.printf("%3d|", i);
			for (int k = 0; k < n; k++)
				System.out.printf("%4d", a[k]);
			System.out.println("\n   |");
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

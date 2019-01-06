package chapter3;

import java.util.Scanner;

public class Quiz3_1_SeqSearchSenfor {
	static int seqSearchsen(int[] a, int n, int key) {
		int i =0;
		
		a[n] = key;
		
		for(i =0; i<= n; i++) {
			if(a[i]== key)
				break;
		}
		return i == n ? -1 : i;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요솟수:");
		int num = sc.nextInt();
		int[] x = new int[num+1]; // 요소에 num+1 하는 이유는 끝에있는 값을 넣어주기 위해서
		
		for (int i = 0; i < num; i++) {
			System.out.println("x["+i+"]:");
			x[i] = sc.nextInt();
			
		}
		System.out.println("검색할 값:");
		int ky = sc.nextInt();
		int idx=seqSearchsen(x,num,ky);
		
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky+"은  x["+idx+"]에 있습니다." );
	}

}

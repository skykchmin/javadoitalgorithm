package chapter2;

import java.util.Random;

public class Quiz2_1_randomheight {
	static int maxof(int[] a) {
		int max = a[0];
		for(int i =1; i<a.length; i++)
			if(a[i]> max)
				max = a[i];
		return max;
		
	}
	public static void main(String[] args) {
		Random rand = new Random();
		System.out.println("Ű�� �ִ��� ���մϴ�.");
		
		int num = rand.nextInt(5);
	
		int[] height = new int[num];
		
		System.out.println("Ű ���� �Ʒ��� �����ϴ�");
		
		for(int i =0; i< num; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height["+i+"]:" +height[i]);
		}
		
		System.out.println("�ִ밪��" + maxof(height) + "�Դϴ�.");
	}

}

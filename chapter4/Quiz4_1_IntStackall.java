package chapter4;

import java.util.Scanner;

public class Quiz4_1_IntStackall {
	private int max;
	private int ptr;
	private int[] stk;
	
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
	}
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}
	
	public Quiz4_1_IntStackall(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];
			
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	public int push(int x) throws OverflowIntStackException{ // ��� ���ÿ� ����ֱ�
		if(ptr >= max)
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}
	
	public int pop() throws EmptyIntStackException{ // ���ʿ��� �ϳ��� ������ ��Һ���
		if(ptr <= 0)
			throw new EmptyIntStackException();
		return stk[--ptr];
	}
	public int peek() throws EmptyIntStackException{ // �鿩�ٺ��� 
		if( ptr <= 0)
			throw new EmptyIntStackException();
		return stk[ptr -1];
		
	}
	public int indexof(int x) {
		for (int i = ptr -1; i>= 0; i--) 
			if(stk[i] == x)
				return i;
			return -1;
		
		}
	public void clear() { // ���� ����
		ptr = 0;
	}

	public int size() { // ���ÿ� �׿��ִ� ��� ���� �ľ��ϱ�
		return ptr;
	}
	
	public void dump() {
		if(ptr<= 0)
			System.out.println("������ ����ֽ��ϴ�");
		else {
			for (int i = 0; i < ptr; i++) {
				System.out.print(stk[i]+ " ");
				System.out.println();
			}
		}
	}
	public int capacity() {
		return max;
	}
	public boolean isEmpty() {
		return ptr <= 0;
	}
	public boolean isfull() {
		return ptr >= max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Quiz4_1_IntStackall s = new Quiz4_1_IntStackall(64);
		
		while(true) {
			System.out.println("���� ������ ��: "+ s.size()+ " / " + s.capacity());
			System.out.print("(1)Ǫ�� (2)�� (3)��ũ (4)���� (5)���� ���� (6)���� �뷮 Ȯ��  (7)���� ������ �� Ȯ�� (8) ���� ����ִ��� Ȯ�� (9) ������ ���� ä�����ִ��� Ȯ�� (0) ����:");
			
			int menu = sc.nextInt();
			if(menu == 0)
				break;
			
			int x;
			switch(menu) {
			case 1:
				System.out.print("������:");
				x = sc.nextInt();
				try {
					s.push(x);
				} catch (Quiz4_1_IntStackall.OverflowIntStackException e) {
					// TODO: handle exception
					System.out.println("������ ���� á���ϴ�.");
				}
				break;
			case 2:
				try {
					x = s.pop();
					System.out.println("���� �����ʹ� "+ x + "�Դϴ�.");
				}catch(Quiz4_1_IntStackall.EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�");
				}
				break;
			
			case 3:
				try {
					x = s.peek();
					System.out.println("��ũ�� �����ʹ�" + x + "�Դϴ�.");
				} catch (Quiz4_1_IntStackall.EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�");
					// TODO: handle exception
				}
				break;
			case 4:
				s.dump();
				break;
			
			case 5:
				s.clear();
				break;
			case 6:
				System.out.println("������ �뷮��:");
				s.capacity();
				break;
			case 7:
				try {
					System.out.println("������ ������:");
					s.size();
					
				} catch (Quiz4_1_IntStackall.EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�");
					// TODO: handle exception
				}
				break;
			case 8:
				System.out.println("���"+ (s.isEmpty() ? "�ֽ��ϴ�":"���� �ʽ��ϴ�"));
				break;
			case 9:
				System.out.println("����"+ (s.isfull() ? "���ֽ��ϴ�":"������ �ʽ��ϴ�"));
				break;
		}
		}
	}

}

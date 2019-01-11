package chapter4;

import java.util.Scanner;

public class Quiz4_4_IntQueue_search {
	private int max; // ť�� �뷮
	private int front; // ť�� ù���� ��� Ŀ��
	private int rear; // ť�� ������ ��� Ŀ��
	private int num; // ���� ������ �� 
	private int[] que; // ť ��ü
	
	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException() {}
	}
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException() {}
	}
	public Quiz4_4_IntQueue_search(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];
			
		}catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	public int enque(int x) throws OverflowIntQueueException{
		if(num >= max)
			throw new OverflowIntQueueException();
		que[rear++] = x;
		num ++;
		if( rear == max)
			rear = 0;
		return x;
	}
	public int deque() throws EmptyIntQueueException{
		if( num<= 0)
			throw new EmptyIntQueueException();
		int x = que[front++]; // front ���� 1����
		num--; // �����ͼ� ����
		return x;
	}
	public int peek() throws EmptyIntQueueException{
		if(num<= 0)
			throw new EmptyIntQueueException();
		return que[front];
	}
	public int indexof(int x) {
		for (int i = 0; i < num; i++) {
			int idx = ( i + front) % max;
			if(que[idx] == x)
				return idx;
			
		}
		return -1;
	}
	int search(int x) throws EmptyIntQueueException{
		if(num<= 0)
			throw new EmptyIntQueueException();
		else {
			for(int i = 0; i< num; i++) {
				int idx = ( i+ front ) % max;
				if(que[idx] == x)
					return i +1;
			}
		}
		return 0;
	}
	public void clear() {
		num = front = rear = 0;
		
	}
	
	public int capacity() {
		return max;
	}
	
	public int size() {
		return num;
	}
	
	public boolean isEmpty() {
		return num <= 0;
	}
	
	public boolean isFull() {
		return num >= max;
	}
	public void dump() {
		if(num <= 0)
			System.out.println("ť�� ��� �ֽ��ϴ�");
	else {
		for(int i = 0; i < num; i++) {
			System.out.print(que[(i+front) % max] + " ");
		System.out.println();
		}
	}
	
	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Quiz4_4_IntQueue_search s = new Quiz4_4_IntQueue_search(64);
		
		while(true) {
			System.out.println("���� ������ ��:" + s.size() + " / " + s.capacity());
			System.out.print("(1) ��ť (2) ��ť (3) ��ũ (4) ���� (5) �˻� (0) ����");
			
			int menu = sc.nextInt();
			if(menu == 0 ) break;
			int x;
			switch( menu ) {
			case 1:
				System.out.print("������:");
				x = sc.nextInt();
				try {
					s.enque(x);
				}catch(Quiz4_4_IntQueue_search.OverflowIntQueueException e) {
					System.out.println("ť�� ���� á���ϴ�.");
				}
				break;
				
			case 2:
				try {
					x = s.deque();
					System.out.println("��ť�� �����ʹ� " + x + "�Դϴ�. ");
				} catch (Quiz4_4_IntQueue_search.EmptyIntQueueException e) {
					System.out.println("ť�� ����ֽ��ϴ�");
				}
				break;
				
			case 3: 
				try {
				x = s.peek();
				System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�. ");
			}catch (Quiz4_4_IntQueue_search.EmptyIntQueueException e) {
				System.out.println("ť�� ����ֽ��ϴ�");
				
			}
				break;
				
			case 4: 
				s.dump();
				break;
			
			case 5:
				System.out.print("ã�� ������:");
				x = sc.nextInt();
				try {
					s.search(x);
				} catch (Quiz4_4_IntQueue_search.EmptyIntQueueException e) {
					System.out.println("ť�� ����ֽ��ϴ�.");
				}
		}
			
	}
	}
		
}

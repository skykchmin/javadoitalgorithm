package chapter4;

import java.util.Scanner;

public class Quiz4_4_IntQueue_FIFO {
	private int max;
	private int num;
	private int[] que;

	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {
		}

	}

	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {
		}

	}

	public Quiz4_4_IntQueue_FIFO(int capacity) {
		num = 0;
		max = capacity;
		try {
			que = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

	public int enque(int x) throws OverflowIntQueueException {
		if (num >= max)
			throw new OverflowIntQueueException();
		que[num++] = x;
		return x;
	}

	public int deque() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();
		int x = que[0];
		for (int i = 0; i < num - 1; i++)
			que[i] = que[i + 1];
		num--;
		return x;
	}

	public int peek() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();
		return que[num - 1];
	}

	public int indexof(int x) {
		for (int i = 0; i < num; i--)
			if (que[i] == x)
				return i;
		return -1;
	}

	public void clear() {
		num = 0;
	}

	public int size() {
		return num;
	}

	public int capacity() {
		return max;
	}

	public void dump() {
		if(num<= 0)
			System.out.println("������ ����ֽ��ϴ�");
		else {
			for (int i = 0; i < num; i++) {
				System.out.print(que[i]+ " ");
				System.out.println();
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Quiz4_4_IntQueue_FIFO q = new Quiz4_4_IntQueue_FIFO(64);
		while(true) {
			System.out.println("���� ������ ��: "+ q.size()+ " / " + q.capacity());
			System.out.print("(1)��ť (2) ��ť (3)��ũ (4)���� (0) ����:");
			
			int menu = sc.nextInt();
			if(menu == 0)
				break;
			
			int x;
			switch(menu) {
			case 1:
				System.out.print("������:");
				x = sc.nextInt();
				try {
					q.enque(x);
				} catch (Quiz4_4_IntQueue_FIFO.OverflowIntQueueException e) {
					// TODO: handle exception
					System.out.println("������ ���� á���ϴ�.");
				}
				break;
			case 2:
				try {
					x = q.deque();
					System.out.println("���� �����ʹ� "+ x + "�Դϴ�.");
				}catch(Quiz4_4_IntQueue_FIFO.EmptyIntQueueException e) {
					System.out.println("������ ����ֽ��ϴ�");
				}
				break;
			
			case 3:
				try {
					x = q.peek();
					System.out.println("��ũ�� �����ʹ�" + x + "�Դϴ�.");
				} catch (Quiz4_4_IntQueue_FIFO.EmptyIntQueueException e) {
					System.out.println("������ ����ֽ��ϴ�");
					// TODO: handle exception
				}
				break;
			case 4:
				q.dump();
				break;
		
			}
		}
	}

}

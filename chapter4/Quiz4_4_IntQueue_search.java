package chapter4;

import java.util.Scanner;

public class Quiz4_4_IntQueue_search {
	private int max; // 큐의 용량
	private int front; // 큐의 첫번쨰 요소 커서
	private int rear; // 큐의 마지막 요소 커서
	private int num; // 현재 데이터 수 
	private int[] que; // 큐 본체
	
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
		int x = que[front++]; // front 값을 1증가
		num--; // 데이터수 감소
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
			System.out.println("큐가 비어 있습니다");
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
			System.out.println("현재 데이터 수:" + s.size() + " / " + s.capacity());
			System.out.print("(1) 인큐 (2) 디큐 (3) 피크 (4) 덤프 (5) 검색 (0) 종료");
			
			int menu = sc.nextInt();
			if(menu == 0 ) break;
			int x;
			switch( menu ) {
			case 1:
				System.out.print("데이터:");
				x = sc.nextInt();
				try {
					s.enque(x);
				}catch(Quiz4_4_IntQueue_search.OverflowIntQueueException e) {
					System.out.println("큐가 가득 찼습니다.");
				}
				break;
				
			case 2:
				try {
					x = s.deque();
					System.out.println("디큐한 데이터는 " + x + "입니다. ");
				} catch (Quiz4_4_IntQueue_search.EmptyIntQueueException e) {
					System.out.println("큐가 비어있습니다");
				}
				break;
				
			case 3: 
				try {
				x = s.peek();
				System.out.println("피크한 데이터는 " + x + "입니다. ");
			}catch (Quiz4_4_IntQueue_search.EmptyIntQueueException e) {
				System.out.println("큐가 비어있습니다");
				
			}
				break;
				
			case 4: 
				s.dump();
				break;
			
			case 5:
				System.out.print("찾을 데이터:");
				x = sc.nextInt();
				try {
					s.search(x);
				} catch (Quiz4_4_IntQueue_search.EmptyIntQueueException e) {
					System.out.println("큐가 비어있습니다.");
				}
		}
			
	}
	}
		
}

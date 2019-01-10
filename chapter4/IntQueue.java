package chapter4;

public class IntQueue {
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
	public IntQueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];
			
		}catch(OutofMemoryError e) {
			max = 0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

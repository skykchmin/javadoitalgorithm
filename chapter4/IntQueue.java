package chapter4;

public class IntQueue {
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

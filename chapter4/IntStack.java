package chapter4;

import java.util.Scanner;

public class IntStack {
	private int max;
	private int ptr;
	private int[] stk;
	
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
	}
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}
	
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];
			
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	public int push(int x) throws OverflowIntStackException{ // 결과 스택에 집어넣기
		if(ptr >= max)
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}
	
	public int pop() throws EmptyIntStackException{ // 위쪽에서 하나씩 꺼내서 요소보기
		if(ptr <= 0)
			throw new EmptyIntStackException();
		return stk[--ptr];
	}
	public int peek() throws EmptyIntStackException{ // 들여다보기 
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
	public void clear() { // 스택 비우기
		ptr = 0;
	}

	public int size() { // 스택에 쌓여있는 요수 갯수 파악하기
		return ptr;
	}
	
	public void dump() {
		if(ptr<= 0)
			System.out.println("스택이 비어있습니다");
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
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntStack s = new IntStack(64);
		
		while(true) {
			System.out.println("현재 데이터 수: "+ s.size()+ " / " + s.capacity());
			System.out.print("(1)푸시 (2)팝 (3)피크 (4)덤프 (0) 종료:");
			
			int menu = sc.nextInt();
			if(menu == 0)
				break;
			
			int x;
			switch(menu) {
			case 1:
				System.out.print("데이터:");
				x = sc.nextInt();
				try {
					s.push(x);
				} catch (IntStack.OverflowIntStackException e) {
					// TODO: handle exception
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
			case 2:
				try {
					x = s.pop();
					System.out.println("팝한 데이터는 "+ x + "입니다.");
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다");
				}
				break;
			
			case 3:
				try {
					x = s.peek();
					System.out.println("피크한 데이터는" + x + "입니다.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다");
					// TODO: handle exception
				}
				break;
			case 4:
				s.dump();
				break;
			}
				
		}
	}

}

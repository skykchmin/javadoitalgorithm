package chapter4;

import java.util.Scanner;

public class Quiz4_3_stack2 {
	private int max;
	private int ptrA; // 스택포인터 A
	private int ptrB; // 스택포인터 B
	
	public enum AorB{
		StackA,StackB
	}
	private int[] stk;
	
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
	}
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}
	
	public Quiz4_3_stack2(int capacity) {
		ptrA = 0;
		ptrB = capacity -1;
		max = capacity;
		try {
			stk = new int[max];
			
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	public int push(AorB sw, int x) throws OverflowIntStackException{ // 결과 스택에 집어넣기
		if(ptrA >= ptrB+1)
			throw new OverflowIntStackException();
		switch(sw) {
		case StackA: 
			stk[ptrA++] = x;
			break;
		case StackB:
			stk[ptrB--] = x;
	 	}
		return x;
	}
	
	public int pop(AorB sw) throws EmptyIntStackException{ // 위쪽에서 하나씩 꺼내서 요소보기
		int x = 0;
		switch(sw) {
		case StackA:
			if(ptrA <= 0)
				throw new EmptyIntStackException();
				x = stk[--ptrA];
				break;
		case StackB:
			if(ptrB >= max -1)
				throw new EmptyIntStackException();
			x = stk[++ptrB];
			break;
		}
		return x;
	}
	public int peek(AorB sw) throws EmptyIntStackException{ // 들여다보기 
		int x = 0;
		switch(sw) {
		case StackA:
		if( ptrA <= 0)
			throw new EmptyIntStackException();
		x = stk[ptrA -1];
		break;
		case StackB:
			if(ptrB >= max -1)
				throw new EmptyIntStackException();
		}
	
		return x;
		
	}
	public int indexof(AorB sw, int x) {
		switch(sw) {
		case StackA:
		for (int i = ptrA -1; i>= 0; i--) 
			if(stk[i] == x)
				return i;
		break;
		case StackB:
			for (int i = ptrB + 1; i < max; i++) // 꼭대기쪽부터 선형 검색
				if (stk[i] == x)
					return i; // 검색성공
			break;
		}
		return -1; // 검색실패
			

		}
	public void clear(AorB sw) { // 스택 비우기
		switch(sw) {
		case StackA:
			ptrA = 0;
			break;
		case StackB:
			ptrB = max -1;
			break;
		}
		
	}


	// 스택의 용량을 반환 (A와 B의 합계)
		public int capacity() {
			return max;
		}

		// 스택에 쌓여있는 데이터 수를 반환
		public int size(AorB sw) {
			switch (sw) {
			case StackA:
				return ptrA;
			case StackB:
				return max - ptrB - 1;
			}
			return 0;
		}

		// 스택이 비어 있는가?
		public boolean isEmpty(AorB sw) {
			switch (sw) {
			case StackA:
				return ptrA <= 0;
			case StackB:
				return ptrB >= max - 1;
			}
			return true;
		}

		// 스택이 가득 찼는가?
		public boolean isFull() {
			return ptrA >= ptrB + 1;
		}

		// 스택 안의 터이터를 바닥 → 꼭대기의 차례로 나타냄
		public void dump(AorB sw) {
			switch (sw) {
			case StackA:
				if (ptrA <= 0)
					System.out.println("스택이 비었습니다.");
				else {
					for (int i = 0; i < ptrA; i++)
						System.out.print(stk[i] + " ");
					System.out.println();
				}
				break;
			case StackB:
				if (ptrB >= max - 1)
					System.out.println("스택이 비었습니다.");
				else {
					for (int i = max - 1; i > ptrB; i--)
						System.out.print(stk[i] + " ");
					System.out.println();
				}
				break;
			}
		}
	}

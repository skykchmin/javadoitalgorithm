package chapter4;

import java.util.Scanner;

public class Quiz4_3_stack2 {
	private int max;
	private int ptrA; // ���������� A
	private int ptrB; // ���������� B
	
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
	public int push(AorB sw, int x) throws OverflowIntStackException{ // ��� ���ÿ� ����ֱ�
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
	
	public int pop(AorB sw) throws EmptyIntStackException{ // ���ʿ��� �ϳ��� ������ ��Һ���
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
	public int peek(AorB sw) throws EmptyIntStackException{ // �鿩�ٺ��� 
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
			for (int i = ptrB + 1; i < max; i++) // ������ʺ��� ���� �˻�
				if (stk[i] == x)
					return i; // �˻�����
			break;
		}
		return -1; // �˻�����
			

		}
	public void clear(AorB sw) { // ���� ����
		switch(sw) {
		case StackA:
			ptrA = 0;
			break;
		case StackB:
			ptrB = max -1;
			break;
		}
		
	}


	// ������ �뷮�� ��ȯ (A�� B�� �հ�)
		public int capacity() {
			return max;
		}

		// ���ÿ� �׿��ִ� ������ ���� ��ȯ
		public int size(AorB sw) {
			switch (sw) {
			case StackA:
				return ptrA;
			case StackB:
				return max - ptrB - 1;
			}
			return 0;
		}

		// ������ ��� �ִ°�?
		public boolean isEmpty(AorB sw) {
			switch (sw) {
			case StackA:
				return ptrA <= 0;
			case StackB:
				return ptrB >= max - 1;
			}
			return true;
		}

		// ������ ���� á�°�?
		public boolean isFull() {
			return ptrA >= ptrB + 1;
		}

		// ���� ���� �����͸� �ٴ� �� ������� ���ʷ� ��Ÿ��
		public void dump(AorB sw) {
			switch (sw) {
			case StackA:
				if (ptrA <= 0)
					System.out.println("������ ������ϴ�.");
				else {
					for (int i = 0; i < ptrA; i++)
						System.out.print(stk[i] + " ");
					System.out.println();
				}
				break;
			case StackB:
				if (ptrB >= max - 1)
					System.out.println("������ ������ϴ�.");
				else {
					for (int i = max - 1; i > ptrB; i--)
						System.out.print(stk[i] + " ");
					System.out.println();
				}
				break;
			}
		}
	}

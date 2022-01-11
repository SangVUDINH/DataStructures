package stacks;

import java.util.EmptyStackException;

public class CharStack {
	public Character[] stack;
	public int top;
	
	public CharStack(int capacity) {
		stack = new Character[capacity];
	}
	
	public void push (char c) {
		
		if (top == stack.length) {
			// on double la capacité
			Character[] newArray = new Character[2*stack.length];
			System.arraycopy(stack,0, newArray,0, stack.length);
			stack = newArray;
		}
		
		stack[top++] = c;
	}
	
	public char pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		
		// top = 0 c'est vide => top - 1 = stack index
		char c = stack[--top];
		stack[top] = null;
		return c;
	}
	
	public char peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		
		return stack[--top];
	}
	
	public boolean isEmpty() {
		return top == 0;
	}
	
	public void printStack() {
		for (int i = top -1; i>=0 ; i--) {
			System.out.println(stack[i]);
		}
	}
}
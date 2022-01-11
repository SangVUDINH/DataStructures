package stacks;

import java.util.EmptyStackException;

import lists.Employee;

public class ArrayStack {

	private Employee[] stack;
	private int top;	
	
	public ArrayStack(int capacity) {
		stack = new Employee[capacity];
	}
	
	public void push (Employee employee) {
		
		if (top == stack.length) {
			// on double la capacité
			Employee[] newArray = new Employee[2*stack.length];
			System.arraycopy(stack,0, newArray,0, stack.length);
			stack = newArray;
		}
		
		stack[top++] = employee;
	}
	
	public Employee pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		
		// top = 0 c'est vide => top - 1 = stack index
		Employee employee = stack[--top];
		stack[top] =null;
		return employee;
	}
	
	public Employee peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		
		return stack[--top];
	}
	
	public boolean isEmpty() {
		return top == 0;
	}
	
	public int size() {
		return top;
	}
	
	public void printStack() {
		for (int i = top -1; i>=0 ; i--) {
			System.out.println(stack[i]);
		}
	}
 }

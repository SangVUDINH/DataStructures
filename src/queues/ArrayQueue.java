package queues;

import java.util.NoSuchElementException;

import lists.Employee;

public class ArrayQueue {

	private Employee[] queue;
	private int front;
	private int back;
	
	public ArrayQueue(int capacity) {
		queue = new Employee[capacity];
	}
	
	
	
	// CIRCULAR QUEUE | optimise espace libre 
	public void add(Employee employee) {
		// a revoir car on peut tourner a 2 elements et back++
//		if (back == queue.length) {
	
		
		if (size() == queue.length-1) {
			
			int numitems = size();
			Employee[] newArray = new Employee[2*queue.length];
			System.arraycopy(queue, front, newArray, 0, queue.length-front);
			System.arraycopy(queue, 0, newArray, queue.length-front, back);
			
			front = 0;
			back  = numitems;
			queue = newArray;
		}
		
		queue[back]= employee;
		if( back < queue.length-1) {
			back++;
		}
		else {
			back =0;
		}
	}
	
	public Employee remove() {
		if (size() ==0) {
			throw new NoSuchElementException();
		}
		
		Employee employe = queue[front];
		queue[front]=null;
		front ++;
		
		if (size() ==0) {
			front =0;
			back =0;
		} 
		else if (front == queue.length) {
			front  = 0;
		}
		
		return employe;
	}
	
	public Employee peek()
	{
		if (size() ==0) {
			throw new NoSuchElementException();
		}
		return queue[front];
	}
	
	public int size() {
		if (front<=back) {
			return back-front;
		} else {
			return back -front +queue.length;
		}
		
	}
	
	public void printQueue() {
		if (front<back) {
			for (int i =  front; i< back ;i++) {
				System.out.println(queue[i]);
			}
		} else {
			for (int i =  front; i< queue.length ;i++) {
				System.out.println(queue[i]);
			}
			
			for (int i =  0; i< back ;i++) {
				System.out.println(queue[i]);
			}
		}
		
	}
}

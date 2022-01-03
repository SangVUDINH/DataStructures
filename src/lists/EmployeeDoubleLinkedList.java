package lists;

public class EmployeeDoubleLinkedList {

	private EmployeeNode head;
	private EmployeeNode tail;
	private int size;
	
	// head = new node
	public void addToFront(Employee employee) {
		EmployeeNode node= new EmployeeNode(employee);
		
		
		if(head == null) {
			tail = node;
		}
		else {
			head.setPrevious(node);
			node.setNext(head); 
		}
		
		head = node;		
		size++;
	}
	
	// tail = new node
	public void addToEnd(Employee employee) {
		EmployeeNode node= new EmployeeNode(employee);
		
		
		if(tail == null) {
			head = node;
		}
		else {
			tail.setNext(node);
			node.setPrevious(tail); 
		}
		
		tail = node;		
		size++;
	}
	
	
	
	
	// remove head node
	public EmployeeNode removeFromFront () {
		if (isEmpty()) {
			return null;
		}
		
		EmployeeNode removedNode = head;
		
		if (head.getNext() == null) {
			tail = null;
		} else  {
			head.getNext().setPrevious(null);
			
		}
		head = head.getNext();
		size --;
		
		removedNode.setNext(null);
		return removedNode;
		
	}
	
	// remove end node
	public EmployeeNode removeFromEnd () {
		if (isEmpty()) {
			return null;
		}		
		EmployeeNode removedNode = tail;
		
		
		if (tail.getPrevious() == null) {
			head = null;
		} else  {
			tail.getPrevious().setNext(null);
			
		}
		tail = tail.getPrevious();
		size --;
		
		removedNode.setPrevious(null);
		return removedNode;
		
	}
	
	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}
	
	public boolean isEmpty() {
		return head == null;
	}


	public void printList() {
		EmployeeNode current = head;
		System.out.print("HEAD ->");
		
		while (current != null) {
			System.out.print(current);
			System.out.print("-> ");
			current = current.getNext();
		}
		System.out.println(" null ");
		
	}
}

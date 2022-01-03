package lists;

public class EmployeeLinkedList {

	private EmployeeNode head;
	private int size;
	
	// head = new node
	public void addToFront(Employee employee) {
		EmployeeNode node= new EmployeeNode(employee);
		node.setNext(head);
		head = node;		
		size++;
	}
	
	// remove head node
	public EmployeeNode removeFromFront () {
		if (isEmpty()) {
			return null;
		}
		
		EmployeeNode removedNode = head;
		head = head.getNext();
		size --;
		removedNode.setNext(null);
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

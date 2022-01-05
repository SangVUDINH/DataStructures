package lists;

public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void insertSorted(Integer value) {
    	if (head == null || head.getValue() > value) {
    		addToFront(value);
    		return;
    	} 
    	
    	IntegerNode nodeToAdd = new IntegerNode(value);
		IntegerNode current = head;
		
    	while (current.getNext() !=null && current.getNext().getValue()< value) {
    		current = current.getNext();
    	}

    	nodeToAdd.setNext(current.getNext());
    	current.setNext(nodeToAdd);
    	size++;

    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}

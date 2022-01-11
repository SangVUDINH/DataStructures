package queues;

import lists.Employee;

public class MainQueue {

	public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones",123);
        Employee johnDoe = new Employee("John", "Doe",123);
        Employee marySmith = new Employee("mary", "Smith",123);
        Employee mikeWilson = new Employee("mike", "Wilson",123);
        
        ArrayQueue queue=  new ArrayQueue(4);
        
        queue.add(mikeWilson);
        queue.add(marySmith);
        
        
        queue.remove();
        queue.remove();
        
        queue.add(johnDoe);
        queue.add(janeJones);
        queue.add(marySmith);

        queue.printQueue();
        
        
        System.out.println(queue.peek());
	}
}

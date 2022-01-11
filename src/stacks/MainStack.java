package stacks;

import lists.Employee;

public class MainStack {

	public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones",123);
        Employee johnDoe = new Employee("John", "Doe",123);
        Employee marySmith = new Employee("mary", "Smith",123);
        Employee mikeWilson = new Employee("mike", "Wilson",123);

        
        LinkedStack stack = new LinkedStack();
        
        stack.push(janeJones);
        stack.push(johnDoe);
        stack.push(marySmith);
        stack.push(mikeWilson);
        
        stack.printStack();
	}

}

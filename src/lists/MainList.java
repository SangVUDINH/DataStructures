package lists;

import java.util.List;
import java.util.Vector;

public class MainList {

	
    public static void main(String[] args) {

        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));
        
        
        Employee janeJones = new Employee("Jane", "Jones",123);
        Employee johnDoe = new Employee("John", "Doe",123);
        Employee marySmith = new Employee("mary", "Smith",123);
        Employee mikeWilson = new Employee("mike", "Wilson",123);

        EmployeeDoubleLinkedList list = new EmployeeDoubleLinkedList();        
        System.out.println(list.isEmpty());
        
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToEnd(mikeWilson);
//        
//        list.removeFromFront();
        list.removeFromEnd();
        list.printList();
        System.out.println(list.getSize());
        
    }
}

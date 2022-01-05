package lists;

import java.util.Iterator;
import java.util.LinkedList;
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
//        list.addToEnd(mikeWilson);
        
        list.addBefore(mikeWilson, marySmith);
        list.printList();
        
//        LinkedList<Employee> list2 = new LinkedList<>();
//        list2.addFirst(janeJones);
//        list2.addFirst(johnDoe);
//        list2.addFirst(marySmith);
//        list2.addFirst(mikeWilson);
//        list2.addLast(mikeWilson);
//        Iterator iter = list2.iterator();
//        
//        while (iter.hasNext()){
//        	System.out.println(iter.next());
//        }
        
    }
}

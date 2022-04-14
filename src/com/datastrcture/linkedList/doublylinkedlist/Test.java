package com.datastrcture.linkedList.doublylinkedlist;

public class Test {

	public static void main(String[] args) {

		// create employee object
		Employee employee1 = new Employee(1001, "John Smith", "Engineering", 56456.567);
		Employee employee2 = new Employee(1002, "Marry Joe", "HR", 896456.567);
		Employee employee3 = new Employee(1003, "Kim Smith", "HR", 16456.567);
		Employee employee4 = new Employee(1004, "Will Smith", "Engineering", 57856.567);
		Employee employee5 = new Employee(1005, "Aria Stark", "Operations", 99056.567);

		// create instance of singly linked list
		DoublyLinkedList list = new DoublyLinkedList();

		System.out.println("List Size : "+list.size());
		System.out.println("List Empty : "+list.isEmpty());
		
		System.out.println("--------------------------------");
		list.addFirst(employee1);
		list.addFirst(employee2);
		list.addFirst(employee3);
		
		System.out.println("List Size : "+list.size());
		System.out.println("List Empty : "+list.isEmpty());
		
		list.addLast(employee4);
		list.addLast(employee5);
		System.out.println("--------------------------------");
		System.out.println("List Size : "+list.size());
		System.out.println("List Empty : "+list.isEmpty());
		
		System.out.println("----------------");
		Node reNode= list.removeFirst();
		System.out.println("Removed First Node :"+reNode);
		list.printList();
		
		
		System.out.println("----------------");
		Node laNode= list.removeLast();
		System.out.println("Removed Last Node :"+laNode);		
		System.out.println("----------------");
		list.printList();
		
	}

}

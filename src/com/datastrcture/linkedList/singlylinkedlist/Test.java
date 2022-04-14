package com.datastrcture.linkedList.singlylinkedlist;

public class Test {

	public static void main(String[] args) {

		// create employee object
		Employee employee1 = new Employee(1001, "John Smith", "Engineering", 56456.567);
		Employee employee2 = new Employee(1002, "Marry Joe", "HR", 896456.567);
		Employee employee3 = new Employee(1003, "Kim Smith", "HR", 16456.567);
		Employee employee4 = new Employee(1004, "Will Smith", "Engineering", 57856.567);
		Employee employee5 = new Employee(1005, "Aria Stark", "Operations", 99056.567);

		// create instance of singly linked list
		SinglyLinkedList list = new SinglyLinkedList();

		System.out.println("List Size : "+list.size());
		System.out.println("List Empty : "+list.isEmpty());
		
		// add to first
		list.addFirst(employee1);
		list.addFirst(employee2);
		list.addFirst(employee3);
		list.addFirst(employee4);
		list.addFirst(employee5);
		
		System.out.println("--------------------");
		System.out.println("List Size : "+list.size());
		System.out.println("List Empty : "+list.isEmpty());
		System.out.println("--------------------");
		
		list.removeFirst();
		
		System.out.println("--------------------");
		System.out.println("List Size : "+list.size());
		System.out.println("List Empty : "+list.isEmpty());
		System.out.println("--------------------");
		
		list.printList();
		
	}

}

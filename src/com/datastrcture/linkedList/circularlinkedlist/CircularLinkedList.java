package com.datastrcture.linkedList.circularlinkedlist;

public class CircularLinkedList {
	
	private Node head;
	private int size;
	private Node tail;
	
	// get size
	public int size() {
		return size;
	}
	
	// is empty
	public boolean isEmpty() {
		return head == null;
	}
	
	
	// add from last: add element from tail position
	public void add(Employee data) {
		// create a node
		Node node = new Node(data);
		// if list is empty
		if (isEmpty()) {
			head = node;
			tail = node;
		} else {
			tail.setNext(node);
		}
		// set tail as new node
		tail = node;
		// for circular reference
		tail.setNext(head);
		size++;
	}
		
	// remove first
	public Node remove() {
		// verfiy linked list empty
		if(isEmpty()) {
			return null;
		}
		// head is the remove node
		Node remove = head;
		// next node should be the head
		head = head.getNext();
		size--;
		
		// nullify the remove node
		remove.setNext(null);
		
		// for circular reference
		tail.setNext(head);
		return remove;
		
	}
	
	// print list
	public void printList() {
		Node current = head;
		
		if (current == null) {
			System.out.println("Circular Linked is empty !");
		} else {
			System.out.println("Head -> ");
			do {
				if(current !=null) {
					System.out.println(current);
					System.out.print(" -> ");
					current = current.getNext();
				}
			}while(current!=head);
		}
	}
}

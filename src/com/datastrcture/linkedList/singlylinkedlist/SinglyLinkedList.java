package com.datastrcture.linkedList.singlylinkedlist;

public class SinglyLinkedList {
	
	private Node head;
	private int size;
	
	// get size
	public int size() {
		return size;
	}
	
	// is empty
	public boolean isEmpty() {
		return head == null;
	}
	
	
	// add first
	public void addFirst(Employee data) {
		// create a node
		Node node = new Node(data);
		// Previous head is replaced 
		node.setNext(head);
		head = node;
		size++;
	}
		
	// remove first
	public Node removeFirst() {
		if(isEmpty()) {
			return null;
		}
		// head is the remove node
		Node remove = head;
		// next node should be the head
		head = head.getNext();
		size--;
		remove.setData(null);
		return remove;
		
	}
	
	// print list
	public void printList() {
		Node current = head;
		System.out.println("Head -> ");
		while(current!=null) {
			System.out.println(current);
			System.out.print(" -> ");
			current = current.getNext();
		}
		System.out.println("null");
	}
}

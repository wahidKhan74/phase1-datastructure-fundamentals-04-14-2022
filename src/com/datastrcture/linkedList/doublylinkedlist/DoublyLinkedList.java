package com.datastrcture.linkedList.doublylinkedlist;

public class DoublyLinkedList {

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

	// add first
	public void addFirst(Employee data) {
		// create a node
		Node node = new Node(data);
		if (isEmpty()) {
			tail = node;
		} else {
			head.setPrevious(node);
			node.setNext(head);
		}
		// new node as head
		head = node;
		size++;
	}

	// add last
	public void addLast(Employee data) {
		// create a node
		Node node = new Node(data);
		if (isEmpty()) {
			head = node;
		} else {
			tail.setNext(node);
			node.setPrevious(tail);
		}
		// new node as tail node
		tail = node;
		size++;
	}

	// remove first
	public Node removeFirst() {
		// if list empty return null
		if (isEmpty()) {
			return null;
		}
		// head is the remove node
		Node remove = head;
		// only one element
		if (head.getNext() == null) {
			tail = null;
		} else {
			head.getNext().setPrevious(null);
		}

		// next node should be the head
		head = head.getNext();
		size--;
		remove.setNext(null);
		return remove;

	}

	// remove last
	public Node removeLast() {
		// if list empty return null
		if (isEmpty()) {
			return null;
		}
		// head is the remove node
		Node remove = tail;
		// only one element
		if (tail.getPrevious()== null) {
			head = null;
		} else {
			tail.getPrevious().setNext(null);
		}

		// next node should be the head
		tail = tail.getPrevious();
		size--;
		remove.setPrevious(null);
		return remove;

	}

	// print list
	public void printList() {
		Node current = head;
		System.out.println("Head => ");
		while (current != null) {
			System.out.println(current);
			System.out.print(" <=> ");
			current = current.getNext();
		}
		System.out.println("<= Tail");
	}
}

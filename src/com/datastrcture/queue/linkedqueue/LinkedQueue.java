package com.datastrcture.queue.linkedqueue;

import java.util.LinkedList;

public class LinkedQueue {

	// create linked list based queue
	private LinkedList<Employee> queue;

	// create stack
	LinkedQueue() {
		queue = new LinkedList<Employee>();
	}

	// size
	public int size() {
		return queue.size();
	}

	// is empty
	public boolean isEmpty() {
		return queue.isEmpty();
	}

	// push
	public void add(Employee data) {
		queue.addLast(data);
	}

	// pop
	public Employee remove() {
		return queue.removeFirst();
	}

	// peek
	public Employee peek() {
		return queue.getFirst();
	}

	// print stack
	public void printQueue() {
		System.out.println("front :> ");
		for (Employee emp : queue) {
			System.out.println(emp);
		}
	}
}

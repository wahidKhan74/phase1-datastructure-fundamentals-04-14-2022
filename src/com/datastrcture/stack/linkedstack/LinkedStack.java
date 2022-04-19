package com.datastrcture.stack.linkedstack;

import java.util.LinkedList;

public class LinkedStack {

	// create linkedlist based stack
	private LinkedList<Employee> stack;
	
	// create stack
	LinkedStack(){
		stack = new LinkedList<Employee>();
	}
	
	// size
	public int size() {
		return stack.size();
	}
	
	// is empty
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	// push
	public void push(Employee data) {
		stack.push(data);
	}
	
	// pop
	public Employee pop() {
		return stack.pop();
	}
	
	// peek
	public Employee peek() {
		return stack.peek();
	}
	
	// print stack
	public void printStack() {
		System.out.println("Top :> ");
		for(Employee emp : stack) {
			System.out.println(emp);
		}
	}
}

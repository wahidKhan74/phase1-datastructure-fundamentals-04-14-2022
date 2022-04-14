package com.datastrcture.linkedList;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// collection framework : LinkedList
		LinkedList<String> userList = new LinkedList<String>();

		userList.add("John Smith");
		userList.add("Will Smith");
		userList.add("Mike Smith");
		userList.add("Aria Smith");

		System.out.println("List empty :: " + userList.isEmpty());
		System.out.println("List empty :: " + userList.size());
		
		System.out.println("----------------");
		
		// add data element first
		userList.addFirst("Marray Smith");

		// add data element last
		userList.addLast("Kim Smith");

		// remove first
		userList.removeFirst();		
		
		// remove last
		userList.removeLast();

		System.out.println(userList);
	}

}

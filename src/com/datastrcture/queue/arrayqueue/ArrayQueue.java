package com.datastrcture.queue.arrayqueue;

public class ArrayQueue {

	private int front;
	private int rear;
	private Employee[] queue;

	// create a queue
	public ArrayQueue(int capacity) {
		queue = new Employee[capacity];
	}

	// get capacity
	public int capacity() {
		return queue.length;
	}

	// get size
	public int size() {
		return rear-front;
	}

	// is empty
	public boolean isEmpty() {
		return size() == 0;
	}
	
	// add :: add element in the rear end
	public void add(Employee data) {
		// queue is full :: increase capacity of the queue
		if(rear==queue.length) {
			// double queue size
			Employee[] newArr = new Employee[2*queue.length];
			System.arraycopy(queue, 0, newArr, 0, queue.length);
			queue = newArr;
		}		
		// add value in queue
		queue[rear++] = data;
	}
	
	// remove :: remove element from front end
	public Employee remove() {
		// is empty queue
		if(isEmpty()) {
			rear = 0;
			front = 0;
			return null;
		}
		// remove front element
		Employee remove = queue[front];
		queue[front] = null;
		front++;
		return remove;
	}
	
	// peek  :: front element
	public Employee peek() {
		// verify queue is empty
		if(size()==0) {
			rear = 0;
			front = 0;
			return null;
		}
		return queue[front];
	}
	
	// print queue
	public void printQueue() {
		System.out.println(" Front -> ");
		for (int index = front; index < rear; index++) {
			System.out.println(queue[index]);
		}
		System.out.println(" <- Rear ");
	}
	
	
}

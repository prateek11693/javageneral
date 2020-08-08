package com.general.general;

import java.util.NoSuchElementException;

public class LinkedList {

	private class Node {

		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
		}
	}

	private Node first;
	private Node last;

	public void addLast(int item) {
		Node node = new Node(item);
		if ( first == null) {
			first = last = node;
		} else {
			last.next = node;
			last = node;
		}

	}

	public void addFirst(int item) {
		Node node = new Node(item);
		if (first == null) {
			first = last = node;
		} else {
			node.next = first;
			first = node;
		}

	}

	public int indexOf(int item) {
		int index = 0;
		Node current = first;
		while (current != null) {
			if (current.value == item)
				return index;
			else {
				current = current.next;
				index++;
			}
		}

		return -1;
	}

	public boolean contains(int item) {
		Node current = first;
		while (current != null) {
			if (current.value == item)
				return true;
			else {
				current = current.next;
			}
		}
		return false;

	}

	public void print() {
		Node current = first;
		while (current != null) {
			System.out.println(current.value);
			current = current.next;
		}
	}

	public void removeFirst() {

		if (first == null)
			throw new NoSuchElementException();
		if (first == last) {
			first = last;
			return;
		}
		Node second = first.next;
		first.next = null;
		first = second;
	}

	public void removeLast() {
		if (first == null)
			throw new NoSuchElementException();
		if (first == last) {
			first = last = null;
			return;
		}
		Node previous = getPreviousNode(last);
		last = previous;
		last.next = null;

	}

	private Node getPreviousNode(Node node) {

		Node current = first;
		while (current.next != node) {
			if (current.next == node)
				break;
			current = current.next;
		}
		return current;
	}
	
	public int size() {
		int size=0;
		if(first==null)return 0;
		if(first==last) {
			return 1;
		}
		Node current=first;
		while(current!=null) {
			size++;
			current=current.next;
		}
	
		return size;
	}

}

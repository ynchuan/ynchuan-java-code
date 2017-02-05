package com.ynchuan.code.iterator;

public class LinkedList implements Collection {
	Node headNode = new Node();
	Node currentNode;
	int size = 0;

	@Override
	public void add(Object o) {
		if (size == 0) {
			headNode.o = o;
			headNode.node = null;
			currentNode = headNode;
		} else {
			Node nextNode = new Node();
			nextNode.o = o;
			nextNode.node = null;
			currentNode.node = nextNode;
			currentNode = nextNode;

		}
		size++;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void show() {
		Node iteNode = headNode;
		while (true) {
			if (iteNode == null)
				break;
			else {
				System.out.println(iteNode.o.toString());
				iteNode = iteNode.node;
			}
		}
	}

	@Override
	public Iterator iterator() {

		return new Iterator() {
			Node iteNode = headNode;

			@Override
			public boolean hasNext() {
				if (iteNode != null) {
					return true;
				} else {
					return false;
				}
			}

			@Override
			public Object next() {
				Node n=iteNode;
				iteNode = iteNode.node;
				return n;
			}

		};
	}
}

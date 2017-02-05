package com.ynchuan.code.iterator;

public class LinedList_restruct {
	Node headNode = null;
	Node currentNode = null;
	int size = 0;

	public void add(Object o) {
		Node n = new Node(o, null);
		if (size == 0) {
			headNode = n;
			currentNode = n;
		} else {
			currentNode.node = n;
			currentNode = n;
		}
		size++;
	}

	public int size() {
		return size;
	}
}

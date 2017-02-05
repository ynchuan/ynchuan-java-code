package com.ynchuan.code.iterator;

public class Node {
	public Object o;
	public Node node;

	public Node() {
		super();
	}

	public Node(Object o, Node n) {
		this.o = o;
		this.node = n;
	}

	public Object getO() {
		return o;
	}

	public void setO(Object o) {
		this.o = o;
	}

	public Node getNode() {
		return node;
	}

	public void setNode(Node node) {
		this.node = node;
	}

	@Override
	public String toString() {
		return o.toString();
	}

}

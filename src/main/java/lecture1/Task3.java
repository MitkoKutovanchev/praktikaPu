package lecture1;

import java.util.ArrayList;
import java.util.List;

public class Task3 {

	public static void main(String[] args) {
		CustomLinkedList<Integer> list = new CustomLinkedList();
		list.insert(2);
		list.insert(3);
		list.insert(1);
		list.insert(6);
		list.insert(4);
		
		list.print();
		
		System.out.println("....................................................");
		
		list.addFirst(100);
		list.print();
		System.out.println("....................................................");
		list.removeFirst();
		
		list.print();
	}

	
}

class CustomLinkedList<T> {
	private Node<T> lastNode;
	private List<Node<T>> elements;
	
	public CustomLinkedList() {
		setElements(new ArrayList<>());
	}
	
	public void insert(T data) {
		Node<T> newNode = new Node(data);
		
		if(lastNode == null) {
			lastNode = newNode;
		} else {
			lastNode.setNext(newNode);
			lastNode = newNode;
		}
		
		elements.add(newNode);
	}
	
	public void addFirst(T data) {
		Node<T> newFirstNode = new Node(data);
		Node<T> currentFirst = null;
		
		List<Node<T>> secondaryElements = new ArrayList<>();
		for (Node<T> node : elements) {
			if(node.getNext() != null) {
				secondaryElements.add(node.getNext());
			}
		}
		
		for (Node<T> node : elements) {
			if(node.getNext() == null || secondaryElements.contains(node)) {
				continue;
			}
			
			currentFirst = node;
		}
		
		newFirstNode.setNext(currentFirst);
		elements.add(newFirstNode);
	}
	
	public void removeFirst() {
		Node<T> currentFirst = null;
		
		List<Node<T>> secondaryElements = new ArrayList<>();
		for (Node<T> node : elements) {
			if(node.getNext() != null) {
				secondaryElements.add(node.getNext());
			}
		}
		
		for (Node<T> node : elements) {
			if(node.getNext() == null || secondaryElements.contains(node)) {
				continue;
			}
			
			currentFirst = node;
		}
		
		elements.remove(currentFirst);
	}
	
	public void print() {
		for (Node<T> node : elements) {
			if(node.getNext() != null) {
				System.out.println(node.getData() + " and the next elements data is: " + node.getNext().getData());
			} else {
				System.out.println(node.getData() + " and this is the last element");
			}
		}
	}

	public Node<T> getLastNode() {
		return lastNode;
	}

	public void setLastNode(Node<T> node) {
		this.lastNode = node;
	}

	public List<Node<T>> getElements() {
		return elements;
	}

	public void setElements(List<Node<T>> elements) {
		this.elements = elements;
	}
}

class Node<T> {
	private T data;
	private Node<T> next;
	
	public Node(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
}

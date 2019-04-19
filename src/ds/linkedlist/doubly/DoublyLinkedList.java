package ds.linkedlist.doubly;

public class DoublyLinkedList {

	private Node first;
	private Node last;

	public DoublyLinkedList(Node first, Node last) {
		this.first = null;
		this.last = null;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if (isEmpty()) {
			last = newNode;//if empty, last will refer to the new Node being created
		} else {
			first.previous = newNode;
		}
		newNode.next = first;//the new node's next field will point to the old first
		this.first = newNode;
	}

	public void insertLast(int date) {
		Node newNode = new Node();
		newNode.data = date;
		if (isEmpty()) {
			first = newNode;
		} else {
			last.next = newNode;//assigning old last to newnode
			last.previous = last;//the old last will be the newnodes previous
		}
		last = newNode;//the linkedList's last field should point to the new node
	}

	//assume non-empty list
	public Node deleteFirst() {
		Node temp = first;
		if (first.next == null) {//there is only one item in the list
			last = null;
		} else {
			first.next.previous = null;
		}
		first = first.next;//we are assigning the reference of the node following the old first node to the first field in the linkedlist object
		return temp;//return the deleted old first node
	}

	//assume non=empty list
	public Node deleteLast() {
		Node temp = last;
		if (isEmpty()) {
           last=null;
		} else {
           last.previous.next=null;
		}
		return temp;
	}


}

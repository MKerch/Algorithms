package ds.linkedlist.circular;

public class CircularLinkedList {

	private Node first;
	private Node last;

	public CircularLinkedList() {
		first = null;
		last = null;
	}

	//used to insert at the beginning of the list
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if (isEmpty()) {
			last = newNode;
		}
		newNode.next = first;//newNode --> old first
		first = newNode;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public int deleteFirst() {
		int temp = first.data;
		if (first.next == null) {
			last = null;
		}
		first = first.next;//first will point to old's next value
		return temp;
	}

	public void displayList() {
		System.out.println("list (first-->last) ");
		Node current = first;
		while (current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println("");
	}

	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if (isEmpty()) {
			first = newNode;
		} else {
			last.next = newNode;//the next value of the last note will be point to the new node
			last = newNode;//we make the new node we created be the last one in the list
		}
	}
}

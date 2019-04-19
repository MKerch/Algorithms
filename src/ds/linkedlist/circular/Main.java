package ds.linkedlist.circular;

public class Main {

	public static void main(String[] args) {
		CircularLinkedList linkedList = new CircularLinkedList();
		linkedList.insertFirst(100);
		linkedList.insertFirst(50);
		linkedList.insertFirst(99);
		linkedList.insertFirst(88);
		linkedList.insertLast(9999999);

		linkedList.displayList();
	}
}

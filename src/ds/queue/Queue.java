package ds.queue;

public class Queue {

	private int maxSize;//set number of slots
	private long[] queueArray;//slots ro maintain the data;
	private int front;//index position for the element in the front
	private int rear;//index position for the element in the back of the line(задний)
	private int nItems; //counter to maintain the number of items in our queue

	public Queue(int size) {
		this.maxSize = size;
		this.queueArray = new long[size];
		front = 0;//index position of the first slot of the array
		rear = -1;// there is no item in the array yet tio be considered as the last item.
		nItems = 0;//we dont have elements in the array yet
	}

	public void insert(long j) {
		if (rear == maxSize-1) {
			rear = -1;
		}
		rear++;
		queueArray[rear] = j;
		nItems++;
	}

	public long remove() {//remove item from the front of the queue
		long temp = queueArray[front];
		front++;
		if (front == maxSize) {
			front = 0;//we can set front back to the 0th index so we can utilize the entire array again
		}
		nItems--;
		return temp;
	}

	public long peekFront() {
		return queueArray[front];
	}

	public boolean isEmpty() {
		return (nItems == 0);
	}

	public boolean isFull() {
		return (nItems == maxSize);
	}

	public void view() {
		System.out.print("[ ");
		for (int i = 0; i < queueArray.length; i++) {
			System.out.print(queueArray[i] + " ");
		}
		System.out.print("]");
	}
}

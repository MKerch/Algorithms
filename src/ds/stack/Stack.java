package ds.stack;

public class Stack {

	private int maxSize;
	private char[] stackArray;
	private int top;

	public Stack(int size) {
		this.maxSize = size;
		this.stackArray = new char[maxSize];
		this.top = -1;//index
	}

	public void push(char j) {//add
		if (isFull()) {
			System.out.println("It is full");
		} else {
			top++;
			stackArray[top] = j;
		}
	}

	public char pop() {//delete
		if (isEmpty()) {
			System.out.println("Its empty");
			return '0';
		} else {
			int old_top = top;
			top--;
			return stackArray[old_top];
		}
	}

	public char peak() {//get
		return stackArray[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (maxSize - 1 == top);
	}

}

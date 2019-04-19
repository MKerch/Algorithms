package adt;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		Counter counter = new Counter("MyCounter");
		counter.increment();
		counter.increment();
		counter.increment();
		counter.increment();
		//System.out.println(counter.getCurrentValue());
	}

}

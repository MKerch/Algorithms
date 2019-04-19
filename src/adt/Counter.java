package adt;

public class Counter {

	private String name;
	private int value;

	public Counter(String name) {
		this.name = name;
	}
	public void increment(){
		value++;
	}

	public int getCurrentValue(){
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Counter{" +
				"name='" + name + '\'' +
				'}';
	}
}

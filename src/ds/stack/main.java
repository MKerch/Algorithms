package ds.stack;

public class main {
	public static void main(String[] args) {

//		Stack stack = new Stack(3);
//		stack.push('a');
//		stack.push('s');
//		stack.push('d');
//		stack.push('f');
//		while (!stack.isEmpty()){
//			long value = stack.pop();
//			System.out.println(value);
//		}
		String s = reverseString("Hello");
		System.out.println(s);
	}

//	public static String reverseString(String s){
//		String str = new String();
//		char[] array = s.toCharArray();
//		for(int i=array.length-1;i>=0;i--){
//			str+=array[i];
//		}
//		return str;
//	}

	public static String reverseString(String s) {
		Stack stack = new Stack(s.length());
		String string = new String();
		char[] chars = s.toCharArray();
		for (char ch : chars) {
			stack.push(ch);
		}
		while (!stack.isEmpty()) {
			string += stack.pop();
		}
		return string;
	}

}

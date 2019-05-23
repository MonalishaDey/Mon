package stack;

import java.util.Iterator;
import java.util.Stack;

public class StackMethods {

	public static void main(String[] args) {
		Stack<String>st = new Stack<String>();
		st.push("mona");
		st.push("mona1");
		st.push("mona2");
		st.push("mona3");
		st.push("mona5");
		System.out.println(st);
		System.out.println(st.peek());
		st.pop();
		System.out.println(st.peek());
		st.pop();
		/*
		 * Iterator<String>it = st.iterator(); while(it.hasNext()) {
		 * System.out.println(it.next()); } System.out.println();
		 */

	}

}

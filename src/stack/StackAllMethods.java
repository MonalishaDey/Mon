package stack;

import java.util.EmptyStackException;
import java.util.List;

public class StackAllMethods {

	Node top;
	int length;

	class Node {
		private int data;
		private Node next;

		public Node(int data) {

			this.data = data;
		}

	}

	public boolean isEmpty() {
		if (top == null) {
			return false;
		}
		return false;
	}

	private void push(int data) {
		Node newNode = new Node(data);
		newNode.next = top;
		top = newNode;
		length++;
		System.out.print(top.data + " , ");

	}

	public int peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return top.data;

	}

	public int pop() {
		int result = top.data;
		top = top.next;
		length--;
		return result;
	}

	public static void main(String[] args) {
		StackAllMethods st = new StackAllMethods();
		st.push(10);
		st.push(13);
		st.push(26);
		st.push(5);
		st.push(87);
		System.out.println(" ");
		System.out.println(st.peek());
		st.pop();
		System.out.println(st.peek());
		System.out.println(st.pop());

	}

}

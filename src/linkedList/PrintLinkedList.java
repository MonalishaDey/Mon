package linkedList;

public class PrintLinkedList {

	static Node head;

	static class Node {

		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public static void main(String[] args) {
		PrintLinkedList pll = new PrintLinkedList();
		pll.head = new Node(1);
		Node sec = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		pll.head.next = sec;
		sec.next = third;
		third.next = fourth;
		printValue();
	}

	private static void printValue() {

		while (head != null) {
			System.out.print(head.data + " , ");
			head = head.next;
		}

	}
}

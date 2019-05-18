package linkedList;

public class PrintList {
	
	
	static class Node{
		int data ;
		Node next;
		public Node(int data) {
			this.data = data;
		}
		
	}

	public static void main(String[] args) {
		//PrintList pl = new PrintList();
		Node head = new Node(1);
		Node sec = new Node(2);
		Node third = new Node(3);
		Node four = new Node(4);
		
		System.out.println(head.data +":"+ head.next);
		System.out.println(sec.data +":"+ sec.next);
		System.out.println(third.data +":"+ third.next);
		
		head.next = sec; 
		sec.next = third;
		third.next = four;
		
		System.out.println(head.data +":"+ head.next);
		System.out.println(sec.data +":"+ sec.next);
		System.out.println(third.data +":"+ third.next);
		System.out.println(four.data +":"+ four.next);

		
		
		

	}

}

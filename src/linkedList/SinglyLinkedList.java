package linkedList;

public class SinglyLinkedList {
	
	private  Node head ;
	public void display (Node head) {
		if(head==null)
		{
			return;
		}
		Node current = head;
		while(current!=null)
		{
			System.out.print(current.data +" , ");
			current = current.next; 
		}
		System.out.print(current);
	}
	
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		Node sec  = new Node(2);
		Node third  = new Node(3);
		Node fourth  = new Node(4);
		head.next = sec;
		sec.next = third;
		third.next = fourth;
		SinglyLinkedList sl = new SinglyLinkedList();
		sl.display(head);


	}

	

}

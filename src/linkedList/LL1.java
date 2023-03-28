package linkedList;

public class LL1 {
	class Node {
		int val;
		Node next;

		public Node(int val) {
			this.val = val;
		}
	}

	static Node head = null;
	Node tail = null;

	public void addNodeAtEnd(int val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			newNode.next = null;
			tail = newNode;
		}
	}
	
	public void addAtBeginning(int val) {
		Node newNode=new Node(val);
		newNode.next=head;
		head=newNode;
	}
	
	public void addAtSpecifiedIndex(int val,int index) {
		Node curr=head;
		int count=1;
		
		Node newNode=new Node(val);
		while(curr!=null && count!=index-1) {
			curr=curr.next;
			count++;
		}
		Node temp=curr.next;
		curr.next=newNode;
		newNode.next=temp;
	}
	
	public void deleteNodeEnd() {
		Node current=head;
		while(current.next.next!=null) {
			current=current.next;
		}
		current.next=null;
		tail=current;
	}
	
	public void deleteNodeBeginning() {
		head=head.next;
	}

	public void deleteAtSpecifiedIndex(int index) {
		int count =1;
		Node curr=head;
		while(curr!=null && count!=index-1) {
			curr=curr.next;
			count++;
		}
		Node temp=curr.next.next;
		curr.next=temp;
	}
	
	public void printLinkedList(Node head) {
		Node current = head;
		while (current != null) {
			System.out.println(current.val);
			current = current.next;
		}
	}
	
	public void size(Node head) {
		int count=0;
		Node current=head;
		while(current!=null) {
			count++;
			current=current.next;
		}
		System.out.println("size of linked list = "+count);
	}
	
	public void reverseList(Node head) {
		Node next;
		Node current=head;
		Node prev=null;
		
		while(current!=null) {
			next=current.next;
			current.next=prev;
			
			prev=current;
			current=next;
		}
		printLinkedList(prev);
	}

	public static void main(String[] args) {
		LL1 l1=new LL1();
		l1.addNodeAtEnd(1);
		l1.addNodeAtEnd(2);
		l1.addNodeAtEnd(3);
		l1.addNodeAtEnd(4);
		l1.addAtBeginning(0);
		//l1.deleteNodeEnd();
		//l1.deleteNodeBeginning();
		//l1.addAtSpecifiedIndex(6, 3);
		l1.deleteAtSpecifiedIndex(2);

		l1.printLinkedList(head);
		l1.size(head);
		//l1.reverseList(head);
	}

}

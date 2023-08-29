package alpha.linkedLIst;

public class Reverse_LL {

	public static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public static Node head;
	public static Node tail;
	public static int size;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse_LL ll= new Reverse_LL();
		ll.print();
		ll.addFirst(2);
		ll.print();
		ll.addFirst(1);
		ll.print();
		ll.addLast(4);
		ll.print();
		ll.addLast(5);
		ll.print();
		ll.add(2,3);
		ll.print();
		ll.reverse();
		ll.print();
		
		
		

	}
	public void reverse() {
		Node prev=null;
		Node curr=tail=head;
		Node next;
		
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head= prev;
	}
	
	
	
	
	//below codes are the basic code already done in our 1st program
	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		size++;
		if(head==null) {
			head=tail=newNode;
			return;			//forgot to write this line and the code was running 
							//infinitely after printing first node
		}
		newNode.next=head;
		head=newNode;
	}
	
	
	public void addLast(int data) {
		Node newNode =new Node(data);
		size++;
		if(head==null) {
			head=tail=newNode;
			return;
		}
		tail.next=newNode;
		tail=newNode;
	}
	
	
	public void print() {
		if(head==null) {
			System.out.println("LinkedList is Empty");
			return;
		}
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("null");
		
	}
	
	
	public void add(int index, int data) {
		if(index==0) {
			addFirst(data);
			return;
		}
		Node newNode=new Node(data);
		size++;
		Node temp=head;
		int i=0;
		
		while(i<index-1) {
			temp=temp.next;
			i++;
		}
		newNode.next=temp.next;
		temp.next=newNode;	
	}
	
	
	public int removeFirst() {
		if(size==0) {
			System.out.println("LL is empty");
			return Integer.MIN_VALUE;
		}
		else if(size==1) {
			int val=head.data;
			head=tail=null;
			size=0;
			return val;
		}
		int val=head.data;
		head=head.next;
		size--;
		return val;
	}
	
	
	public int removeLast() {
		if(size==0) {
			System.out.println("LL is empty");
			return Integer.MIN_VALUE;
		}
		else if(size==1) {
			int val=head.data;
			head=tail=null;
			size=0;
			return val;
		}
		Node prev=head;
		for(int i=0;i<size-2;i++) {
			prev=prev.next;
		}
		int val=prev.next.data;
		prev.next=null;
		tail=prev;
		size--;
		return val;
	}
	
	
}

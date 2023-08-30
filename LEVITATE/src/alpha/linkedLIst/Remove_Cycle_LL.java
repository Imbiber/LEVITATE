package alpha.linkedLIst;

import alpha.linkedLIst.Detect_Cycle_LL.Node;

public class Remove_Cycle_LL {
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
		Remove_Cycle_LL ll = new Remove_Cycle_LL();
		head=new Node(1);
		Node temp =new Node(2);
		head.next = temp;
		head.next.next= new Node(3);
		head.next.next.next= temp;
		System.out.println("Printing cycle in LL will end up with an infinte loop.");
		System.out.println("Does the LL contains cycle?-> "+isCycle());
		removeCycle();
		System.out.println("after running remove cycle function");
		System.out.println("Does the LL contains cycle?-> "+isCycle());
		ll.print();

	}
	
	public static void removeCycle() {
		//detect cycle
		Node slow=head;
		Node fast=head;
		boolean cycle=false;
		
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast) {
				cycle = true;
				break;
			}
		}
		if(cycle==false) {
			return ;
		}
		
		//meeting point
		slow = head;
		Node prev= null;
		while(slow!=fast) {
			prev=fast;
			slow=slow.next;
			fast=fast.next;
		}
		
		//remove cycle
		prev.next=null;
	
	}
	
	public static boolean isCycle() {
		Node slow=head;
		Node fast=head;
		
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast) {
				return true;
			}
		}
		return false;
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


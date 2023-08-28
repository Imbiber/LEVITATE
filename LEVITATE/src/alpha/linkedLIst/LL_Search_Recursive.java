package alpha.linkedLIst;


public class LL_Search_Recursive {
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
		LL_Search_Recursive ll= new LL_Search_Recursive();
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
		
		System.out.println(" "+ll.recSearch(3));
		
		System.out.println(" "+ll.recSearch(10));
		
		

	}
	public int helper(Node head, int key) {
		if(head==null) {
			return -1;
		}
		if(head.data==key) {
			return 0;
		}
		int index=helper(head.next,key);
		if(index==-1) {
			return -1;
		}
		return index+1;
	}
	
	
	public int recSearch(int key) {
		
		return helper(head,key);
		
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



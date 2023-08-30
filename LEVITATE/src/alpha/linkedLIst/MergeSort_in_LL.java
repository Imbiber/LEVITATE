package alpha.linkedLIst;

public class MergeSort_in_LL {
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
		MergeSort_in_LL ll = new MergeSort_in_LL();
		
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addFirst(3);
		ll.addFirst(4);
		ll.addFirst(5);
		
		ll.print();
		ll.head=ll.mergeSort(ll.head);
		ll.print();

	}
	
	public Node getMid(Node head) {
		Node slow=head;
		Node fast=head.next; //to get mid as slow's last node
	
	while(fast!=null && fast.next !=null) {
		slow =slow.next;
		fast= fast.next.next;
	}
	return slow; // this will return mid node
	
	}
	
	public Node merge(Node head1, Node head2) {
		Node mergedLL=new Node(-1);
		Node temp = mergedLL;
		
		while(head1!=null && head2!=null) {
			if(head1.data<=head2.data) {
				temp.next=head1;
				head1=head1.next;
				temp = temp.next;
			}
			else {
				temp.next=head2;
				head2=head2.next;
				temp=temp.next;
			}
			while(head1!=null) {
				temp.next=head1;
				head1=head1.next;
				temp=temp.next;
			}
			while(head1!=null) {
				temp.next=head2;
				head2=head2.next;
				temp=temp.next;
			}
			
		}
		return mergedLL.next;
	}
		
		public Node mergeSort(Node head) {
			if(head==null|| head.next==null) {
				return head;
			}
			Node mid = getMid(head);
			
			Node rightHead=mid.next;
			mid.next=null;
			Node newLeft =mergeSort(head);
			Node newRight= mergeSort(rightHead);
			
			return merge(newLeft,newRight);
		
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


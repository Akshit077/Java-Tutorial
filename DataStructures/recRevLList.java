package DataStructures;

//Java program to reverse a linked list using recursion
public class recRevLList {

	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
		}
	}
		Node head;
		void addEdge(int x)
		{
			Node temp=new Node(x);
			temp.next=head;
			head=temp;
		}
	Node recRevLlist(Node head)
	{
		if(head==null)
			return null;
		if(head.next==null)
			return head;
		Node rest_head=recRevLlist(head.next);
				Node rest_tail=head.next;
		rest_tail.next=head;
		head.next=null;
		return rest_head;
	}
	void print()
	{
		Node p=head;
		while(p!=null)
		{
			System.out.print(p.data+" ");
			p=p.next;
		}
	}
	public static void main(String[] args) {
		recRevLList l1=new recRevLList();
		l1.addEdge(10);
		l1.addEdge(20);
		l1.addEdge(30);
		l1.addEdge(40);
		l1.print();
		l1.head=l1.recRevLlist(l1.head);
		System.out.println();
		l1.print();
	}	
		
	}



package DataStructures;

// Java program to check the loop in linked list by modifying the structure of linked list
public class loopInLList {
	
	class Node
	{
		int data;
		Node next;
		boolean Visited;// Initialize a visited variable inside node structure.
		
		Node(int d)
		{
			data=d;
			next=null;
			Visited=false;// Initially all the node visited part is false.
		}
	}
	Node head;
	void addEdge(int x)
	{
		Node temp=new Node(x);
		temp.next=head;
		head=temp;
	}
	void print()
	{
		Node pNode=head;
		while(pNode!=null)
		{
			System.out.println(pNode.data+" ");
			pNode=pNode.next;
		}
	}
	boolean isVisited(Node head)
	{
		Node curr=head;
		while(curr!=null)
		{
			curr=curr.next;
			curr.Visited=true;
		if(curr.Visited==false)// Check whether visited of a node is false the return loop is present
		{
			return true;
		}
		}
			return false;
	}
	public static void main(String[] args) {
		loopInLList l1=new loopInLList();
		l1.addEdge(10);
		l1.addEdge(20);
		l1.addEdge(30);
		l1.addEdge(40);
		l1.head.next=l1.head;
		//System.out.println("list is");
		//System.out.println();
		//l1.print();
		boolean p=l1.isVisited(l1.head);
		if(p)
		{
			System.out.println("LOOP PRESENT");
		}
		else 
		{
			System.out.println("Not present");
		}
	}

}

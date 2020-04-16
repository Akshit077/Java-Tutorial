package DataStructures;

//Java program to reverse a linked list in groups of k(given).
public class rev_inGroups {

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
	Node reverse(Node head, int k)
	{
		int count=0;
		Node curr=head;
		Node prev=null;
		Node cNode=null;
		while(curr!=null&&count<k){
		cNode=curr.next;
		curr.next=prev;
		prev=curr;
		curr=cNode;
		count++;
		}
		if(cNode!=null)
		{
			Node rest_head=reverse(cNode, k);
			head.next=rest_head;
		}
		return prev;
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
		rev_inGroups a1=new rev_inGroups();
		
		a1.addEdge(10);
		a1.addEdge(20);
		a1.addEdge(30);
		a1.addEdge(40);
		a1.addEdge(50);
		a1.print();
		System.out.println();
		System.out.println("reverse in k list");
		a1.head=a1.reverse(a1.head,3);
		a1.print();
	}

}

package DataStructures;
public class pairWiseSwap {

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
	void print()
	{
		Node pNode=head;
		while(pNode!=null){
			System.out.print(pNode.data+" ");
			pNode=pNode.next;
		}
	}
	Node Swap(Node head)
	{
		if(head==null||head.next==null)
			return head;
		Node curr=head.next.next;
		Node prev=head;
		head=head.next;
		head.next=prev;
		while(curr!=null&&curr.next!=null)
		{
			prev.next=curr.next;
			prev=curr;
			Node xNode=curr.next.next;
			curr.next.next=curr;
			curr=xNode;
		}
		prev.next=curr;
		return head;
	}
	public static void main(String[] args) {
		
		pairWiseSwap p1=new pairWiseSwap();
		p1.addEdge(345);
		p1.addEdge(5);
		p1.addEdge(6);
		p1.addEdge(8);
		p1.addEdge(9);
		p1.addEdge(7);
		p1.addEdge(10);
		System.out.println("Original List");
		p1.print();
		p1.head=p1.Swap(p1.head);
		System.out.println();
		System.out.println("Modified List");
		p1.print();
	}

}

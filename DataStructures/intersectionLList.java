package DataStructures;

//Java program to find intersection point in two linked list of head1 and head2.
public class intersectionLList {
	
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
		}
	}
	Node head1;
	Node head2;
	void addEdge(int x)
	{
		Node temp=new Node(x);
		temp.next=head1;
		head1=temp;
	}
	void addEdge2(int x)
	{
		Node temp1=new Node(x);
		temp1.next=head2;
		head2=temp1;
	}
	static void intersectionPoint(Node head1,Node head2)
	{
		Node first=head1;
		Node second=head2;
		
		for(first=head2;first!=null;first=first.next)
		{
			for(second=head1;second!=null;second=second.next)
			{
				if(first.data==second.data)
				{
					 int point=first.data;
					 System.out.println(point);
					 return;
				}
			}
		}
	}
		public static void main(String[] args) {
			
			intersectionLList l1=new intersectionLList();
			l1.addEdge(15);
			l1.addEdge(12);
			l1.addEdge(10);
			l1.addEdge(7);
			l1.addEdge(8);
			l1.addEdge(5);
			l1.addEdge2(15);
			l1.addEdge2(12);
			l1.addEdge2(10);
			l1.addEdge2(9);
			l1.addEdge2(3);
			l1.addEdge2(1);
			intersectionPoint(l1.head1,l1.head2);
	}

}

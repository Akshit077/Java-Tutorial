package DataStructures;

public class segregateEvenOdd {

	class Node{
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
		Node p=head;
		while(p!=null)
		{
			System.out.print(p.data+" ");
			p=p.next;
		}
	}
	void segregate()
	{
		Node eS=null;
		Node eE=null;
		Node oS=null;
		Node oE=null;
		for(Node curr=head;curr!=null;curr=curr.next)
		{
			int x=curr.data;
			if(x%2==0)
			{
				if(eS==null)
				{
					eS=curr;
					eE=eS;
				}
				else {
					eE.next=curr;
					eE=eE.next;
				}
			}
			else {
					if(oS==null)
					{
						oS=curr;
						oE=oS;
					}
					else {
						oE.next=curr;
						oE=oE.next;
					}
				}
			}
		if(eS==null||oS==null)
		{
			return;
		}
		eE.next=oS;
		oE.next=null;
		head=eS;
		}
	public static void main(String[] args) {
		
		segregateEvenOdd l1=new segregateEvenOdd();
		l1.addEdge(4);
		l1.addEdge(5);
		l1.addEdge(10);
		l1.addEdge(12);
		l1.addEdge(8);
		l1.addEdge(15);
		l1.addEdge(17);
		System.out.println("Original list");
		l1.print();
		l1.segregate();
		System.out.println();
		System.out.println("Segregated list");
		l1.print();
	}

}

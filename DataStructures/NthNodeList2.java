package DataStructures;

public class NthNodeList2 {
               
	class Node4
	{
		int data;
		Node4 next;
		public Node4(int d) {
			data=d;
		}
	}
	Node4 head;
	void printNthNodeLast(int n)
	{
		if(head==null){
			return;
		}
		Node4 first=head;
		for(int i=1;i<=n;i++)
		{
			if(first==null)
				return;
			first=first.next;
		}
		Node4 second=head;
		while(first!=null)
		{
			first=first.next;
			second=second.next;
		}
		System.out.println(second.data);
	}
	void addEdge(int x)
	{
		Node4 temp=new Node4(x);
		temp.next=head;
		head=temp;
	}
	public static void main(String[] args) {
		NthNodeList2 l1=new NthNodeList2();
		l1.addEdge(10);
		l1.addEdge(20);
		l1.addEdge(30);
		l1.addEdge(40);
		l1.addEdge(50);
		l1.printNthNodeLast(5);
	}

}

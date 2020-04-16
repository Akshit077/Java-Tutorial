package DataStructures;

//Java program to find the middle element in the linked list
class Node11
{
	int data;
	Node11 next;
	
	Node11(int d)
	{
		data=d;
	}
}
class LListNew
{
	static Node11 head;
	public void addEdge(int x)
	{
		Node11 temp=new Node11(x);
		temp.next=head;
		head=temp;
	}
	public void display()
	{
		Node11 p=head;
		while(p!=null)
		{
			System.out.print(p.data+" ");
			p=p.next;
		}
	}
	public void findMiddle(Node11 head)
	{
		if(head==null)
			System.out.println("list is empty");
		int count=0;
		Node11 curr;
		for(curr=head;curr!=null;curr=curr.next)
		{
			count++;
		}
		curr=head;
		for(int i=0;i<count/2;i++)
		{
			curr=curr.next;
		}
		System.out.println("Middle element is"+curr.data);
	}
}

public class MiddleOfLlist {

	public static void main(String[] args) {
	     
		LListNew a1=new LListNew();
		Node11 head=null;
		a1.addEdge(6);
		head=LListNew.head;
		a1.addEdge(5);
		head=LListNew.head;
		a1.addEdge(7);
		head=LListNew.head;
		a1.addEdge(9);
		head=LListNew.head;
		a1.addEdge(2);
		head=LListNew.head;
		a1.addEdge(1);
		head=LListNew.head;
		a1.addEdge(12);
		head=LListNew.head;
		a1.display();
		a1.findMiddle(head);
	}

}

package DataStructures;

//Java program to find the middle element of a linked list using fast and slow pointer.
class Node7
{
	int data;
	Node7 next;
	
	public Node7(int d) {
	 data=d;
	}
}
class LList2
{
	static Node7 head;
	void addEdge(int x)
	{
		Node7 temp=new Node7(x);
		temp.next=head;
		head=temp;
	}
	void middleElement(Node7 head)
	{
		if(head==null)
			return;
		Node7 slow=head;
		Node7 fast=head;
		while(fast!=null&&fast.next!=null)
		{
			slow=slow.next;// slow pointer moves 1 node at a time
			fast=fast.next.next;//fast pointer moves twice the speed of slow pointer.
		}
		System.out.println("Middle element using slow and fast refernce is"+" "+slow.data);
}
}
public class MiddleOfLlist2 {

	public static void main(String[] args) {
		
		Node7 head=null;
		LList2 a1=new LList2();
		a1.addEdge(32);
		head=LList2.head;
		a1.addEdge(25);
		head=LList2.head;
		a1.addEdge(67);
		head=LList2.head;
		a1.addEdge(12);
		head=LList2.head;
		a1.addEdge(54);
		head=LList2.head;
		a1.middleElement(head);
		
	}

}

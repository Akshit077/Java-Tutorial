package DataStructures;

class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data=d;
	}
}
class LinkList
{
	Node head;
	void insertBegin(int x)
	{
		Node temp=new Node(x);
		temp.next=head;
		head=temp;
	}
	void printlist()
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data);
			System.out.print(" ");
			curr=curr.next;
		}
	}
}
public class linkedList1 {

	public static void main(String[] args) {
		
		LinkList l1=new LinkList();
		l1.insertBegin(20);
		l1.insertBegin(5);
		l1.insertBegin(50);
		l1.printlist();
	}

}

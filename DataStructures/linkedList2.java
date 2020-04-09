package DataStructures;

class NodeNew
{
	int data;
	Node next;
	
	NodeNew(int d)
	{
		data=d;
	}
}

class Llist
{
	Node head;
	void insertEnd(int x)
	{
		Node temp=new Node(x);
		if(head==null)
		{
			head=temp;
			return;
		}
		Node curr=head;
		while(curr.next!=null)
			curr=curr.next;
		curr.next=temp;
	}
	void printList()
	{
		Node pNode=head;
		while(pNode!=null)
		{
			System.out.println(pNode.data+" ");
			pNode=pNode.next;
		}
	}
}
public class linkedList2 {
 
	public static void main(String[] args) {
		
		Llist l1=new Llist();
		l1.insertEnd(34);
		l1.insertEnd(27);
		l1.insertEnd(32);
		l1.printList();
	}

}

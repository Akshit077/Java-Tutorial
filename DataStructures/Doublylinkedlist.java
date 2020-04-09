package DataStructures;

public class Doublylinkedlist {
class DoublyNode
{
	int data;
	DoublyNode prev;
	DoublyNode next;
	
	 DoublyNode(int d)
	{
		data=d;
	}
}
   DoublyNode head;
   DoublyNode tail;
   
void append(int data)
{
	DoublyNode newNode=new DoublyNode(data);
	if(head==null)
	{
		head=newNode;
		tail=newNode;
		head.prev=null;
		tail.next=null;
	}
	else
	{	
	   tail.next=newNode;
	   newNode.prev=tail;
	   tail=newNode;
	   tail.next=null;
	}
}
void displaylist()
{
	DoublyNode current=head;
	if(current==null)
	{
		System.out.println("list is empty");
	}
	while(current!=null){
		System.out.print(current.data+" ");
		current=current.next;
	}
}
void reverseprint()
{
	DoublyNode curr=tail;
	while(curr.prev!=null)
	{
		System.out.print(curr.data+" ");
		curr=curr.prev;
	
	}
	if(curr.prev==null){
		System.out.print(curr.data);
	}
}

	public static void main(String[] args) {
		
		Doublylinkedlist a1=new Doublylinkedlist();
		a1.displaylist();
		a1.append(20);
		//a1.displaylist();
		a1.append(30);
		a1.append(40);
		a1.append(50);
		a1.append(60);
		a1.reverseprint();
		//a1.displaylist();
		
		
	}

}

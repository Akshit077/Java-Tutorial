package DataStructures;

// Java program to find the nth node of a linked list efficiently
public class NthNodeLlist
{
class Node3
{
	int data;
	Node3 next;
	Node3(int d)
	{
		data=d;
	}
}

Node3 head;

void printNthFromLast(int n)
{
	int len=0;
	Node3 curr;
	for(curr=head;curr!=null;curr=curr.next)
	{
		len++;
	}
	if(len<n)
		return;
	curr=head;
	for(int i=1;i<len-n+1;i++)
	{
		curr=curr.next;
	}
	System.out.println("Nth node from end is"+curr.data);
}
void addEdge(int x)
{
	Node3 temp=new Node3(x);
	temp.next=head;
	head=temp;
}
void printList()
{
	Node3 p=head;
	while(p!=null){
		System.out.print(p.data+" ");
		p=p.next;
	}
}
public static void main(String args[])
{
	NthNodeLlist l1=new NthNodeLlist();
	l1.addEdge(20);
	l1.addEdge(30);
	l1.addEdge(50);
	l1.addEdge(60);
	l1.addEdge(70);
	l1.printList();
	l1.printNthFromLast(4);
}
}
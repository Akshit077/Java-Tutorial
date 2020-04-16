//Java program to reverse a linked list by using arraylist as an auxillary memory space.
package DataStructures;

import java.util.ArrayList;

public class reverseLList {

	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
		}
	}
	static Node head;
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
	static void reverseList(Node head)
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		Node curr;
		for(curr=head;curr!=null;curr=curr.next)
		{
			a1.add(curr.data);
		}
		for(curr=head;curr!=null;curr=curr.next){
			curr.data=a1.remove(a1.size()-1);
			System.out.print(curr.data+" ");
		}
	}
	public static void main(String[] args) {
		reverseLList l1=new reverseLList();
		Node head=null;
		l1.addEdge(20);
		head=reverseLList.head;
		l1.addEdge(30);
		head=reverseLList.head;
		l1.addEdge(50);
		head=reverseLList.head;
		l1.print();
		reverseList(head);
	}

}

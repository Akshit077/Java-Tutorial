package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Ravi");
		a1.add("Rahul");
		a1.add("Vikas");
		a1.add("Ravi");
		
		Iterator<String>it1=a1.iterator();//Traversing Arraylist using Iterator
		System.out.println("Traversing list through Iterator");
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		ListIterator<String>it2=a1.listIterator(a1.size());//Traversing Arraylist using ListIterator
		System.out.println("Traversing list through ListIterator");
		while(it2.hasPrevious())
		{
			String str=it2.previous();
			System.out.println(str);
		}
		System.out.println("Traversing list through for-each loop");
		for(String obj:a1)//Traversing ArrayList using for-each loop
		{
			System.out.println(obj);
		}
		System.out.println("Traversing list through for loop");
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
	}

}

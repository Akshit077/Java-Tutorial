package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist3 {

	public static void main(String[] args) {
		
		ArrayList<String> a1=new ArrayList<String>();
		System.out.println("Initially"+a1);
		a1.add("akshit");
		a1.add("amrit");
		a1.add("abhay");
		System.out.println("Initial commit"+a1);
		a1.add(2,"adhvita");
			System.out.println("COMMIT2"+a1);
			ArrayList<String> a2=new ArrayList<String>();
			a2.add("aman");
			a2.add("amanpreet");
			a2.add("akshit");
			a2.add("abhay");
			a1.addAll(a2);
			System.out.println("COMIIT3"+a1);
			a1.remove("abhay");
			System.out.println("COMMIT4"+a1);
			a1.add("ananaya");
			a1.add("ashish");
			a1.add("aniket");
			System.out.println("COMMIT5"+a1);
			a1.remove(3);//remove element of ArrayList from specified position
			System.out.println("COMMIT6"+a1);
			a1.retainAll(a2);
			System.out.println(a1);
			Iterator<String> itr=a1.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			/*a1.clear();//clear all commits inside ArrayList
			System.out.println("COMMIT7"+a1);*/
	}

}

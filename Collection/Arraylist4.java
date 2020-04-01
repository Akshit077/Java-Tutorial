package Collection;

import java.util.ArrayList;

public class Arraylist4 {

	
	public static void main(String[] args) {
		
		ArrayList<String> a1=new ArrayList<String>();
		System.out.println("Is Arraylist empty"+" "+a1.isEmpty());//Checks if ArrayList is empty or not
		a1.add("pen");
		a1.add("pencil");
		a1.add("paper");
		System.out.println("Is Arraylist empty"+" "+a1.isEmpty());
		
		System.out.println(a1.get(2));
		//updating the element at particular position
		a1.set(2,"notebook");
		System.out.println(a1.get(2));
		
	}

}

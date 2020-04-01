package Collection;

import java.util.ArrayList;
import java.util.Iterator;
class Student
{
   int roll;
   int id;
   String name;
   
   Student(String name,int roll,int id)
   {
	   this.name=name;
	   this.roll=roll;
	   this.id=id;
   }
}

public class Arraylist2 {

	public static void main(String[] args) {
		
		Student obj1=new Student("akshit",04,500062444);
		Student obj2=new Student("amrit",07,500062688);
		Student obj3=new Student("gaurav",26,500062116);
		
		ArrayList<Student>list=new ArrayList<Student>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		
		Iterator<Student>itr=list.iterator();
		while(itr.hasNext())
		{
			Student st=(Student)itr.next();
			System.out.println(st.name+" "+st.roll+" "+st.id);
			//System.out.println(itr.next());
		}
	}

}

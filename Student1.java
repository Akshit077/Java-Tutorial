package Mypack;

public class Student1 {

	int roll;
	String name;
	String city;

Student1(int roll,String name,String city)
{
  this.roll=roll;
  this.name=name;
  this.city=city;
}
public String toString()
{
	return roll+" "+name+" "+city;
}

	public static void main(String[] args) {
		
		Student1 obj1=new Student1(10,"Akshit","Jaipur");
		Student1 obj2=new Student1(12,"Gaurav","Ghaziabad");
		
		System.out.println(obj1);
		System.out.println(obj2);
		
	}

}

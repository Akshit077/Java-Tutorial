class Person
{
	int id=124;
	String name="Akshit";
	Person(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}
class Emp extends Person
{
	float salary;
	Emp(int id,String name,long salary)
	{
		super(id, name);
		this.salary=salary;
	}
	void display()
	{
	System.out.println("id is"+id+"name is"+name+"salary is"+salary);
}
}
public class SuperExp2 {
	public static void main(String[] args) 
	{
		Emp e1=new Emp(23, "Akshit", 60000);
		e1.display();
		//Person p1=new Person(25,"Amrit");
	}
	}

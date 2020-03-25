
public class ThisConstructor {
	
	int rollno;
	String name;
	int id;
	float fee;
	
	ThisConstructor(int rollno,String name,int id)
	{
		this.rollno=rollno;
		this.name=name;
		this.id=id;
	}
	ThisConstructor(int rollno,String name,int id,float fee)
	{
		//this.fee=fee;
		this(rollno, name, id);
		//this.fee=fee;
	}
	void displayData()
	{
		System.out.println(rollno+" "+name+" "+id+" "+fee);
	}
	
	public static void main(String[] args)
	{
	ThisConstructor t1=new ThisConstructor(5,"Akshit",34);
	ThisConstructor t2=new ThisConstructor(23, "amrit", 23, 345f);
	t1.displayData();
	t2.displayData();
	}

}

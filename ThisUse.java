
public class ThisUse {
	int rollno;
	int Class;
	String name;
	
	ThisUse(int rollno,int Class,String name)
	{
		this.rollno=rollno;
		this.Class=Class;
		this.name=name;
	}
	void displayData()
	{
		System.out.println(rollno+" "+Class+" "+name+" ");
		this.m();
	}
	void m()
	{
		System.out.println("This is java");
	}
	
	public static void main(String[] args)
	{
		ThisUse t1=new ThisUse(10, 5, "Akshit");
		ThisUse t2=new ThisUse(2, 6, "Amrit");
		t1.displayData();
		t2.displayData();
	}

}

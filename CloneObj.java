package Mypack;

public class CloneObj implements Cloneable {

	int rollno;
	String name;
	
	public CloneObj(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	public static void main(String[] args) {
	try{
		CloneObj a1=new CloneObj(23,"Akshit");
		CloneObj a2=(CloneObj)a1.clone();
		System.out.println(a1.rollno+" "+a1.name);
		System.out.println(a2.rollno+" "+a2.name);
	}
	catch (CloneNotSupportedException e) {
		// TODO: handle exception
	}

	}

}

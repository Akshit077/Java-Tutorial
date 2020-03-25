
public class StaticMethod {
	int id;
	String name;
	static String colname="ITS";
	
	static void changeName()
	{
		colname="BBDIT";
	}
	StaticMethod(int r,String s)
	{
		id=r;
		name=s;
	}
	void displayData()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(colname);
	}
	public static void main(String[] args) {
		StaticMethod s1=new StaticMethod(111,"abc");
		StaticMethod.changeName();
		StaticMethod s2=new StaticMethod(123, "Akshit");
		StaticMethod s3=new StaticMethod(153, "Amrit");
		//StaticMethod.changeName();
		s1.displayData();
		s2.displayData();
		//StaticMethod.changeName();
		s3.displayData();
		
	}

}

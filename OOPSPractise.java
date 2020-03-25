//import java.util.Scanner;
class Test
{
	int roll;
	String name;
void insertData(int r,String n)
{
	roll=r;
	name=n;
}
void displayInformation()
{
	System.out.println(roll+" "+name);
	
}
}
 public class Infy
{
	public static void main(String[] args) 
	{
    Test i1=new Test();
    Test i2=new Test();
    //i1.id=35;
    //i1.name="Akshit";
   // System.out.println("id is"+i1.id);
    //System.out.println("name is"+i1.name);
    i1.insertData(111,"Akshit");
    i2.insertData(222,"Amrit");
    i1.displayInformation();
    i2.displayInformation();
	}
}


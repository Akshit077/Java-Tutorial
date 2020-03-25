abstract class Shape
{
	abstract void run();
	int speed=100;
	void changegear()
	{
		System.out.println("Gear is changing");
	}
}
public class Abstract1 extends Shape {
	void run()
	{
		System.out.println("car is running");
	}
	public static void main(String[] args) {
		
     Shape s1=new Abstract1();//upcasting or Dynamic method dispatch
     s1.run();
     Shape s2=new Mercedes();
     s2.run();
	}

}
class Mercedes extends Shape{
	
	void run()
	{
		System.out.println("Mercedes benz S class is running");
	}
}


class A1
{
	void run()
	{
		System.out.println("Vehicle is running");
	}
}
class A2 extends A1
{
	void run()
	{
		System.out.println("Bike is running safely");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		A2 l1=new A2();
		l1.run();
	}

}

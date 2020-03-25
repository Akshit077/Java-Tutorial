class Bike
{
	final void run()
	{
		System.out.println("sleeping");
	}
}
public class Final2 extends Bike {
	void run2()
	{
		System.out.println("walking");
	}
	
	public static void main(String[] args) 
	{
		new Final2().run();
	}

}

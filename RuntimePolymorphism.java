class Bike1
{
	void run()
	{
		System.out.println("running");
	}
}
public class RuntimePolymorphism extends Bike1 
{
	void run()
	{
		System.out.println("running safely at the speed of 60 kms");
	}
	public static void main(String[] args)
	{
		Bike1 bike1=new RuntimePolymorphism();//Refernce variable of Parent class refers to object of subclass
		bike1.run();
	}
}

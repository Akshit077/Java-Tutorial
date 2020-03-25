
 class TestInhertinance 
{
	void fun()
	{
		System.out.println("this is fun");
	}
}
	class Second extends TestInhertinance
	{
		void bark()
		{
			System.out.println("The dog is barking");
		}
	}
	public class InhertPrac
	{ 
	public static void main(String[] args) 
	{
	Second s1=new Second();
	s1.bark();
	s1.fun();
	}

}

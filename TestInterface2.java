interface Printable1
{
	void a();
	void b();
	void c();
	void d();
}
abstract class Writable1 implements Printable1
{
	public void c()
	{
		System.out.println("I am in C");
		
	}
}
public class TestInterface2 extends Writable1
{
	public void a()
	{
		System.out.println("I am in A");
	}
	public void b()
	{
		System.out.println("I am in B");
	}
	public void d()
	{
		System.out.println("I am in D");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printable1 P=new TestInterface2();
		P.a();
		P.b();
		P.c();
		P.d();
     
	}

}

class Razor
{
}
public class InstanceOf extends Razor 
{	
	static void run(Razor r)
	{
		if(r instanceof Razor)
		{
			InstanceOf a=(InstanceOf)r;
			System.out.println("downcasting is performed");
		}
	}
	public static void main(String[] args) 
	{
	Razor r=new InstanceOf();
	InstanceOf.run(r);
	}

}

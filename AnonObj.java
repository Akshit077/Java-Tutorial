
public class AnonObj {
	int fact;
	void fact(int n)
	{
		fact=1;
		for(int i=1;i<n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) 
	{
	new AnonObj().fact(5);//Anonymous object 
	}

}

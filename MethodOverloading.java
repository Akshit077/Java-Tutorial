
public class MethodOverloading 
{
	void fun(int i, int n)
	{
		int k;
		k=i*n;
		System.out.println(k);
	}
	void fun(int i, int k,int p)
	{
		int j;
		j=i+k+p;
		System.out.println(j);
	}
	void maze(int p,int s)
	{
		System.out.println(s+p);
	}
	void maze(double p,double s)
	{
		System.out.println(p*s);
	}
	
	public static void main(String[] args)
	{
    MethodOverloading m1=new MethodOverloading();
    m1.fun(2,5,6);
    m1.fun(4,3);
    m1.maze(12,4);
    m1.maze(2.3,4.6);
	}

}

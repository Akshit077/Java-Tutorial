import java.util.Scanner;


public class NumberFormat 
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k,p;
	k=n%10;
	n=n/10;
	System.out.println(n);
	}

}

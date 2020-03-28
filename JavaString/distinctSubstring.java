package JavaString;

//Program to make minimum changes required to make all substring distinct
import java.util.Scanner;
public class distinctSubstring {
	
	public static void main (String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int i,j,k;
		for(j=0;j<T;j++)
		{
		String str=sc.next();
		int n=str.length();
		int arr[]=new int[256];
		
		for(i=0;i<=n-1;i++)
		{
		    arr[(int)str.charAt(i)]++;
		}
	int sum=0;
	for(k=0;k<256;k++)
	{
	    if(arr[k]!=0&&arr[k]!=1)
	    {
	        arr[k]=arr[k]-1;
	        sum=sum+arr[k];
	    }
	}
	System.out.println(sum);
		}
	}
}
import java.util.*;
public class Max1and2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<=n-1;i++)
		{
			 arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int k=0;k<=n-1;k++)
		{
			if(max<arr[k])
			{
				max=arr[k];
			}
		}
		System.out.println(max);
		int max2=arr[0];
		for(int j=0;j<=n-1;j++)
		{
			if(max2<arr[j]&&arr[j]<max)
			{
				max2=arr[j];
			}
		}
		System.out.println(max2);
	
	}

}

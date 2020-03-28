package JavaString;

import java.util.Scanner;

// program to find the frequency of each character in a string
public class frequencyCharacter {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int k=str.length();
		int arr[]=new int[122];
		
		for(int i=0;i<=k-1;i++)
		{
			arr[(int)str.charAt(i)]++;
		}
		// printing frequency of each character
		for(int i=0;i<122;i++)
		{
			if(arr[i]!=0)
			{
			System.out.println((char)i+"->"+arr[i]);
		}
		}
	}

}

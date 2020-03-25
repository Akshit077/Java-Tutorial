package StringPract1;

import java.util.Scanner;

public class checkPalindrome {
	
	static boolean isPalindrome(String str)
	{
		int i=0;
		int k=str.length()-1;
		while(i<k)
		{
			if(str.charAt(i)!=str.charAt(k))
			{
				return false;
			}
			i++;
			k--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		//checkPalindrome obj1=new checkPalindrome();
		if(isPalindrome(str))
		{
			System.out.println("YES");
		}
		else 
			{
			System.out.println("NO");
		}
	}
}

package StringPract1;

import java.util.Scanner;

public class Exp1 {

	
	public static void main(String[] args) {
		System.out.println("Enter string to print");
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		int b=str1.length();
		for(int i=0;i<=b;i++)
		{
			System.out.println(str1.substring(0,i));
			
		}
		System.out.println("enter next string");
		String str2=sc.next();
		int c=str2.length();
		for(int i=c-1;i>=0;i--)
		{
			System.out.println(str2.substring(c,i));
		}                                                                                   
	}

}

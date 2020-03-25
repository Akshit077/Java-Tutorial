package StringPract1;

import java.util.Scanner;

public class Exp2 {

	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		String s1=scanner.next();
		int b=s1.length();
		int count=0;
		for(int i=0;i<b;i++)
		{
			char ch=s1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
			count++;
		}
		System.out.println("no.of vowels in string are"+count);
	}

}

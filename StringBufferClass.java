package Mypack;

public class StringBufferClass {
	
	public static void main(String[] args) {
		
		StringBuffer str1=new StringBuffer("Hello");
		str1.append("java");//append java after hello string
		System.out.println(str1);
		StringBuffer str2=new StringBuffer("Hello");
		str2.insert(1,"java");//insert following string at the given index
		System.out.println(str2);
		str2.replace(1,6,"python");//replace the given string from given indexes to the following string 
		System.out.println(str2);
		str2.reverse();// reverse the given string
		System.out.println(str2);
		str2.delete(4,8);
		System.out.println(str2);
		
	}

}

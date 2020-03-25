package Mypack;

public class StringClass{

	
	public static void main(String[] args) {
		 String s=" Sachin Ramesh This";
		 String s2="Tendulkar";
		 int s1=50;
         System.out.println(s.concat("tendulkar"));//concat string with the following string
         System.out.println(s.concat(s2));
         System.out.println(s.substring(0,2));//returns substring 
         System.out.println(s.toLowerCase());// Change to lowercase
         System.out.println(s.toUpperCase());//Change to uppercase
         System.out.println(s.trim());// Used to remove first blank space from the starting of string
         System.out.println(s2.startsWith("Ten"));//returns true or false if the string matches
         System.out.println(s2.endsWith("kar"));//same as above
         System.out.println(s.charAt(5));//find charcter at the specified position
         System.out.println(s2.charAt(8));//same as above
         System.out.println(s.length());//finds the length of given string
         String str=String.valueOf(s1);//converts s1 int into string
         String str1=str+10;
         System.out.println(str1);
         String str3="java is programming language java is platform independnt nad java is also OOPS enabled";
        String str4=str3.replace("java","kava");
         
	}
}

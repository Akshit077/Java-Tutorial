package JavaString;

//This method compares the given string with current string lexicographicallly
public class StringcompareTo{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String s1="hello";
           String s2="meklo";
           String s3=" ";
           String s4="nice";
           
           System.out.println(s1.compareTo(s2));//s1 is -5 times lower than s2
           System.out.println(s2.compareTo(s3));//s2 unicode value is 77 
           System.out.println(s3.compareTo(s4));
           System.out.println(s4.compareTo(s1));
	}

}

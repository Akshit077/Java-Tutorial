package JavaString;

public class Stringconcat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		String s1="hello world";
		String s2="this is java";
		String s3="example of string concat";
		
		s1.concat(s2);
		s2.concat(s3);
		s1.concat(s3);
		
		//System.out.println(s1);
		//System.out.println(s2);
		//System.out.println(s3);
		s1=s1.concat(s2);
		s2=s2.concat(s3);
		s3=s3.concat(s1);
		String s4=s1.concat(s2).concat(s3);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}

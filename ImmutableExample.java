package Mypack;

public class ImmutableExample {
	
	public static void main(String[] args) {
	
		// Proof that strings in java is immutable
		String s1="Sachin";
		s1.concat("Tendulkar");
		System.out.println(s1);
		s1=s1.concat("Tendulkar");
		System.out.println(s1);
		String a1="Sachin";
		String a2="Saurav";
		String a3="";
		String a4=new String("Saurav");
				System.out.println(a1.compareTo(a2));
				System.out.println(a1.compareTo(a3));
				System.out.println(a2==a4);
				
	}

}

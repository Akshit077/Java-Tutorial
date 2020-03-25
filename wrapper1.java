
package Mypack;

public class wrapper1 {
     
	public static void main(String[] args) {
		 int i=10;
	      float j=23.56F;
	      double k=30.556;
	      String name="Akshit";
	      char ch1='A';
	      
	      Integer i1=Integer.valueOf(i);
	      Integer i2=i1;
	      System.out.println(i+" "+i1+" "+i2);
	      Float j1=Float.valueOf(j);
	      Float j2=j1;
	      System.out.println(j+" "+j1+" "+j2);
	      String name1=String.valueOf(name);
	      String name2=name1;
	      System.out.println(name+" "+name1+" "+name2);
	      Character ch2=Character.valueOf(ch1);
	      Character ch3=ch2;
		System.out.println(ch1+" "+ch2+" "+ch3);
		Double k1=Double.valueOf(k);
		Double d1=k1;
		System.out.println(d1+" "+k1+" "+k);
	}

}

//import java.io.InputStream;

//import javax.print.DocFlavor.INPUT_STREAM;


public class StaticExp {
	
     static int count=0;
      StaticExp()
      {
    	  count++;
    	  System.out.println(count);
	}
     
	public static void main(String[] args) 
	{
		StaticExp a1=new StaticExp();
		StaticExp a2=new StaticExp();
		StaticExp a3=new StaticExp();
		StaticExp a4=new StaticExp();
	}

}

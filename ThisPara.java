
 class NewPara {
	
	 NewPara() 
	 {
		 this(5);
		 System.out.println("hello n");
	 }
	 NewPara(int n)
	 {
		System.out.println("Square of n is"+n*n);
	 }
 }
    public class ThisPara
    {
	public static void main(String[] args) 
	{
		NewPara a1=new NewPara();
	}

}

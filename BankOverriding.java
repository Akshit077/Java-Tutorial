

class Bank
{
	int roi()
	{
		return 0;
	}
}
	class SBi extends Bank
	{
		int roi()
		{
			return 3;
		}
	}
	class ICICI extends Bank
	{
		int roi()
		{
			return 6;
		}
	}
	class OBC extends Bank
	{
	int roi()
	{
		return 8;
	}
	}
public class BankOverriding {

	public static void main(String[] args) {
		SBi s1=new SBi();
		ICICI s2=new ICICI();
		OBC s3=new OBC();
		System.out.println("SBi"+s1.roi());
		System.out.println("ICICI"+s2.roi());
		System.out.println("OBC"+s3.roi());
	}

}

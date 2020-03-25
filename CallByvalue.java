package Mypack;

public class CallByvalue {
	
	int i=50;
	public void change(CallByvalue obj)
	{
		obj.i=obj.i+100;
	}
	public static void main(String[] args) {
		
		CallByvalue obj=new CallByvalue();
		System.out.println(obj.i);
		obj.change(obj);
		System.out.println(obj.i);
	}

}

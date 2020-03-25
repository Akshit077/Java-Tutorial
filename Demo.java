class Bill
{
	int item;
	public Bill(int item)
	{
		this.item=item;
	}
	void display()
	{
		int item=20;
		System.out.println(item);
	}
}
public class Demo {


	public static void main(String[] args) {
	
Bill a1=new Bill(10);
System.out.println(a1.item);
a1.display();
	}

}

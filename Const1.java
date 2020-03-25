
class Area
{
	int length;
	int breadth;
	float Area;

	void calculateArea(int l,int b)
	{
		length=l;
		breadth=b;
		Area=l*b;
	}
	void displayInformation()
	{
		System.out.println("Area is "+Area);
	}
}
public class Const1 {
	
	public static void main(String[] args) 
	{
		Area a1=new Area();
		Area a2=new Area();
		a1.calculateArea(10,20);
		a2.calculateArea(20,30);
		a1.displayInformation();
		a2.displayInformation();
	}

}

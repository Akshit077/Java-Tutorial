
interface Printable{
	void run();
}

interface Writable{
	void shape();
}

public class TestInterface1 
{
    public void run()
    {
    	System.out.println("He is running");
    }
    public void shape()
    {
    	System.out.println("shape is triangle");
    }
	public static void main(String[] args) {
		TestInterface1 objInterface1=new TestInterface1();
		objInterface1.run();
		objInterface1.shape();
	}

}

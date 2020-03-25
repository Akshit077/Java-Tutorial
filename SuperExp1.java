class Animal
{
	String color="blue";
	void eat()
	{
		System.out.println("eating");
	}
}
class Dog extends Animal
{
   String color="white";	
   void print()
   {
   System.out.println(color);
   System.out.println(super.color);
}
   void eat()
   {
	   System.out.println("eating silently");
   }
   void bark()
   {
	   System.out.println("barking");
   }
   void sum()
   {
	   super.eat();
	   bark();
   }
}
public class SuperExp1 {
	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.print();
		d1.sum();
	}

}


 class Level1
 {
	 void bark()
	 {
		 System.out.println("barking");
	 }
 }
	 class Level2 extends Level1
	 {
		 void fun()
		 {
			 System.out.println("Chilling");
		 }
	 }
		 class Level3 extends Level1
		 {
			void meow()
			{
				System.out.println("She is cat");
		    }
		 }
		 public class HierarchyInheritance
		 {
	     public static void main(String[] args)
	     {
		Level2 a1=new Level2();
		a1.bark();
		a1.fun();
		//a1.meow();COMPILE TYPE ERROR IN HIERARCHIAL INHERITANCE
        }

}

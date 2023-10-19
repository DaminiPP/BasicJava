package OOPS;


//parent class
public class Animal_SuperK {
//	public void animalSound() {
//	    System.out.println("The animal makes a sound");
//	}
	public Animal_SuperK() {
		System.out.println("Parent Class constructor");
	}

}
//subclass or child class
class Dog extends Animal_SuperK { // Subclass (child)
//	  public void animalSound() {
//	  // super.animalSound(); // Call the superclass method
//	    System.out.println("The dog says: bow wow");
//	  }
	
	  public Dog() {
		  super();
		  System.out.println("Child Class Constructor");
	  }
	  
}

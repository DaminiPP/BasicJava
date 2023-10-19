package OOPS;


//The super keyword refers to superclass (parent) objects. 
//It is used to call superclass methods, and to access the superclass constructor.
//The most common use of the super keyword is to eliminate the confusion between superclasses and subclasses that have methods with the same name.

public class SuperKeyword {
	 
	public static void main(String[] args) {
		Animal_SuperK obj1= new Animal_SuperK();
	//	obj1.animalSound();
		System.out.println("*********************************************************");
		Dog obj3= new Dog();
	//	obj3.animalSound();
		System.out.println("*********************************************************");
		Animal_SuperK obj2 = new Dog();
	//	obj2.animalSound();
	}

}

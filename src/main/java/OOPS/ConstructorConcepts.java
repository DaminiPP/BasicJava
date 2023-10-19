package OOPS;

public class ConstructorConcepts {
	
	public ConstructorConcepts() {
		System.out.println("Default Constructor");
	}
	
	public ConstructorConcepts(int i) {
		System.out.println( "One parameter Constructor" +i );
	}
	
	public ConstructorConcepts(int i, int j) {
		System.out.println( "Two parameter Constructor" +i );
		System.out.println( "Two parameter Constructor" +j );
	}

	public static void main(String[] args) {
		ConstructorConcepts obj= new ConstructorConcepts();
		ConstructorConcepts obj1= new ConstructorConcepts(10);
		ConstructorConcepts obj2= new ConstructorConcepts(10,20);
	}
}


  //A constructor in Java is a special method that is used to initialize objects. 
  //The constructor is called when an object of a class is created. 
  //It can be used to set initial values for object attributes:
//constructor name must match the class name, and it cannot have a return type (like void)
//constructor is called when the object is created.
//All classes have constructors by default: if you do not create a class constructor yourself, 
//Java creates one for you. However, then you are not able to set initial values for object attributes.
package OOPS;

public class StaticNonStaticConcepts {

	String name="Tom";
	
	//Static Variable
	static int age=25;
	
	public static void main(String[] args) {
		//call static method and variable
	     sum();
	     StaticNonStaticConcepts.sum();
	     System.out.println(age);
	     System.out.println(StaticNonStaticConcepts.age);
	     
			//call non-static method and variable
	     StaticNonStaticConcepts obj1= new StaticNonStaticConcepts();
	     System.out.println("Non Static Variable "+obj1.name);
	     obj1.sendmail();
	     
	}
	
	public StaticNonStaticConcepts() {
		System.out.println("Default Constructor");
	}
	
	public void sendmail() {
		System.out.println("Non Static Method- send mail  method");
	}

	//Static method
	public static void sum() {
		System.out.println("Static Method- sum method");
	}
	
	//Static Block
	static {
		System.out.println("Static Block in Java");
	}
}


//  1:Static keyword in Java is mainly used for memory management.
//  2:The static keyword in Java is used to share the same variable or method of a given class
//  3:Users can apply static keywords with variables, methods, blocks, and nested classes 
//  4:A class can be made static only if it is a nested class.
//    We cannot declare a top-level class with a static modifier but can declare nested classes as static. 
//    Such types of classes are called Nested static classes. 
//    Nested static class doesn’t need a reference of Outer class. 
//    In this case, a static class cannot access non-static members of the Outer class. 

package OOPS;

public class Overriding_Inheritance_Polymorphism {

	public static void main(String[] args) {
		//Has A Relationship
		
		//static polymorphism or compile time polymorphism
		BMW obj1=new BMW();
		obj1.start();
		obj1.theftSafety();
		obj1.stop();
		obj1.refuel();
		
		//overriding-when same methods name is present in child class and parent class with same name and same number of arguments

		Car obj2= new Car();
		System.out.println("************************");
		obj2.start();
		obj2.start();
		obj2.refuel();
		System.out.println("************************");
		
		
		//TopCasting
		Car c1= new BMW();
		//child class object can be referred by parent class reference variable---Dynamic Polymorphism/Runtime Polymorphism
		c1.start(); //child class method would be called
		c1.stop();
		c1.refuel();
		//c1.theftSafety();// cannot be called-compile error
		
		//downCasting
		
		//BMW bj1= new Car(); //not allowed
		
		BMW bj1= (BMW)new Car(); //classCastException
				
	}

}

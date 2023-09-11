package OOPS;

public class ConstructorWithThisKeyword {
	String name;
	int age;
	
	
	public ConstructorWithThisKeyword(String name, int age){
		this.name= name;
		this.age=age;
		
		System.out.println("name " +name);
		System.out.println("age " +age);
	}

	public static void main(String[] args) {
		ConstructorWithThisKeyword obj1= new ConstructorWithThisKeyword("Tom",10);

	}

}

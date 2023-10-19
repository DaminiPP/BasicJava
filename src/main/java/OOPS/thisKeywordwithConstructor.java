package OOPS;

//The this() constructor call can be used to invoke the current class constructor. 
//It is used to reuse the constructor. In other words, it is used for constructor chaining.
//If we want to call one constructor from another constructor we use this keyword 
//The this() constructor call should be used to reuse the constructor from the constructor

public class thisKeywordwithConstructor {
	
	thisKeywordwithConstructor(){
		System.out.println("Hello thisKeywordwithConstructor");
	}
	
	thisKeywordwithConstructor(int x){
		this();
		System.out.println(x);
		
	}

	public static void main(String[] args) {
		thisKeywordwithConstructor obj1= new thisKeywordwithConstructor(10);
		
	}

}

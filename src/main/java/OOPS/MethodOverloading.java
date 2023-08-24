package OOPS;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj1= new MethodOverloading();
		obj1.sum();
		obj1.sum(10);
		obj1.sum(20,30);
	}
	
	//cannot create method inside method
	//method overloading---->same method name with different parameters
	//method overloading---->same method name with same number of arguments not allowed
	//method overloading---->same method name with same number of arguments with different data types are allowed
	//main method can be  overloaded--
	
	public static void main(int x) {
		
	}
	
   public static void main(int a, int b) {
		
	}
   
   public static void main(char a, int b) {
		
	}
	
	public void sum() {//0 parameter
		System.out.println("Sum method- zero parameter");
		
	}
	
	public void sum(int i) {//1 parameter
		System.out.println("Sum method- one parameter" +i);
	}
	
//	public void sum(int z) {//1 parameter
//		System.out.println("Sum method- one parameter" +z);
//	}
	
	public void sum(int k, int l) {//2 parameter
		System.out.println("Sum method- two parameter" +k  +l);
	}
		
	

}

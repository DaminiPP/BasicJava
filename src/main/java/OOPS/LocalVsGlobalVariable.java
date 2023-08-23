package OOPS;

public class LocalVsGlobalVariable {

	//Global variable/Class Variable
	String name="Tom";
	int age=25;
	
	public static void main(String[] args) {
		LocalVsGlobalVariable obj1= new LocalVsGlobalVariable();
      int i=10; //local variable
      System.out.println(i);
      System.out.println(obj1.name);
      System.out.println(obj1.age);
      
	}
	
	public void Sum() {
		//local variable
		int i=10;
		int j=20;
		int age=25;
		System.out.println(j);
	}

}

package OOPS;

public class B extends A {

	public B() {
		
		//super keyword is used to call parent constructor
		//super keyword should be used only once and it should be on first line
		//super(10);
		super(20,40);
		System.out.println("B Class Default Constructor");
	
	}
	
	public B(int i) {
		super(i);
	}
	
	public B(int i, int j) {
		super(i,j);
	}
	public static void main(String[] args) {
		B obj1= new B();
		B obj2= new B(10);
		B obj3= new B(20,40);

	}

}

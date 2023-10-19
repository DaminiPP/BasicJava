package OOPS;

//this: to pass as an argument in the method
//The this keyword can also be passed as an argument in the method. It is mainly used in the event handling. Let's see the example:
public class ThisKeywordwithMethodArg {
	
	void m(ThisKeywordwithMethodArg obj) {
		System.out.println("Method Invoked");
	}
	
	void p() {
		m(this);
	}

	public static void main(String[] args) {
		ThisKeywordwithMethodArg obj1= new ThisKeywordwithMethodArg();
		obj1.p();
	}

}

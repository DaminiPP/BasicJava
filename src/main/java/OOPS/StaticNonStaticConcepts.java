package OOPS;

public class StaticNonStaticConcepts {

	String name="Tom";
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
	
	public void sendmail() {
		System.out.println("Non Static Method- send mail  method");
	}

	
	public static void sum() {
		System.out.println("Static Method- sum method");
	}
}

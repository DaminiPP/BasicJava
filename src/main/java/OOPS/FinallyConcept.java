package OOPS;

import javax.management.RuntimeErrorException;

public class FinallyConcept {

	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		try {
			System.out.println("inside test1 method");
		
			throw new RuntimeErrorException(null, "test");
		} catch (Exception e) {
			System.out.println("inside Catch block");
		}
		
		finally {
			System.out.println("Inside finally block");
		}
	}

}

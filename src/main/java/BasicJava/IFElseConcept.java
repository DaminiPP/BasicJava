package BasicJava;

public class IFElseConcept {

	public static void main(String[] args) {
    
		int a=90;
		int b=20;
		
		if(b>a) {
			System.out.println("b is greater than a");
		}
		else {
			System.out.println("a is greater than b");
		}

		//Comparision Operator
		//< > == !=  <=  >=
		
		int c=40;
		int d=00;
		
		if(c==d) {
			System.out.println("c & d are equal");
		}
		else {
			System.out.println("c & d are not equal");
		}
		
		//write a logic to find highest number
		
		int a1=100;
		int b1=200;
		int c1=300;
		
		//nested if else
		if(a1>b1 &a1>c1) {
			System.out.println("a1 is greater than b1 and c1");
		}
		
		else if(b1>c1) {
			System.out.println("b1 is the greatest");
		}
		
		else {
			System.out.println("c1 is the greatest");
		}
		
	}

}

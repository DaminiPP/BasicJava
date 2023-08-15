package BasicJava;

public class IncrementDecrementOperator {

	public static void main(String[] args) {
 
		int i=1;
		int j=i++; //post increment
		System.out.println("Value of i " +i);
		System.out.println("Value of j " +j);
		
		int a=1;
		int b=++a;// pre increment
		System.out.println("Value of a " +a);
		System.out.println("Value of b " +b);
		
		int m=2;
		int n=--m;// pre decrement
		System.out.println("Value of m " +m);
		System.out.println("Value of n " +n);
		
		int x=2;
		int y=x--;// post decrement
		System.out.println("Value of m " +x);
		System.out.println("Value of n " +y);

	}

}

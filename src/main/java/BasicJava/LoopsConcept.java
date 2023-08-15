package BasicJava;

public class LoopsConcept {

	public static void main(String[] args) {

		// 1: While loop
		// Disadvantage :If increment/decrement is not given while loop executes
		// infinite times

		int i = -12; // initialization
		while (i <= 10)// condition part
		{
			System.out.println("Value of i is while loop " + i);
			i = i + 1;// increment part
		}

		System.out.println("Value of i outside while loop " + i);
		System.out.println("*********************************************");

		// For Loop

		for (int j = 1; j <= 10; j++) {// initialization, condition part; incrementDecrementpart
			System.out.println("Value of  j in for loop " + j);

		}
		System.out.println("*********************************************");
		for (int j=10; j>=-10; j--) {// initialization, condition part; incrementDecrementpart
			System.out.println("Value of  j in for loop " + j);

		}

	}
}

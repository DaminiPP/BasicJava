package BasicJava;

public class VariablesAndDataTypes {

	// int a; // declaration
	// a=100; //assignment

	public static void main(String[] args) {
		int a = 100;
		System.out.println(a);
		System.out.println("a");
		a = 200;
		System.out.println(a);

		// Approach 1----If variables belongs to different data types
//		int x=100;
//		int y=200;
//		int z= 300;

		// Approach 2--- If variables belongs to same data types
//		int x,y,z;
//		 x=100;
//		 y=200;
//		 z=300;

		// Approach 3 ------- If variables belongs to same data types
		int x = 100, y = 200, z = 300;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println("Value of x:" +x);
		System.out.println("Value of y:" +y);
		System.out.println("Value of z:" +z);
		System.out.println(x+y+z);
		
		System.out.println(x+ " Value of x \n" +y+ " Value of y \n"+z+ " Value of z");
		
		String name="Damini";
		System.out.println("Printing name on the console " +name);
		
		char c= 'A';
		System.out.println("Printing char " +c);
		
		boolean bl= true;
		//boolean b2= "true";
		System.out.println("Printing boolean Data type on console " +bl);
		
		float item_price=20.44F;
		System.out.println("Printing floating value on the console " +item_price);
		
		long l=23232434343L;
		System.out.println("Printing long values on the console " +l);
		
				
		
		
	}

}

package OOPS;

public class FunctionInJava {

	
	//main method is starting point of execution
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionInJava obj= new FunctionInJava();
		obj.test();
		int l=obj.pqr();
		System.out.println(l);
		String s= obj.qa();
		System.out.println(s);
		System.out.println(obj.qa());
		int div=obj.division(30, 10);
		System.out.println(div);

		
		//main method is void -because i doesn't return anything
	}
	
	//non-static methods
    // void- does not return value
	
	//return type-void
	public void test(){//NO input no output
		System.out.println("Test Method in class FunctionInJava");
	}
	
	//return type-int
	public int pqr(){//NO input some output
		System.out.println("pqr Method in class FunctionInJava");
		int a=10;
		int b=20;
		int c= a +b;
		
		return c;
	}
	
	//return type-String
	public String qa() {//NO input some output
		System.out.println("qa Method in class FunctionInJava");
		String s="Selenium";
		return s;
	}
	
	
	//x and y are input parameters
	public int division(int x, int y) {
		System.out.println("division Method in class FunctionInJava");
		int d=x/y;
		return d;
		
	}
}

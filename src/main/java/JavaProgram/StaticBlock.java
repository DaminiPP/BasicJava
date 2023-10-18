package JavaProgram;

public class StaticBlock {
//	StaticBlock(){}
//	
//    public static void print() { }
	
	public static int staticVariable = 10;
	
	public static int add(int a, int b) {
        return a + b;
	}
    
    static{
    	int i=10;
    	  System.out.println(
    	            "Static block can be printed without main method");
    }
    
    public StaticBlock() {
    	System.out.println("Default Costructor");
    }
    
    public StaticBlock(int a) {
    	a=10988;
    	System.out.println(a);
    	System.out.println("Parameteriezed Costructor");
    
    }

	public static void main(String[] args) {
		StaticBlock obj1= new StaticBlock();
//		StaticBlock obj2= new StaticBlock();
//		StaticBlock obj3= new StaticBlock();
		int Results=StaticBlock.add(10, 20);
		System.out.println(Results);
		System.out.println(StaticBlock.staticVariable);
		System.out.println(staticVariable);
		System.out.println("Second Class to test Static block");
		int Results2=RunTestJava.add(30, 30);
		System.out.println(Results2);
		System.out.println(	RunTestJava.staticVariable);
	
		

	}

}

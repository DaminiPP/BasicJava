package OOPS;

public class MainTestClass extends TestAbstract {
	 final int a1=10;
	 int b=100;
     int a=b+1;

	public static void main(String[] args) {
		MainTestClass obj1= new MainTestClass();
		obj1.nonAbstract();
		obj1.Abstract();
		System.out.println(obj1.i);
		System.out.println(obj1.j);

	}

	@Override
	public void Abstract() {
		System.out.println("Child class overrided Abstract Method");
		
	}

}

class MultipleClassTest{
	
}

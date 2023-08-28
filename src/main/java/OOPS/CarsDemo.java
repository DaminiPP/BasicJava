package OOPS;

public class CarsDemo {

	//Class Variable or Global Variable
	//a,b,c are object reference variable
	//new keyword is used to create the object
	
	int mod;
	int wheel;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarsDemo a= new CarsDemo();
		CarsDemo b= new CarsDemo();
		CarsDemo c= new CarsDemo();
		
		a.mod=2015;
		a.wheel=4;
		
		b.mod=2016;
		b.wheel=4;
		
		c.mod=2017;
		c.wheel=4;
		
		System.out.println("Before Assisigning refrence");
		System.out.println(a.mod);
		System.out.println(a.wheel);
		System.out.println(b.mod);
		System.out.println(b.wheel);
		System.out.println(c.mod);
		System.out.println(c.wheel);
		System.out.println("After  Shifting refrence");

		
		

	}

}

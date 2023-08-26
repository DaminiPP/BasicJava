package OOPS;

public class CallByValue_CallByRefrence {

	int p;
	int q;
	public static void main(String[] args) {
		CallByValue_CallByRefrence obj1= new CallByValue_CallByRefrence();
		int x=10;
		int y=20;

		obj1.testSum(x,y); //call by value or pass by value
		obj1.p=40;
		obj1.q=80;
        
		obj1.swap(obj1);
		
	}
	
	public int testSum(int a, int b) {
		 a=20;
		 b=30;
		int c=a+b;
		return c;
		
	}
	
	public void swap(CallByValue_CallByRefrence t) {
		
	}

}

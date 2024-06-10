package OOPS;


public class WithoutStatic {

	int count=0;
	static{
		System.out.println("Hello I'm inside Static Block");
	}
	
	WithoutStatic(){
	count++;//incrementing value  
	System.out.println(count);  
	}
	
	public static void main(String[] args) {
		WithoutStatic c1=new WithoutStatic();  
		WithoutStatic c2=new WithoutStatic();  
		WithoutStatic c3=new WithoutStatic(); 

	}

}

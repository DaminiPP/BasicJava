package OOPS;

public class WithStatic {
	
	static int count=0;
	
	static{
		System.out.println("Hello I'm inside Static Block");
		int i =10;
		System.out.println(i);
	}
	
	static{
		System.out.println("Hello I'm inside Static Block");
		int j =1080;
		System.out.println(j);
	}
	
	
	WithStatic(){
		count++;//incrementing value  
		System.out.println(count);  
		}

	public static void main(String[] args) {
	
		WithStatic c1=new WithStatic();  
		WithStatic c2=new WithStatic();  
		WithStatic c3=new WithStatic(); 
	}

}

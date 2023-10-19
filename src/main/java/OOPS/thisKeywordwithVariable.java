package OOPS;

// this: to refer current class instance variable
public class thisKeywordwithVariable {

	int rollno;  
	String name;  
	float fee;
	
	thisKeywordwithVariable(int rollno,String name,float fee){  
	this.rollno=rollno;  
	this.name=name;  
	this.fee=fee;  
	} 
	
	void display(){
		System.out.println(rollno+" "+name+" "+fee);
		}
	public static void main(String[] args) {
		thisKeywordwithVariable s1=new thisKeywordwithVariable(111,"ankit",5000f);  
		thisKeywordwithVariable s2=new thisKeywordwithVariable(112,"sumit",6000f);  
		s1.display();  
		s2.display();

	}
	
	

}

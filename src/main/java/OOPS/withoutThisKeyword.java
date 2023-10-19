package OOPS;

public class withoutThisKeyword {
	
	int rollno;  
	String name;  
	float fee;
	
	withoutThisKeyword(int rollno,String name,float fee){  
	rollno=rollno;  
	name=name;  
	fee=fee;  
	} 
	
	void display(){
		System.out.println(rollno+" "+name+" "+fee);
		}  
  

	public static void main(String[] args) {
		withoutThisKeyword s1=new withoutThisKeyword(111,"ankit",5000f);  
		withoutThisKeyword s2=new withoutThisKeyword(112,"sumit",6000f);  
		s1.display();  
		s2.display();
		
		System.out.println("************************************************************");
		//Output for thisKeywordEx2 
		thisKeywordwithMethod obj1= new thisKeywordwithMethod();
		obj1.n();
		

	}

}

package OOPS;

public class ConstructorConcepts {
	
	public ConstructorConcepts() {
		System.out.println("Default Constructor");
	}
	
	public ConstructorConcepts(int i) {
		System.out.println( "One parameter Constructor" +i );
	}
	
	public ConstructorConcepts(int i, int j) {
		System.out.println( "Two parameter Constructor" +i );
		System.out.println( "Two parameter Constructor" +j );
	}

	public static void main(String[] args) {
		ConstructorConcepts obj= new ConstructorConcepts();
		ConstructorConcepts obj1= new ConstructorConcepts(10);
		ConstructorConcepts obj2= new ConstructorConcepts(10,20);
	}
}

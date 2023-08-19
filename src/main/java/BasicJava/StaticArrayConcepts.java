package BasicJava;

public class StaticArrayConcepts {

	public static void main(String[] args) {
		//to store similar data type in a array variable
		
		//1:int Array
		//lowest bount/index=0
		//upper bound/index= n-1 (n is size of array)
		
		int i[]=new int[4];
		
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[2]);
		//System.out.println(i[4]); //java.lang.ArrayIndexOutOfBoundsException
		
		System.out.println(i.length);  //size of array
		
		//print all values in array 
		
		for(int j=0; j<i.length;j++) {
			System.out.print(" " +i[j]);

		}
		
		String s[]= new String[3];
		s[0]="Test";
		s[1]="Hello";
		s[2]="World";
		
		System.out.println("***********************");
		for(int x=0; x<s.length;x++) {
			System.out.println(" " +s[x]);

		}
		
		
		//Disadvantage
//		1: Stores only similar datatypes
//		2: Fixed Size
//		3: To overcome this problem we use object array-Collection---Array List,Map-Dynamic Array
		
		
		//3: Object Array-----Object is a class--is used to store different data types values
		
		Object ob[]=new Object[6];
		ob[0]="Tom";
		ob[1]="23";
		ob[2]="12.33";
		ob[3]="11/12/1995";
		ob[4]="London";
		System.out.println("********************************");
		
		for(int a=0;a<ob.length;a++)
			System.out.println(ob[a]);
		
		

	}

}

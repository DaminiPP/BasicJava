package Collections;

import java.util.ArrayList;

import OOPS.ConstructorWithThisKeyword;

public class ArrayListDemo {

	
	public static void main(String[] args) {

		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(100);
		ar.add(200);
		ar.add("Testing");
		ar.add(200);
		ar.add(-9000);
		ar.add(true);
		
		System.out.println(ar);
		System.out.println(ar.get(2));
//		System.out.println(ar.get(8));//IndexOutOfBoundsException
//		System.out.println(ar.get(-1));//IndexOutOfBoundsException
		System.out.println(ar.size());
		System.out.println(+0);
		System.out.println(ar.size()-1);


	}
}

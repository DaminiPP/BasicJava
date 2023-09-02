package OOPS;

public class TestBank {

	public static void main(String[] args) {
		//USBank obj1= USBank();cannot create object of Interface
		HSBCBank obj1= new HSBCBank();
		obj1.carLoan();
		obj1.educationalLoan();
		obj1.credit();
		obj1.debit();
		obj1.transferMoney();
		
		
		//child class object can be referred by parent Interface 
		USBank obj2=new HSBCBank();
		obj2.credit();
		obj2.debit();
		obj2.transferMoney();
		
		//only overriden method would be called
		//obj2.carLoan();
		//obj2.educationalLoan();
		
		//System.out.println(min_bal);//cannot be called 
		System.out.println(USBank.min_bal);
		//USBank.min_bal=200; cannot change value
		

	}

}

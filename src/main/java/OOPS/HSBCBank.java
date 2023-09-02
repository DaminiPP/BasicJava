package OOPS;

public class HSBCBank implements USBank,BrazilBank{
	//Multiple interface can be implemented by the class
	//Achieving multiple Inheritance
	//Is-A Relationship

	@Override
	public void credit() {
		System.out.println("HSBC-Credit Method");
		
	}

	@Override
	public void debit() {
		System.out.println("HSBC-Debit Method");
		
	}

	@Override
	public void transferMoney() {
		System.out.println("HSBC-TransferMoney Method");
		
	}
	
	public void educationalLoan() {
		System.out.println("HSBC-EducationalLoan Method");
	}
	
	public void carLoan() {
		System.out.println("HSBC-CarLoan Method");
	}

	@Override
	public void mutualFund() {
		System.out.println("HSBC-MutualFund Method");
		
	}

}

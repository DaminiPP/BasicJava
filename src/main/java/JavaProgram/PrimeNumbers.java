package JavaProgram;

public class PrimeNumbers {
	
	public static boolean isprimenumber(int num) {
		if(num<=1) {
		    return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;	
			}
		}
		
		return true;
		
	}
	
	public static void getPrimeNumber(int num) {
		for(int i=1; i<=num;i++) {
			if(isprimenumber(i)) {
				System.out.print(i+ " || ");
			}
		}
		
	}

	public static void main(String[] args) {
		System.out.println("2 number is prime :" +isprimenumber(2));
		System.out.println("3 number is prime :" +isprimenumber(3));
		System.out.println("10 number is prime :" +isprimenumber(10));
		System.out.println("56 number is prime :" +isprimenumber(56));
		System.out.println("0 number is prime :" +isprimenumber(0));
		System.out.println("-13 number is prime :" +isprimenumber(-13));
		
		System.out.println("*****************");
		getPrimeNumber(89);
	}

}

package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int n=10;
 boolean isPrime=true;
 
	for (int i = 2; i <= n-1; i++) {
		 if (n%i==0) {
			isPrime=false;
			break;	
		} 
	}
 
	 if (isPrime) {
		System.out.println("Is Prime");
	} else {
	System.out.println("Is not Prime");
	}

	}

}

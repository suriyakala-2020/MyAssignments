package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int input=126, output=0;

	for (int i = input; i > 0; i/=10) {
		int rem=i%10;
		output=output*10+rem;
	}
	if (input==output) {
		System.out.println("Input : "+input+" Output : "+output+" --- is a Palindrome");
	} else  {
		System.out.println("Input : "+input+" Output : "+output+" ---- is not a Palindrome");
	}
	}

}

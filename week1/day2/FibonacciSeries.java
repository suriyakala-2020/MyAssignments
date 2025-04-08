package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=8,firstNum=0,secondNum=1;
		System.out.println(firstNum);
		System.out.println(secondNum);
		for (int i = 3; i <= input; i++) {
			int result=firstNum+secondNum;
			System.out.println(result);
			firstNum=secondNum;
			secondNum=result;
		}
	}

}



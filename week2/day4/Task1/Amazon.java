package week2.day4.Task1;

public class Amazon extends CanaraBank{

	@Override
	public void cashOnDelivery() {
		// TODO Auto-generated method stub
		System.out.println("Mode of Payment: Cash on Delivery");
	}

	@Override
	public void upiPayments() {
		// TODO Auto-generated method stub
		System.out.println("UPI payment");
	}

	@Override
	public void cardPayments() {
		// TODO Auto-generated method stub
		System.out.println("Card Payment");
	}

	@Override
	public void internetBanking() {
		// TODO Auto-generated method stub
		System.out.println("Internet Banking");
	}

	
}

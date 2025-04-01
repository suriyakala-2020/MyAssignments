package week2.day4.Task3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
APIClient client=new APIClient();
client.sendRequest("https://www.test.com/");
client.sendRequest("https://www.sample.com/", "{body:***}", true);
	}

}

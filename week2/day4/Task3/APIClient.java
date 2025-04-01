package week2.day4.Task3;

public class APIClient {
void sendRequest(String endpoint) {
	System.out.println("EndPoint: "+endpoint);
}
void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
	System.out.println("EndPoint: "+endpoint);
	System.out.println("Request Body: "+requestBody);
	if (requestStatus) {
		System.out.println("Request Status: passed");
	}else {
		System.out.println("Request Status: failed");
	}
	
}
}

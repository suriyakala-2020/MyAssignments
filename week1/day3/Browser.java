package week1.day3;

public class Browser {
	
	void launchBrowser() {
		System.out.println("Launched Browser");
	}
	
	void loadUrl() {
		System.out.println("Loaded URL");
	}


		public static void main(String[] args) {
			Browser chrome=new Browser();
			chrome.launchBrowser();
			chrome.loadUrl();
		}
}



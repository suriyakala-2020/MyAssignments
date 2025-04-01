package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPromptAlert {

	public static void main(String[] args) {
		 //Initialize ChromeDriver 		  
		ChromeDriver driver = new ChromeDriver();
		 // Maximize the browser window 
		driver.manage().window().maximize();
		//Load the URL (https://www.leafground.com/alert.xhtml) 
		driver.get("https://leafground.com/alert.xhtml");
		//Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		//Click on the "Prompt Box" button to trigger the alert. 
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		//Switch to the alert and type a message in the alert box.
		Alert promptAlert = driver.switchTo().alert();
		String input="testing";
		promptAlert.sendKeys(input);
		//Dismiss the alert.
		promptAlert.accept();
		//Retrieve the typed text from the alert and verify it
		String output = driver.findElement(By.id("confirm_result")).getText().substring(22);
		if (input.equals(output)) {
			System.out.println("Text entered in alert got displayed successfully");
		}
		driver.quit();
	}

}

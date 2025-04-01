package week3.day2;

import java.time.Duration;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Initialize ChromeDriver 
		ChromeDriver driver=new ChromeDriver();
		//Load the URL (https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm) 
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		//Maximize the browser window 
		driver.manage().window().maximize();
		//Switch to the frame 
		driver.switchTo().frame(1);
		//Add an implicit wait to ensure the webpage elements are fully loaded 
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		//Click the "Try It" button inside the frame 
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//Click OK/Cancel in the alert that appears 
		Alert confirmationAlert = driver.switchTo().alert();
		confirmationAlert.accept();
		//Confirm the action is performed correctly by verifying the text displayed 
		String out = driver.findElement(By.id("demo")).getText();
		System.out.println(out);
		
		
	}

}

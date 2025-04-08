package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFB {

	public static void main(String[] args) {
		//Instantiate Browser Driver
ChromeDriver driver=new ChromeDriver();
		//Load URL
driver.get("https://www.facebook.com/");
		//Maximize browser
driver.manage().window().maximize();
		//Enter email id
driver.findElement(By.id("email")).sendKeys("erwdfsd");
		//Enter password
driver.findElement(By.id("pass")).sendKeys("erwdfsd");
		//Click Login button
driver.findElement(By.name("login")).click();
		//Close current window
driver.quit();
	}

}

package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbRegistration {

	public static void main(String[] args) {
		//Instantiate Browser Driver
ChromeDriver driver=new ChromeDriver();
		//Load URL
driver.get("https://www.facebook.com/");
		//Maximize browser
driver.manage().window().maximize();
		//Add an implicit wait to ensure the web page elements are fully loaded 
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		// Click on the Create new account button. 
driver.findElement(By.linkText("Create new account")).click();
		//Enter the First name. 
driver.findElement(By.name("firstname")).sendKeys("first");
		//Enter the Surname. 
driver.findElement(By.name("lastname")).sendKeys("last");
		//Enter the Mobile number or email address. 
driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("edasdaeq@gmail.com");
		//Enter the New password.
driver.findElement(By.id("password_step_input")).sendKeys("eerte");
		//Handle all three dropdowns in Date of birth  
Select date=new Select(driver.findElement(By.id("day")));
date.selectByValue("2");
Select month=new Select(driver.findElement(By.id("month")));
month.selectByValue("2");
Select year=new Select(driver.findElement(By.id("year")));
year.selectByValue("2021");
		//Select the radio button in Gender. 
driver.findElement(By.xpath("//*[text()='Female']")).click();
	}

}

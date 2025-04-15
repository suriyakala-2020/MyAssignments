package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LegalEntity {
	@DataProvider
	String[][] readData() {
		String[][] name= {{"Salesforce Automation by Suriyakala"}};
		return name;
	}
	
	@Test(dataProvider="readData")
	public void main(String name) {
		//Launch the browser.
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Load the URL: https://login.salesforce.com.
        driver.get("https://login.salesforce.com/");
        System.out.println("#Loaded URL");
        //Enter the username
        driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
        System.out.println("Entered username");
        //Enter the password
        driver.findElement(By.id("password")).sendKeys("Sales@123");
        System.out.println("#Entered password");
        //Click on the Login button.
        driver.findElement(By.id("Login")).click();
        System.out.println("#Logged in successfully");     
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
        //Click on the toggle menu button in the left corner.
        WebElement waffleElement = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']/parent::button"));
        wait.until(ExpectedConditions.elementToBeClickable(waffleElement)).click();
        System.out.println("#Clicked Toggle button");
        //Click on "View All" and click Legal Entities from App Launcher 
        driver.findElement(By.xpath("//button[text()='View All']")).click();
        System.out.println("#Clicked on view all button");
        driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Legal Entities");
        driver.findElement(By.xpath("//mark[text()='Legal Entities']")).click();
        //Click on New Legal Entity 
        driver.findElement(By.xpath("//div[@title='New']")).click();
        //Enter Name as 'Salesforce Automation by *Your Name*'(Parameterized value) 
        //String[][] name= {{"Salesforce Automation by Suriyakala"}};
        driver.findElement(By.xpath("//label[text()='Legal Entity Name']/following-sibling::div/input")).sendKeys(name);
      //Click on the 'Save' button and verify the Entity Name.
       driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
       String toastMessage = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
       System.out.println(toastMessage);
       Assert.assertTrue(toastMessage.contains(name),"Verify the Account name");
	}

}

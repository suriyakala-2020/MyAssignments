package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ChromeOptions options = new ChromeOptions();
 options.addArguments("--disable-notifications");
ChromeDriver driver = new ChromeDriver(options);
driver.manage().window().maximize();
driver.get("https://login.salesforce.com");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
driver.findElement(By.id("password")).sendKeys("Sales@123");
driver.findElement(By.id("Login")).click();
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
WebElement waffleElement = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']/parent::button"));
wait.until(ExpectedConditions.elementToBeClickable(waffleElement)).click();
driver.findElement(By.xpath("//button[text()='View All']")).click();
driver.findElement(By.xpath("//p[text()='Sales']/ancestor::a")).click();
WebElement accountsElement = driver.findElement(By.xpath("//a[@title='Accounts']"));
driver.executeScript("arguments[0].click()",accountsElement);
driver.findElement(By.xpath("//a[@title='New']")).click();
String accountName = "Suriyakala";
driver.findElement(By.xpath("//label[text()='Account Name']/following::input")).sendKeys(accountName);
WebElement ownershipDD = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
driver.executeScript("arguments[0].click()",ownershipDD);
WebElement publicElement = driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Public']"));
wait.until(ExpectedConditions.elementToBeClickable(publicElement)).click();
driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
String toastMessage = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
System.out.println(toastMessage);
//Assert.assertTrue(toastMessage.contains(accountName),"Verify the Account name");
	}

}

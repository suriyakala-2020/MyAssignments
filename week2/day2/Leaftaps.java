package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Leaftaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//Load URL
driver.get("http://leaftaps.com/opentaps");
		//Maximize browser
driver.manage().window().maximize();
		//Enter email id
driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//Enter password
driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on Login button
driver.findElement(By.className("decorativeSubmit")).click();
		//Click on CRM/SFA link
driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on Leads tab
driver.findElement(By.linkText("Leads")).click();
		//Click on Create Lead under Shortcut Tab
driver.findElement(By.linkText("Create Lead")).click();
		//Enter Company name
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test");
		//Enter First name
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("suriya");
		//Enter Last name
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kala");
		//Select Industry DropDown field with Computer Hardware
WebElement industryDropdown = driver.findElement(By.id("createLeadForm_industryEnumId"));
Select options=new Select(industryDropdown);
options.selectByVisibleText("Computer Hardware");

	}

}

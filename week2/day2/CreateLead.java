package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
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
 		//Enter a Title 
driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("test");
		//Click the "Create Lead" button. 
driver.findElement(By.name("submitButton")).click();
		//Verify that the Title is displayed correctly. 
Thread.sleep(Duration.ofMillis(5));
String eTitle="View Lead";
String title = driver.getTitle();
System.out.println(title);
if (title.contains(eTitle)) {
System.out.println("Title is displayed correctly");	
}
		//Close the browser window. 
driver.quit();
	}

}

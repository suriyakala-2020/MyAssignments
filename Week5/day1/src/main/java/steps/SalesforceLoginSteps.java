package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;

public class SalesforceLoginSteps extends BaseClass{
	
	@Given("Launch the browser for testing salesforce application")
	public void launch_the_browser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		wait=new WebDriverWait(driver,Duration.ofSeconds(60));
	}
	
	@Given("Click on the salesforce Login button")
	public void click_on_the_salesforce_login_button() {
		driver.findElement(By.id("Login")).click();
	}
	
	

	
}

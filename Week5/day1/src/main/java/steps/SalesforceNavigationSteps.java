package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.Given;

public class SalesforceNavigationSteps extends BaseClass{
	
	@Given("Click on toggle menu button from the left corner")
	public void Click_on_toggle_menu_button_from_the_left_corner() {
		WebElement waffleElement = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']/parent::button"));
		wait.until(ExpectedConditions.elementToBeClickable(waffleElement)).click();
	}
	
	@Given("Click view All and click Sales from App Launcher")
	public void Click_view_All_and_click_Sales_from_App_Launcher() {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']/ancestor::a")).click();
	}
}

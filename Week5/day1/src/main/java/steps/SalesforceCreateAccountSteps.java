package steps;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesforceCreateAccountSteps extends BaseClass{

@Given("Click on Accounts tab")
public void click_on_accounts_tab() {
	WebElement accountsElement = driver.findElement(By.xpath("//a[@title='Accounts']"));
	driver.executeScript("arguments[0].click()",accountsElement);
}

@Given("Click on New button")
public void click_on_new_button() {
	driver.findElement(By.xpath("//a[@title='New']")).click();
}

@Given("Enter account name as {string}")
public void enter_account_name_as(String accountName) {
	driver.findElement(By.xpath("//label[text()='Account Name']/following::input")).sendKeys(accountName);
}

@Given("Select Ownership as Public")
public void select_ownership_as_Public() {
	WebElement ownershipDD = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
	driver.executeScript("arguments[0].click()",ownershipDD);
	WebElement publicElement = driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Public']"));
	wait.until(ExpectedConditions.elementToBeClickable(publicElement)).click();
}

@When("Click save button")
public void click_save_button() {
	driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
}

@Then("verify Account name appears as {string}")
public void verify_account_name_appears(String accountName) {
	String toastMessage = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
	Asserts.check(toastMessage.contains(accountName),toastMessage);
}

}

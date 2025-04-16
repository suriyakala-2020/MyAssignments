package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;

public class CreateLeadSteps extends BaseClass{

@When("Click on the CRMSFA link")
public void click_on_the_crmsfa_link() {
	driver.findElement(By.linkText("CRM/SFA")).click();
}

@When("Click on the Leads link")
public void click_on_the_leads_link() {
	driver.findElement(By.linkText("Leads")).click();}

@When("Click on the CreateLeads Link")
public void click_on_the_create_leads_link() {
	driver.findElement(By.linkText("Create Lead")).click();
}

@When("Enter the companyname as {string}")
public void enter_the_companyname(String companyname) {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
}

@When("Enter the firstname as {string}")
public void enter_the_firstname(String firstname) {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
}

@When("Enter the lastname as {string}")
public void enter_the_lastname(String lastname) {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
}

@When("Click on the CreateLead button")
public void click_on_the_create_lead_button() {
	driver.findElement(By.name("submitButton")).click();
}

}

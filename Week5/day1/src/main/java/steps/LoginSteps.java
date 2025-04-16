package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseClass{
	
	@Given("Launch the browser")
	public void launch_the_browser() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	}

	@Given("Load the url as {string}")
	public void load_the_url(String url) {
		driver.get(url);
	}

	@Given("Enter the username as {string}")
	public void enter_the_username(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
	
	@Given("Enter the password as {string}")
	public void enter_the_password(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("Click on the Login button")
	public void click_on_the_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("It should be navigated to the next page")
	public void it_should_be_navigated_to_the_next_page() {
		System.out.println("Navigated to next page successfully");
	}
	
	@Then("It should be in login page")
	public void it_should_be_in_login_page() {
	    System.out.println("Login page exist");
	}
}

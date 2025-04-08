package week2.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {		
		// Launch the Browser 
		ChromeDriver driver=new ChromeDriver();
				//Maximize window
		driver.manage().window().maximize();
				//Load the Url "https://www.amazon.in/" 
		driver.get("https://www.amazon.in/");
				//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
				//Type "Bags for boys" in the Search box
		driver.findElement(By.name("field-keywords")).sendKeys("Bags for boys");
				//Choose the item in the result
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@aria-owns='sac-suggestion-row-1-cell-1']")).click();
		//Print the total number of results
		String result = driver.findElement(By.xpath("//*[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']/span")).getText();
		String[] split = result.split(" ");
		System.out.println("Total number of results: "+split[3]);
		//Select the first 2 brands in the left menu
		driver.findElement(By.xpath("(//*[@id='brandsRefinements']//i)[1]")).click();
		driver.findElement(By.xpath("(//*[@id='brandsRefinements']//i)[2]")).click();
		//Choose New Arrivals(Sort)
		Thread.sleep(Duration.ofMillis(30));
		WebElement sort = driver.findElement(By.xpath("//label[text()='Sort by:']/following::select"));
		Select options = new Select(sort);
		options.selectByVisibleText("Newest Arrivals");
		//Print the first resulting bag info (name, discounted price)
		Thread.sleep(1000);
		String name = driver.findElement(By.xpath("(//div[@data-cy='title-recipe']//a//span)[1]")).getText();
		System.out.println("Bag Name: "+name);
		String price = driver.findElement(By.xpath("(//a[@aria-describedby='price-link']//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("Discounted Price: "+price);
		//Get the page title and close the browser
		String title = driver.getTitle();
		System.out.println("Page Title: "+title);
		driver.close();
		
	}

}

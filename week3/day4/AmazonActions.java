package week3.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class AmazonActions {

	public static void main(String[] args) throws InterruptedException, IOException {
		// Launch the Browser 
ChromeDriver driver=new ChromeDriver();
		//Maximize window
driver.manage().window().maximize();
		//Load the URL (https://www.amazon.in/)   
driver.get("https://www.amazon.in/");
		//Implicit wait
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
		//2. Search for "oneplus 9 pro". 
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("twotabsearchtextbox")));
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro"+ Keys.ENTER);
		//3. Get the price of the first product. 
String price = driver.findElement(By.className("a-price-whole")).getText();
System.out.println("Price of first product: "+price);
		//4. Print the number of customer ratings for the first displayed product.
JavascriptExecutor js=(JavascriptExecutor) driver;
WebElement ratingElement = driver.findElement(By.className("a-icon-alt"));
String rating=(String) js.executeScript("return arguments[0].textContent;",ratingElement );
System.out.println("Rating: "+rating);
		//5. Click the first text link of the first image.
driver.findElement(By.xpath("//div[@data-cy='title-recipe']//following-sibling::a")).click();
Set<String> winSet = driver.getWindowHandles();
List<String> winList = new ArrayList<String>(winSet);
driver.switchTo().window(winList.get(1));
		//6. Take a screenshot of the product displayed.
Thread.sleep(1000);
File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File desc=new File("src/test/resources/product.png");
Files.copy(src, desc);
		//7. Click the 'Add to Cart' button.
String productPrice = driver.findElement(By.xpath("//div[@id='corePriceDisplay_desktop_feature_div']//*[@class='a-price-whole']")).getText().replace(",", "");
int product_Price = Integer.parseInt(productPrice);
System.out.println("Product Price: "+product_Price);
js.executeScript("window.scrollBy(0, 50)");
driver.findElement(By.xpath("(//*[@id='add-to-cart-button'])[2]")).click();
		//8. Get the cart subtotal and verify if it is correct. 
Thread.sleep(2000);
WebElement cartElement = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-price a-text-bold']//span"));
wait.until(ExpectedConditions.visibilityOf(cartElement));
String cartSubtotal = cartElement.getText().replace("₹", "").replace(",", "").replace(".00", "");
int cart_Price = Integer.parseInt(cartSubtotal);
System.out.println("Cart Subtotal: "+cart_Price);
if (product_Price==cart_Price) {
	System.out.println("Product added correctly");
}
		//9. Close the browser. 
driver.quit();
	}

}

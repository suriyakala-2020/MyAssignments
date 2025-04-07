package week3.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class SnapdealActions {

	public static void main(String[] args) throws InterruptedException, IOException {
		// Launch the Browser 
ChromeDriver driver=new ChromeDriver();
		//Maximize window
driver.manage().window().maximize();
		//Load the URL (https://www.snapdeal.com/)    
driver.get("https://www.snapdeal.com/");
		//Implicit wait
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
		//2. Go to "Men's Fashion". 
driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]")).click();
		//3. Go to "Sports Shoes". 
driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		//4. Get the count of sports shoes. 
String count = driver.findElement(By.xpath("//div[text()='Sports Shoes for Men']/following-sibling::div")).getText();
System.out.println("Sports Shoes Count: "+count);
		//5. Click on "Training Shoes". 
driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		//6. Sort the products by "Low to High". 
driver.findElement(By.className("sort-label")).click();
driver.findElement(By.xpath("//li[@data-index='1']/text()[contains(. ,'Price Low To High')]/parent::li")).click();
//7. Check if the displayed items are sorted correctly.
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
Thread.sleep(1000);
List<WebElement> priceElement = driver.findElements(By.xpath("//span[@class='lfloat product-price' and contains(text(), 'Rs.')]"));
List<Integer> originalList=new ArrayList<Integer>();
List<Integer> duplicateList=new ArrayList<Integer>();
for (int i = 0; i < priceElement.size(); i++) {
	String substring = priceElement.get(i).getText().substring(4).replace(",", "");
	Integer num = Integer.parseInt(substring);
	originalList.add(num);
}
duplicateList.addAll(originalList);
Collections.sort(duplicateList);
if (originalList.equals(duplicateList)) {
	System.out.println("Displayed Items are sorted correctly");
}else {
	System.out.println("Displayed Items are not sorted");
}
//8. Select any price range ex:(500-700). 
String priceFrom="500";
String priceTo="700";
driver.findElement(By.name("fromVal")).clear();
driver.findElement(By.name("fromVal")).sendKeys(priceFrom);
driver.findElement(By.name("toVal")).clear();
driver.findElement(By.name("toVal")).sendKeys(priceTo);
driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
//9. Filter by any colour. 
Thread.sleep(1000);
WebElement colourSelect = driver.findElement(By.xpath("(//div[@data-filtername='Color_s']//a)[1]"));
String colour = colourSelect.getText();
js.executeScript("arguments[0].click();", colourSelect);
//10. Verify all the applied filters. 
js.executeScript("window.scrollBy(0, 10)");
Thread.sleep(1000);
String priceFilter = driver.findElement(By.xpath("//a[@data-key='Price|Price']")).getText();
String colourFilter = driver.findElement(By.xpath("//a[@data-key='Color_s|Color']")).getText();
if (priceFilter.contains(priceFrom)) {
	System.out.println("Starting price range is applied in filter");
}
if (priceFilter.contains(priceTo)) {
	System.out.println("Ending price range is applied in filter");
}
if (colourFilter.contains(colour)) {
	System.out.println("colour filter got applied");
}
//11. Mouse hover on the first resulting "Training Shoes".
Actions action=new Actions(driver);
WebElement ProductElement = driver.findElement(By.xpath("//source/following-sibling::img"));
action.moveToElement(ProductElement).perform();
//12. Click the "Quick View" button. 
driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
//13. Print the cost and the discount percentage. 
Thread.sleep(1000);
String cost = driver.findElement(By.xpath("//div[@class='lfloat']//*[@class='payBlkBig']")).getText();
String discount = driver.findElement(By.xpath("//div[@class='lfloat']//*[@class='percent-desc ']")).getText();
System.out.println("Cost of the product: "+cost);
System.out.println("Discount of the product: "+discount);
//14. Take a snapshot of the shoes. 
File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File desc=new File("src/test/resources/shoes.png");
Files.copy(src, desc);
//15. Close the current window. 
driver.findElement(By.xpath("//div[@class='sidebarin comp-qv']//div[2]")).click();
//16. Close the main window. 
driver.close();
	}

}

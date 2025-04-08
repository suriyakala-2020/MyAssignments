package week2.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PVRCinemas {
	public static void main(String[] args) throws InterruptedException {
		// Launch the Browser 
		ChromeDriver driver=new ChromeDriver();
				//Maximize window
		driver.manage().window().maximize();
				//Load the Url "https://www.pvrcinemas.com/" 
		driver.get("https://www.pvrcinemas.com/");
				//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
				//Choose Your location as "Chennai"
		driver.findElement(By.xpath("(//span[@class='cities-placed'])[2]")).click();
		driver.findElement(By.xpath("//*[@placeholder='Search for city']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//*[text()='Chennai' and @class='sc-gsTDqH ghtqhz pointer']")).click();
				//Click on Cinema under Quick Book 
		driver.findElement(By.className("cinemas-inactive")).click();
				//Select Your Cinema 
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='Select Cinema'])[2]")).click();
		driver.findElement(By.xpath("//ul[@class='p-dropdown-items']//li[1]")).click();
				//Select Your Date as Tomorrow
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
				//Select Your Movie 
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[1]")).click();
				//Select Your Show Time
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[1]")).click();
				//Click on Book Button 
		driver.findElement(By.xpath("//*[@class='d-flex quick-booking-from']//span[text()='Book']")).click();
				//Click Accept on Term and Condition 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
				//Click any one available seat
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[@class='seat-current-pvr'])[1]")).click();
				//Click Proceed Button
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
				//Print the Seat info under book summary 
		Thread.sleep(3000);
		String ticketValue = driver.findElement(By.xpath("//*[@class='ticket-value']")).getText();
		System.out.println("Ticket Value: "+ticketValue);
		String seatNumber = driver.findElement(By.xpath("//*[@class='seat-number']")).getText();
		System.out.println("Seat Number: "+seatNumber);
				//Print the grand total under book summary 
		String grandTotal = driver.findElement(By.xpath("//*[@class='grand-tota col-md-3']//span")).getText();
		System.out.println("Grand Total: "+grandTotal);
				//Click Proceed Button 
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
				//Close the pop up 
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='cross-icon mx-2'])[2]")).click();
				//Print Your Current Page title
		String title = driver.getTitle();
		System.out.println("Current Page title: "+title);
				//Close Browser 
		driver.quit();
	}

}

package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnConfirmationAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://leafground.com/alert.xhtml");
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
Alert confirmationAlert = driver.switchTo().alert();
String text = confirmationAlert.getText();
System.out.println("Alert Message: "+text);
confirmationAlert.accept();
	}

}

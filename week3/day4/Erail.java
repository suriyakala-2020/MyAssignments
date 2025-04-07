package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Erail {

	public static void main(String[] args) throws InterruptedException {
		// Launch the Browser 
ChromeDriver driver=new ChromeDriver();
		//Maximize window
driver.manage().window().maximize();
		//Load the URL (https://erail.in/)   
driver.get("https://erail.in/");
		//Implicit wait
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
		//Enter "MAS" as the "From" station. 
driver.findElement(By.id("txtStationFrom")).clear();
driver.findElement(By.id("txtStationFrom")).sendKeys("MAS");
driver.findElement(By.xpath("//Strong[text()='MAS']")).click();
//Enter "MDU" as the "To" station. 
driver.findElement(By.id("txtStationTo")).clear();
driver.findElement(By.id("txtStationTo")).sendKeys("MDU");
driver.findElement(By.xpath("//Strong[text()='MDU']")).click();
//Uncheck the "Sort on Date" checkbox. 
driver.findElement(By.id("chkSelectDateOnly")).click();
//Retrieve the train names from the web table.
Thread.sleep(1000);
List<WebElement> trainListElement = driver.findElements(By.xpath("//div[@id='divMainWrapper']//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td[2]/a"));
List<String> trainList=new ArrayList<String>();
System.out.println("Total train list: "+trainListElement.size());
for (int i = 0; i < trainListElement.size(); i++) {
	trainList.add(trainListElement.get(i).getText());
}
//Verify if there are any duplicate train names in the web table. 
Set<String> trains = new HashSet<String>();
Set<String> duplicateTrains =new HashSet<String>();
for (String name : trainList) {
	if (!trains.add(name)) {
		duplicateTrains.add(name);
	}
}
System.out.println("Count of duplicate trains: "+duplicateTrains.size());
	}

}

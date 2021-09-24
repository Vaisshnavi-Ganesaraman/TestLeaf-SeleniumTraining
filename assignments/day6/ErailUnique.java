package assignments.day6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailUnique {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driverFile/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.id("chkSelectDateOnly")).click();
		Thread.sleep(200);

		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("Chennai Egmore");
		driver.findElement(By.id("txtStationFrom")).sendKeys(Keys.ENTER);
		Thread.sleep(100);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("Coimbatore Jn");
		driver.findElement(By.id("txtStationTo")).sendKeys(Keys.ENTER);

		List<WebElement> trainsList = driver
				.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tbody//tr//td[2]"));
		System.out.println("No of trains for Selected stations : " + trainsList.size());

		List<String> sortedTrainList = new ArrayList<String>();
		for (WebElement webElement : trainsList) {
			sortedTrainList.add(webElement.getText());
		}

		Set<String> uniqueSetTrains = new HashSet<String>();
		uniqueSetTrains.addAll(sortedTrainList);

		System.out.println("Unique Trains for Selected stations : " + uniqueSetTrains.size());
		for (String trainName : uniqueSetTrains) {
			System.out.println(trainName);
		}

	}

}

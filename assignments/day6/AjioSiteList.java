package assignments.day6;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioSiteList {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driverFile/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("Bags");
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys(Keys.ENTER);

		Thread.sleep(200);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();

		System.out.println(driver.findElement(By.xpath("//div[@class='length']")).getText());

		Thread.sleep(200);
		List<WebElement> brandsList = driver.findElements(By.className("brand"));
		Set<String> uniqueBrandSet = new HashSet<String>();
		System.out.print("Unique Brands displayed : ");
		for (WebElement webElement : brandsList) {
			uniqueBrandSet.add(webElement.getText());
		}
		System.out.println(uniqueBrandSet.size());
		for (String brandName : uniqueBrandSet) {
			System.out.println(brandName);
		}

		List<WebElement> nameList = driver.findElements(By.className("name"));
		System.out.println("\nNo of Bags displayed : " + nameList.size());
		for (WebElement webElement : nameList) {
			System.out.println(webElement.getText());
		}
	}

}

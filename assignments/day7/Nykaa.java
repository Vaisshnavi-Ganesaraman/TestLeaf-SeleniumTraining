package assignments.day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.nykaa.com/");

		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//div[@id='headerMenu']//li/a[text()='brands']"))).perform();
		builder.moveToElement(driver.findElement(By.linkText("L'Oreal Paris"))).click().perform();

		if (driver.getTitle().contains("L'Oreal Paris")) {
			System.out.println(driver.getTitle() + " -Page landed successfully!!!");
		}

		driver.findElement(By.className("sort-wrapper")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Category']/following-sibling::div")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();

		driver.findElement(By.xpath("//div[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h2[@title=\"L'Oreal Paris Colour Protect Shampoo\"]")).click();

		Set<String> windows = driver.getWindowHandles();
		List<String> windowsList = new ArrayList<String>(windows);

		driver.switchTo().window(windowsList.get(1));
		System.out.println("Size of the selected bottle : " + driver
				.findElement(By.xpath("//label[contains(@class,'selected')]//span[@class='size-pallets']")).getText());

		System.out.println("Price of the selected bottle : " + driver
				.findElement(By.xpath("//span[@class='post-card__content-price-offer']")).getText().replace("?", ""));

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='ADD TO BAG']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='AddBagIcon']")).click();

		String totalCheck = driver
				.findElement(By.xpath("//span[text()='Grand Total']/following-sibling::div[@class='value']")).getText()
				.replace("?", "");
		System.out.println("Grand Total : " + totalCheck);

		Thread.sleep(8000);

		driver.findElement(By.xpath("//div[@class='second-col']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Checkout as guest']")).click();

		if (totalCheck.equals(driver.findElement(By.xpath("//div[text()='Grand Total']")).getText().replace("?", ""))) {
			System.out.println("Total Amount verified!!!");
		}

		driver.quit();

	}
}

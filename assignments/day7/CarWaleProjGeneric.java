package assignments.day7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CarWaleProjGeneric {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driverFile/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.carwale.com/");

		driver.findElement(By.xpath("//span[text()='Used']")).click();
		driver.findElement(By.xpath("//input[@placeholder='City, eg: Mumbai']")).sendKeys("Chennai");

		driver.findElement(By.xpath("//div[text()='Choose your Budget']")).click();

		WebElement sliderStart = driver.findElement(By.xpath("//button[@data-handle-key='0']"));
		WebElement sliderEnd = driver.findElement(By.xpath("//button[@data-handle-key='1']"));

		Actions builder = new Actions(driver);

		while (!sliderStart.getAttribute("aria-valuenow").equals("9")) {
			builder.dragAndDropBy(sliderStart, 10, 0).perform();
		}

		while (!sliderEnd.getAttribute("aria-valuenow").equals("12")) {
			builder.dragAndDropBy(sliderEnd, -10, 0).perform();
		}

		System.out.println("The Min Value chosen : " + sliderStart.getAttribute("aria-valuenow"));
		System.out.println("The Max Value chosen : " + sliderEnd.getAttribute("aria-valuenow"));
	}

}

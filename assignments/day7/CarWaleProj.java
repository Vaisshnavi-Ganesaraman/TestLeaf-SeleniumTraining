package assignments.day7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CarWaleProj {

	public static void main(String[] args) throws InterruptedException {

		// System.setProperty("webdriver.chrome.driver",
		// "./driverFile/chromedriver.exe");
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.carwale.com/");

		driver.findElement(By.xpath("//span[text()='Used']")).click();
		driver.findElement(By.xpath("//input[@placeholder='City, eg: Mumbai']")).sendKeys("Chennai");

		driver.findElement(By.xpath("//div[text()='Choose your Budget']")).click();

		WebElement sliderHandleForWidth = driver.findElement(By.className("VuJ2xF"));
		int width = sliderHandleForWidth.getSize().getWidth();

		WebElement sliderStart = driver.findElement(By.xpath("//button[@data-handle-key='0']"));
		WebElement sliderEnd = driver.findElement(By.xpath("//button[@data-handle-key='1']"));

		Actions builder = new Actions(driver);
		// value to set =4; Range=(20- 0)
		builder.dragAndDropBy(sliderStart, (int) (width / 20) * 4, 0).build().perform();

		// Start handle move to 12
		builder.dragAndDropBy(sliderEnd, (int) (width / 20) * (12 - 20), 0).build().perform();

		System.out.println("The Min Value chosen : " + sliderStart.getAttribute("aria-valuenow"));
		System.out.println("The Max Value chosen : " + sliderEnd.getAttribute("aria-valuenow"));
	}

}

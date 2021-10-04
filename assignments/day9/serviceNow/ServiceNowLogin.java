package assignments.day9.serviceNow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNowLogin {

	ChromeDriver driver;

	@BeforeMethod
	public void login() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://dev105146.service-now.com");
		driver.manage().window().maximize();

		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("Jayavaissh5.");
		driver.findElement(By.id("sysverb_login")).click();

		driver.findElement(By.id("filter")).sendKeys("incident");
		driver.findElement(By.id("filter")).sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("(//div[text()='All'])[2]")).click();
		driver.switchTo().frame(driver.findElement(By.id("gsft_main")));
	}

	@AfterMethod
	public void close() {
		driver.close();
	}

}

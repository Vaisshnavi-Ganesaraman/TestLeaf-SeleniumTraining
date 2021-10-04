package assignments.day8;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNowApplication {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
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
		driver.findElement(By.id("sysverb_new")).click();

		driver.findElement(By.id("lookup.incident.caller_id")).click();
		Thread.sleep(3000);
		List<String> windows = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		driver.findElement(By.xpath("(//a[@class='glide_ref_item_link'])[1]")).click();
		driver.switchTo().window(windows.get(0));
		driver.switchTo().frame(driver.findElement(By.id("gsft_main")));
		driver.findElement(By.id("incident.short_description")).sendKeys("Incident creation.");

		String incidentNumber = driver.findElement(By.id("incident.number")).getAttribute("value");
		System.out.println(incidentNumber);
		driver.findElement(By.id("sysverb_insert")).click();

		driver.findElement(By.xpath("(//div[@class='input-group-transparent']//input)[1]")).sendKeys(incidentNumber);
		driver.findElement(By.xpath("(//div[@class='input-group-transparent']//input)[1]")).sendKeys(Keys.ENTER);

		if (driver.findElement(By.xpath("//span[@class=' list_row_number_input ']/span/following-sibling::span"))
				.getText().equals("1")) {
			System.out.println("Incident created successfully!!!");

		}

		driver.close();

	}

}

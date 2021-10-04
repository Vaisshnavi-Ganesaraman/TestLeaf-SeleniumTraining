package assignments.day9.serviceNow;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ServiceNowCreateIncident extends ServiceNowLogin {

	@Test
	public void createIncident() throws InterruptedException {

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
	}

}

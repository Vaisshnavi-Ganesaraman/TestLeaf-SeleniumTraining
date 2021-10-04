package assignments.day9.serviceNow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ServiceNowDeleteIncident extends ServiceNowLogin {

	@Test
	public void deleteIncident() throws InterruptedException {

		driver.findElement(By.xpath("(//table[@id='incident_table']//tbody//tr)[1]//td[3]/a")).click();
		String incidentNumber = driver.findElement(By.id("incident.number")).getAttribute("value");
		System.out.println(incidentNumber);
		driver.findElement(By.xpath("//button[text()='Delete']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()='Delete'])[3]")).click();

		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='input-group-transparent']//input)[1]")).sendKeys(incidentNumber);
		driver.findElement(By.xpath("(//div[@class='input-group-transparent']//input)[1]")).sendKeys(Keys.ENTER);

		if (driver.findElement(By.xpath("//td[text()='No records to display']")).isDisplayed()) {
			System.out.println("Incident deleted successfully!!!");
		}

	}

}

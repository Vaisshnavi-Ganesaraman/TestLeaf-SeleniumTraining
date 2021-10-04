package assignments.day9.serviceNow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ServiceNowAssignIncident extends ServiceNowLogin {

	@Test
	public void assignIncident() throws InterruptedException {

		driver.findElement(By.xpath("(//table[@id='incident_table']//tbody//tr)[1]//td[3]/a")).click();

		WebElement assignmentGrp = driver.findElement(By.xpath("//input[@id='sys_display.incident.assignment_group']"));
		assignmentGrp.clear();
		assignmentGrp.sendKeys("Software");
		assignmentGrp.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		driver.findElement(By.id("activity-stream-textarea")).sendKeys("Work Notes updated");

		driver.findElement(By.xpath("//button[text()='Update']")).click();

		if (driver.findElement(By.xpath("(//table[@id='incident_table']//tbody//tr[1])//td[10]")).getText()
				.equals("Software")) {
			System.out.println("Incident assigned successfully!!!");
		}

	}

}

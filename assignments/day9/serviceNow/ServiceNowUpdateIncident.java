package assignments.day9.serviceNow;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ServiceNowUpdateIncident extends ServiceNowLogin {

	@Test
	public void updateIncident() {

		driver.findElement(By.xpath("(//table[@id='incident_table']//tbody//tr)[1]//td[3]/a")).click();
		Select state = new Select(driver.findElement(By.id("incident.state")));
		state.selectByVisibleText("In Progress");

		driver.findElement(By.xpath("//button[text()='Update']")).click();

		if (driver.findElement(By.xpath("(//table[@id='incident_table']//tbody//tr[1])//td[8]")).getText()
				.equals("In Progress")) {
			System.out.println("Incident updated successfully!!!");
		}

	}

}

package assignments.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driverFile/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/login");

		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");

		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("crmsfa");

		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();

		// Logged in User clicks CRM/SFA
		WebElement homePage = driver.findElement(By.linkText("CRM/SFA"));
		homePage.click();

		// Leads Tab - > CreateLead
		WebElement leadsTab = driver.findElement(By.linkText("Leads"));
		leadsTab.click();

		WebElement createLeadButton = driver.findElement(By.linkText("Find Leads"));
		createLeadButton.click();

		driver.findElement(By.xpath("//span[text()='Email']")).click();

		driver.findElement(By.name("emailAddress")).sendKeys("testleaf@gmail.com");

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		Thread.sleep(100);
		String leadName = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName'][1]"))
				.getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a")).click();

		driver.findElement(By.linkText("Duplicate Lead")).click();

		String title = driver.getTitle();
		title.contains("Duplicate Lead");

		WebElement createLeadSubmit = driver.findElement(By.className("smallSubmit"));
		createLeadSubmit.click();

		if (leadName.equals(driver.findElement(By.id("viewLead_firstName_sp")).getText())) {

			System.out.println("Duplicate Lead created successfully for " + leadName);
			driver.close();
		}

	}

}

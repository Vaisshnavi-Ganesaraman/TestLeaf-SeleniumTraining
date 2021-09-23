package assignments.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContact {

	public static void main(String[] args) {

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

		// Contact Tab - > CreateContact

		WebElement createContactButton = driver.findElement(By.linkText("Create Contact"));
		createContactButton.click();

		WebElement firstNameField = driver.findElement(By.id("firstNameField"));
		firstNameField.sendKeys("TestName1");

		WebElement lastNameField = driver.findElement(By.id("lastNameField"));
		lastNameField.sendKeys("TestName2");

		WebElement firstNameLocalField = driver.findElement(By.id("createContactForm_firstNameLocal"));
		firstNameLocalField.sendKeys("Test FirstName Local");

		WebElement lastNameLocalField = driver.findElement(By.id("createContactForm_lastNameLocal"));

		WebElement testDescField = driver.findElement(By.id("createContactForm_description"));
		testDescField.sendKeys("Test description");

		lastNameLocalField.sendKeys("Test LastName Local");

		WebElement createLeadSubmit = driver.findElement(By.className("smallSubmit"));
		createLeadSubmit.click();

		// Contact Tab - > EditContact
		WebElement editContactButton = driver.findElement(By.linkText("Edit"));
		editContactButton.click();

		WebElement updateDescField = driver.findElement(By.id("updateContactForm_description"));
		updateDescField.clear();

		WebElement impNoteDescField = driver.findElement(By.id("updateContactForm_importantNote"));
		impNoteDescField.sendKeys("Important note edited");

		driver.findElement(By.xpath("//input[@value='Update']")).click();

		String title = driver.getTitle();
		System.out.println("In Page : " + title);

		System.out.println("Contact created successfully!!!");
		driver.close();

	}

}

package assignments.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadTestCase {

	public static void main(String[] args) {

		// setup / manage / download driver version automatically
		// WebDriverManager.chromedriver().setup();

		System.setProperty("webdriver.chrome.driver", "./driverFile/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/main");

		String title = driver.getTitle();
		System.out.println("In Page : " + title);

		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");

		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("crmsfa");

		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();

		title = driver.getTitle();
		System.out.println("In Page : " + title);

		// Logged in User clicks CRM/SFA
		WebElement homePage = driver.findElement(By.linkText("CRM/SFA"));
		homePage.click();

		// Leads Tab - > CreateLead
		WebElement leadsTab = driver.findElement(By.linkText("Leads"));
		leadsTab.click();

		title = driver.getTitle();
		System.out.println("In Page : " + title);

		WebElement createLeadButton = driver.findElement(By.linkText("Create Lead"));
		createLeadButton.click();

		title = driver.getTitle();
		System.out.println("In Page : " + title);

		// Fill the details
		WebElement companyNameField = driver.findElement(By.id("createLeadForm_companyName"));
		companyNameField.sendKeys("TestCompany");

		WebElement firstNameField = driver.findElement(By.id("createLeadForm_firstName"));
		firstNameField.sendKeys("TestName1");
		String name = firstNameField.getAttribute("value");
	
		WebElement lastNameField = driver.findElement(By.id("createLeadForm_lastName"));
		lastNameField.sendKeys("TestName2");

		WebElement firstNameLocalField = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstNameLocalField.sendKeys("Test FirstName Local");

		WebElement lastNameLocalField = driver.findElement(By.id("createLeadForm_lastNameLocal"));
		lastNameLocalField.sendKeys("Test LastName Local");

		WebElement salutationField = driver.findElement(By.id("createLeadForm_personalTitle"));
		salutationField.sendKeys("Personal Title");

		WebElement titleField = driver.findElement(By.id("createLeadForm_generalProfTitle"));
		titleField.sendKeys("Test Title");

		WebElement birthDateField = driver.findElement(By.id("createLeadForm_birthDate"));
		birthDateField.sendKeys("05/05/1997");

		WebElement dptField = driver.findElement(By.id("createLeadForm_departmentName"));
		dptField.sendKeys("IT");

		WebElement revenueField = driver.findElement(By.id("createLeadForm_annualRevenue"));
		revenueField.sendKeys("500000");

		WebElement testDescField = driver.findElement(By.id("createLeadForm_description"));
		testDescField.sendKeys("Test description");

		WebElement countryCodeField = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countryCodeField.sendKeys("IN");

		WebElement emailField = driver.findElement(By.id("createLeadForm_primaryEmail"));
		emailField.sendKeys("test.leaf@gmail.com");
//
//		WebElement addressLine1Field = driver.findElement(By.id("createLeadForm_generalAddress1"));
//		addressLine1Field.sendKeys("Test address 1");
//
//		WebElement addressLine2Field = driver.findElement(By.id("createLeadForm_generalAddress2"));
//		addressLine2Field.sendKeys("Test address 2");
//
//		WebElement cityField = driver.findElement(By.id("createLeadForm_generalCity"));
//		cityField.sendKeys("Test City");

		WebElement createLeadSubmit = driver.findElement(By.className("smallSubmit"));
		createLeadSubmit.click();

		title = driver.getTitle();
		System.out.println("In Page : " + title);

		if (title.equals("View Lead | opentaps CRM")) {
			System.out.println("The resulting Page is Valid! Lead created successfully for FirstName : "+name);
			driver.close();
		} else {
			System.out.println("The resulting Page is InValid! Lead not created!!!");
			driver.close();
		}

	}

}

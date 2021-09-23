package assignments.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SalesForcePage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driverFile/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.name("UserFirstName")).sendKeys("Tester1stName");
		driver.findElement(By.name("UserLastName")).sendKeys("TesterLastName");
		driver.findElement(By.name("UserEmail")).sendKeys("tester@gmail.com");

		WebElement titleDropDown = driver.findElement(By.name("UserTitle"));
		Select title = new Select(titleDropDown);
		title.selectByVisibleText("Developer / Software Engineer / Analyst");

		driver.findElement(By.name("CompanyName")).sendKeys("TestLeaf");
		driver.findElement(By.name("UserPhone")).sendKeys("9500095000");

		WebElement employeesDropDown = driver.findElement(By.name("CompanyEmployees"));
		Select employees = new Select(employeesDropDown);
		employees.selectByVisibleText("501 - 1500 employees");

		WebElement cntryDropDown = driver.findElement(By.name("CompanyCountry"));
		Select cntry = new Select(cntryDropDown);
		cntry.selectByVisibleText("India");

		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();

		driver.findElement(By.name("start my free trial")).click();

		System.out.println("Successfully Started Free trial!!!");

	}

}

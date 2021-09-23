package assignments.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driverFile/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://en-gb.facebook.com/");
		driver.getTitle();

		driver.findElement(By.linkText("Create New Account")).click();

		driver.findElement(By.name("firstname")).sendKeys("Vaisshu");
		driver.findElement(By.name("lastname")).sendKeys("Ganesh");
		driver.findElement(By.name("reg_email__")).sendKeys("vgv.5597@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__"))
				.sendKeys(driver.findElement(By.name("reg_email__")).getAttribute("value"));
		driver.findElement(By.id("password_step_input")).sendKeys("Vaisshu5597");

		Select day = new Select(driver.findElement(By.name("birthday_day")));
		day.selectByVisibleText("5");

		Select month = new Select(driver.findElement(By.name("birthday_month")));
		month.selectByVisibleText("May");

		Select year = new Select(driver.findElement(By.name("birthday_year")));
		year.selectByVisibleText("1997");

		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.name("websubmit")).click();

		System.out.println("Navigated to next page successfully!!! Closing session.");
		driver.findElementByXPath("//h2[@class='uiHeaderTitle']").click();
		driver.close();

	}

}

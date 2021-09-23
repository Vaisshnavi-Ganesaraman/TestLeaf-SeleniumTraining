package assignments.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcmeTestUiLogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driverFile/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://acme-test.uipath.com/login");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("leaf@12");

		String title = driver.getTitle();
		System.out.println("Title : " + title);

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		System.out.println("Logged in successfully !!!");

		driver.findElement(By.linkText("Log Out")).click();

		System.out.println("Logged out successfully !!!");

		driver.close();
	}

}

package assignments.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driverFile/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");

		driver.switchTo().frame("frame1");
		driver.findElement(By.tagName("input")).sendKeys("Not a Friendly Topic");

		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		driver.switchTo().defaultContent();

		driver.switchTo().frame("frame2");
		Select select = new Select(driver.findElement(By.id("animals")));
		select.selectByVisibleText("Avatar");

		driver.close();

	}

}

package assignments.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BondWithButtons {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driverFile/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://leafground.com/pages/Button.html");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println(
				"'Get Position' button corrdinates : (" + driver.findElement(By.id("position")).getLocation().getX()
						+ "," + driver.findElement(By.id("position")).getLocation().getY() + ")");

		System.out.println("'Get Color' button : " + driver.findElement(By.id("color")).getAttribute("style"));

		System.out.println("'Get Size' button  :" + driver.findElement(By.id("size")).getCssValue("height") + ","
				+ driver.findElement(By.id("size")).getCssValue("width"));

		System.out.println("Clicking Home to navigate!!!");
		driver.findElement(By.id("home")).click();

		Thread.sleep(2000);
		driver.close();
	}

}

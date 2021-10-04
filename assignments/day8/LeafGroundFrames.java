package assignments.day8;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundFrames {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driverFile/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://www.leafground.com/pages/frame.html");

		WebElement frame1 = driver.findElement(By.xpath("(//div[@id='wrapframe']/iframe)[1]"));
		driver.switchTo().frame(frame1);

		File clickMe = driver.findElement(By.xpath("//button[@id='Click']")).getScreenshotAs(OutputType.FILE);
		File destName = new File("./screenshots/clickMe.jpg");
		FileUtils.copyFile(clickMe, destName);
		System.out.println("Click Me - screenshot taken!!!");
		driver.switchTo().defaultContent();

		List<WebElement> frameList = driver.findElements(By.tagName("iframe"));
		System.out.println("List of frames - " + frameList.size());
		Thread.sleep(5000);
		driver.close();
	}

}

package assignments.day7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropResizeSelectSort {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driverFile/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://jqueryui.com/draggable/");

		driver.switchTo().frame(0);
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(driver.findElement(By.id("draggable")), 100, 100).perform();
		System.out.println(driver.getTitle() + " - Successful !!!");
		driver.switchTo().defaultContent();

		driver.findElement(By.linkText("Droppable")).click();
		driver.switchTo().frame(0);
		builder.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).perform();
		System.out.println(driver.getTitle() + " - Successful !!!");
		driver.switchTo().defaultContent();

		driver.findElement(By.linkText("Resizable")).click();
		driver.switchTo().frame(0);
		builder.dragAndDropBy(driver.findElement(By.className("ui-resizable-handle")), -50, -50).perform();
		System.out.println(driver.getTitle() + " - Successful !!!");
		driver.switchTo().defaultContent();

		driver.findElement(By.linkText("Selectable")).click();
		driver.switchTo().frame(0);
		builder.click(driver.findElement(By.xpath("//li[text()='Item 5']"))).perform();
		System.out.println(driver.getTitle() + " - Successful !!!");
		driver.switchTo().defaultContent();

		driver.findElement(By.linkText("Sortable")).click();
		driver.switchTo().frame(0);
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 5']"));

		builder.dragAndDropBy(item1, item2.getLocation().getX(), item2.getLocation().getY()).perform();
		System.out.println(driver.getTitle() + " - Successful !!!");
		driver.switchTo().defaultContent();
	}

}

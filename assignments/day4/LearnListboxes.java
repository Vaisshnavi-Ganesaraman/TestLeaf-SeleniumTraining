package assignments.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnListboxes {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driverFile/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/Dropdown.html");

		WebElement dropDownForIndex = driver.findElement(By.id("dropdown1"));
		Select dropForIndex = new Select(dropDownForIndex);
		dropForIndex.selectByIndex(1);

		WebElement dropDownForText = driver.findElement(By.name("dropdown2"));
		Select dropForText = new Select(dropDownForText);
		dropForText.selectByVisibleText("Selenium");

		WebElement dropDownForValue = driver.findElement(By.id("dropdown3"));
		Select dropForValue = new Select(dropDownForValue);
		dropForValue.selectByValue("1");

		WebElement dropDownCount = driver.findElement(By.className("dropdown"));
		Select count = new Select(dropDownCount);
		System.out.println("No. Of dropdown Options : " + count.getOptions().size());

		WebElement dropDownWithoutSelectAttributes = driver
				.findElement(By.xpath("//option[text()='You can also use sendKeys to select']/parent::select"));
		Select dropdownUsingXpath = new Select(dropDownWithoutSelectAttributes);
		dropdownUsingXpath.selectByValue("1");

		WebElement dropDownMultiple = driver.findElement(By.xpath("//select[@multiple]"));
		Select dropdownUsingMultiple = new Select(dropDownMultiple);
		dropdownUsingMultiple.selectByValue("1");

	}

}

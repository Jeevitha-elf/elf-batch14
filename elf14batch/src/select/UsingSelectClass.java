package select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingSelectClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement dayList = driver.findElement(By.id("day"));
		Select select = new Select(dayList);
		select.selectByVisibleText("7");
		WebElement monthList  = driver.findElement(By.id("month"));
		Select select1 = new Select(monthList);
		select1.selectByValue("8");
		WebElement yearList  = driver.findElement(By.id("year"));
		Select select2 = new Select(yearList);
		select2.selectByIndex(24);
	}
}

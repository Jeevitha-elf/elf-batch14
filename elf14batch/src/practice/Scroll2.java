package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement wb = driver.findElement(By.partialLinkText("VIEW ALL"));
		js.executeScript("arguments[0].scrollIntoView(true)",wb);
		Thread.sleep(3000);
		//js.executeScript("arguments[0].click();",wb);
		js.executeScript("arguments[0].scrollIntoView(false)",wb);
	}
}

package practice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FindElementUsingWebElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.vtu4u.com");
		driver.findElement(By.id("usn")).sendKeys("2go16ec019");
		driver.findElement(By.id("syl3")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-success btn-lg btn-home-search']")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-success']")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='btn btn-success']")).click();
//	    Actions action = new Actions(driver);
//		action.moveByOffset(605, 440).click();
//		Thread.sleep(5000);
//		driver.quit();
	}
}

package WebElementMethods;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingKeys {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("trainee");
		driver.findElement(By.id("username")).sendKeys(Keys.CONTROL+"a");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys(Keys.CONTROL +"c");
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys(Keys.CONTROL +"v");
		driver.findElement(By.name("pwd")).sendKeys(Keys.CONTROL +"a");
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys(Keys.DELETE);
    }
}
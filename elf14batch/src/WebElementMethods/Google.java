package WebElementMethods;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//a[@class='gb_D']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//span[@pid='36']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@class='gb_D']")).click();
	}
}

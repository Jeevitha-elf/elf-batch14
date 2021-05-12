package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingContains {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	//driver.findElement(By.cssSelector("[data-testid=open-registration-form-button]")).click();
	//Thread.sleep(3000);
// driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
	}
}
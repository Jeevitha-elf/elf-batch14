package WebElementMethods;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitExpectedTitle {
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("trainee");
		driver.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys("trainee");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
        //WebDriverWait wait = new WebDriverWait(driver,10);
		
		//wait.until(ExpectedConditions.urlToBe(" https://www.instagram.com/"));
		//driver.findElement(By.xpath("//span[text()='Sign up']")).click();
		//wait.until(ExpectedConditions.
	}
}

package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[data-testid=open-registration-form-button]")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("firstname")).sendKeys("123456");
		driver.findElement(By.name("lastname")).sendKeys("1");
		driver.findElement(By.cssSelector("input[type='radio']")).click();
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@aria-label='Day' and @value='7']"));
		driver.findElement(By.xpath("//input[@aria-label='Day' and @value='8']"));
		
		
		
		driver.findElement(By.name("birthday_day")).sendKeys("7");
		driver.findElement(By.name("birthday_month")).sendKeys("Nov");
		driver.findElement(By.name("birthday_year")).sendKeys("1998");
		driver.findElement(By.name("websubmit")).click();
	}
}

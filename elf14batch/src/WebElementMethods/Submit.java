package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com");
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
	}
}
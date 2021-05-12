package WebElementMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		 Thread.sleep(3000);
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		 Thread.sleep(3000);
		String expected ="actiTIME - Time Tracking Software for Boosting Your Business";
		Set<String> allwids = driver.getWindowHandles();
		
	
		 for(String s : allwids) {
			driver.switchTo().window(s);
			if(expected.equals(driver.getTitle())) {
				break;
			}
				
					
		}
		 Thread.sleep(3000);
		 driver.findElement(By.className("header__link")).click();
}
}
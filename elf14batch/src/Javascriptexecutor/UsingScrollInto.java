package Javascriptexecutor;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingScrollInto {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com");
		String parentid= driver.getWindowHandle();
		Set<String> allwids = driver.getWindowHandles();
		allwids.remove(parentid);
		for(String s:allwids) {
			driver.switchTo().window(s);
			driver.close();
			
		}
		driver.switchTo().window(parentid);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement a1 = driver.findElement(By.partialLinkText("R&D Jobs"));
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(true)",a1);
		js.executeScript("arguments[0].click();",a1);
		
		
	
		
	}

}

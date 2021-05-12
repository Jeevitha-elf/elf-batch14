package Javascriptexecutor;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingJs4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement loginbutton = driver.findElement(By.name("username"));
		js.executeScript("arguments[0].value='abcd';",loginbutton);
		Object s= js.executeScript("return arguments[0].value",loginbutton);
		System.out.println(s);
	}
}

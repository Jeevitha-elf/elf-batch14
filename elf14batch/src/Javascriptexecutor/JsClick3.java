package Javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsClick3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://live.skillrary.com/testing-app/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement loginbutton = driver.findElement(By.xpath("//input[@class='form-control']"));
		js.executeScript("arguments[0].value='abcd';",loginbutton);
	}
}

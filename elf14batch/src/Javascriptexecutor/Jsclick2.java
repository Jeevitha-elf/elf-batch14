package Javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jsclick2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.oracle.com/in/java/technologies/javase-jdk15-downloads.html");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement loginbutton = driver.findElement(By.xpath("//a[text()='jdk-15.0.2_windows-x64_bin.zip']"));
		js.executeScript("arguments[0].click();",loginbutton);
		WebElement loginbutton1 = driver.findElement(By.xpath("//a[//a[text()='Download jdk-15.0.2_windows-x64_bin.zip']]"));
		js.executeScript("arguments[0].click();",loginbutton1);
	}
}
package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://175.100.150.83:9851/#/");
		driver.findElement(By.xpath("//input[@id='current-password']/../..//form[@class='transparentTextEditing']")).sendKeys("admin@admin.com");
		driver.findElement(By.xpath("//input[@id='email']/../..//form[@class='transparentTextEditing']")).sendKeys("admin@123");
	}
}

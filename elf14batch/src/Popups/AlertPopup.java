package Popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.marimallappawomenscollege.org/");
		driver.findElement(By.linkText("Contact Us")).click();
		driver.findElement(By.name("name")).sendKeys("abcde");
		driver.findElement(By.name("Send")).click();
	   Alert popup= driver.switchTo().alert();
	  System.out.println(popup.getText());
	  popup.accept();
	  popup.dismiss();
	  
	}
}

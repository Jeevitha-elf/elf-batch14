package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLinkText {
	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.skillrary.com");
		  driver.findElement(By.linkText("SIGN UP")).click();
    }
}

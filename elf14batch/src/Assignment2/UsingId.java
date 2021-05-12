package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingId {
	public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	  ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.com");
	  driver.findElement(By.xpath("//div[@id='nav-cart-text-container']")).click();
    }
}

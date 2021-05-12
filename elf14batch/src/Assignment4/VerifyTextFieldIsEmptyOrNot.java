package Assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTextFieldIsEmptyOrNot {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("abcd");
		WebElement s = driver.findElement(By.id("username"));
		String a = s.getAttribute("value");
		if(a.isEmpty()) {
			System.out.println("textbox is empty");
		}
		
		else {
			System.out.println("text box is not empty");
	    }
    }
}
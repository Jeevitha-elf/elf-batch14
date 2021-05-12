package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
	boolean b=driver.findElement(By.id("username")).isDisplayed();
	if(b==true) {
		System.out.println("button is displayed");
		
	}
	else {
		System.out.println("button is not displayed");
	}
		
		
		
 }
}
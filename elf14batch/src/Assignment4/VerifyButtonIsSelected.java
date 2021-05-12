package Assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyButtonIsSelected {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		boolean b = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		if(b==true) {
			System.out.println("button is selected");
			
		}
		
		else {
			System.out.println("button is not selected");
		}
		
	}
}

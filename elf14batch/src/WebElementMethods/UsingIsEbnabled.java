package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIsEbnabled {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		
		boolean button=driver.findElement(By.cssSelector("[type='submit']")).isEnabled();
		if(button == false) {
			System.out.println("button is disabled");
			
		}
		
		else {
			System.out.println("button is enabled");
		}
    }
}
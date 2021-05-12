package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindIsSelected {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[data-testid=open-registration-form-button]")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("firstname")).sendKeys("123456");
		driver.findElement(By.name("lastname")).sendKeys("1");
		driver.findElement(By.cssSelector("input[type='radio']")).click();
		boolean b=driver.findElement(By.cssSelector("input[type='radio']")).isSelected();
		if(b==true) {
			System.out.println("button is selected");
		
		}
		
		else {
			System.out.println("button is not selected");
		}
		
		
		

	}
}

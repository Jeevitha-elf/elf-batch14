package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCss {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		driver.findElement(  By.cssSelector("input#username")).sendKeys("rjeevithagec1998@gmail.com");
		driver.findElement(  By.cssSelector("input.textField")).sendKeys("rjeevithagec1998@gmail.com");
		driver.findElement(  By.xpath("//div[text()=Login ]")).click();
		
    }
}
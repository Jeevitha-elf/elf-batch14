package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementUsingDynamicXpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.dev/downloads/");
		driver.findElement(By.xpath("//td[text()='Ruby']/..//td[@data-label='Stable Version']")).getText();
		
	}

}

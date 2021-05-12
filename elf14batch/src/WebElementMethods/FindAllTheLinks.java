package WebElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllTheLinks {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		List<WebElement> s = driver.findElements(By.xpath("//a"));
		 int b = s.size();
		 for(WebElement a :s)   {
			 System.out.println(driver.getTitle());
		 }
	}
}

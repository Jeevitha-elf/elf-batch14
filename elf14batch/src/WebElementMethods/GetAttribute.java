package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			driver.get("https://demo.actitime.com");
			String s=driver.findElement(By.id("username")).getAttribute("type");
			System.out.println(s);
	}
}

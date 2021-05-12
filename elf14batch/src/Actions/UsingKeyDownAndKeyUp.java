package Actions; 

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingKeyDownAndKeyUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://marimallappawomenscollege.org/");
		Actions action = new Actions(driver);
		List<WebElement> wb = driver.findElements(By.xpath("//div[@id='chromemenu']/descendant::li"));
	    action.keyDown(Keys.CONTROL);
		for(WebElement w :wb) {
			action.click(w).perform();
		}
		action.keyUp(Keys.CONTROL).perform();
	}
}

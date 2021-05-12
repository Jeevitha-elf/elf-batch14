package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://live.skillrary.com/testing-app/product.php?product=selenium-training");
		WebElement wb =driver.findElement(By.id("add"));
		Actions actions = new Actions(driver);
		actions.doubleClick(wb).perform();
		WebElement wb1 =driver.findElement(By.id("minus"));
		actions.doubleClick(wb1).perform();
	}
}

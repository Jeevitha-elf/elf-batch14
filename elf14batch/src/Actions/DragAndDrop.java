package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.trello.com/login");
		driver.findElement(By.id("user")).sendKeys("rjeevithagec1998@gmail.com");
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("Jeevitha@123");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='board-tile-details is-badged']/child::div[@title='12345']")).click();
		Thread.sleep(3000);
	 WebElement source = driver.findElement(By.xpath("//span[text()='B']"));
	 Thread.sleep(3000);
	 WebElement destination=driver.findElement(By.xpath("//textarea[text()='Doing']"));
	 Actions actions = new Actions(driver);
	Thread.sleep(3000);
	actions.dragAndDrop(source,destination).perform();
	 }
}

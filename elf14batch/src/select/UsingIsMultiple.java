package select;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIsMultiple {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com");
		Set<String> allwids = driver.getWindowHandles();
		String parentId = driver.getWindowHandle();
		allwids.remove(parentId);
		for(String s:allwids) {
			driver.switchTo().window(s);
			driver.close();
		}
		driver.switchTo().window(parentId);
		driver.findElement(By.id("login_Layer")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("sumanthqsp@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Testing@123",Keys.ENTER);
		//driver.findElement(By.xpath("//button[text()='Login'")).click();
		driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.linkText("Add Preferred Work Location")).click();
	//driver.findElement(By.xpath("//div[@class='action']")).sendKeys("C:\\Users\\mahantesh\\DocumentsJeevitha R1.pdf");
		//driver.findElement(By.id("attachCV")).sendKeys("C:/Users/mahantesh/DocumentsJeevitha R1.pdf");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='action']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("./autoit/fileUpload.exe");
	
	}
}

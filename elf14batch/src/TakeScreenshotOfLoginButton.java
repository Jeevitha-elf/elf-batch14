 import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotOfLoginButton {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		String ltd=LocalDateTime.now().toString().replace(":", "_");
		System.out.println(ltd);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File tempfile = driver.findElement(By.xpath("//button[@name='login']")).getScreenshotAs(OutputType.FILE);
		Thread.sleep(4000);
		File destfile = new File("./errorshots/"+ltd+".png");
		FileUtils.copyFile(tempfile, destfile);
		driver.quit();
	}
}

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingDataFromPropertyFile {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fin = new FileInputStream("./resources/actitime.properties");
		Properties property = new Properties();
		property.load(fin);
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(property.getProperty("url"));
		System.out.println(property.getProperty("Username"));
		System.out.println(property.getProperty("Password"));
		driver.get(property.getProperty("url"));
		driver.findElement(By.id("username")).sendKeys(property.getProperty("Username"));
		driver.findElement(By.name("pwd")).sendKeys(property.getProperty("Password"),Keys.ENTER);
		
		
	}
}

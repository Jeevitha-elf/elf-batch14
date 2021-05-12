package Assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightAndWidthOfImage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com");
		Dimension dim = driver.findElement(By.xpath("//div[@class='persuation-hacks last-booked']")).getSize();
		System.out.println(dim.getHeight());
		System.out.println(dim.getWidth());
		
	}
}

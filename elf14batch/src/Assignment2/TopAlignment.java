package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class TopAlignment {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		final int SPACE=5;
		Rectangle po = driver.findElement(By.xpath("//input[@id='username']")).getRect();
		int y = po.y;
		int height=po.height;
		Rectangle po1 = driver.findElement(By.xpath("//input[@class='textField pwdfield']")).getRect();
		int y1= po1.y;
		if(y1+SPACE>=y+height) {
			System.out.println("Top allignment is verified");
		}
		else {
			System.out.println("Top allignment is different");
		}
	}
}

package Assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class TopAllignment {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login");
		final int SPACE=5;
		Rectangle po = driver.findElement(By.id("email")).getRect();
		int y = po.y;
		int height=po.height;
		Rectangle po1 = driver.findElement(By.id("pass")).getRect();
		int y1= po1.y;
		if(y1>=y+height+SPACE) {
			System.out.println("Top allignment is verified");
		}
		else {
			System.out.println("Top allignment is different");
		}
    }
}
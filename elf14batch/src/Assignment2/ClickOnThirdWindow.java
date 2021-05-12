package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnThirdWindow {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		Point po = driver.findElement(By.xpath("//input[@id='username']")).getLocation();
		int a = po.x;
		System.out.println(a);
		Point po1= driver.findElement(By.xpath("//input[@class='textField pwdfield']")).getLocation();
		int b = po1.x;
		if(a==b) {
			System.out.println("left allignment is same");
		}
		else {
			System.out.println("left allignment is different");
		}
	}
}

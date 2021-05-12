package Assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeftAllignment {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login");
		Point po = driver.findElement(By.id("email")).getLocation();
		int startx=po.getX();
		System.out.println(startx);
		Point po1 = driver.findElement(By.id("pass")).getLocation();
        int startx2= po1.x;
        System.out.println(startx2);
        if(startx==startx2) {
        	System.out.println("left allignment is correct");
        }
        else {
        	System.out.println("left allignment is notcorrect");
		
	    }
    }
}
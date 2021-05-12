package Assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightAllignment {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login");
		Rectangle po = driver.findElement(By.id("email")).getRect();
		int a = po.x;
        int b= po.width;
        int c= a+b;
        System.out.println(c);
        Rectangle po1 = driver.findElement(By.id("pass")).getRect();
        int d= po1.x;
        int e= po.width;
        int f= d+e;
        System.out.println(f);
        if(c==f) {
        	System.out.println("right allignment is correct");
        }
        else {
        	System.out.println("right allignment is notcorrect");
        }
	}
}

package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToverifyRightAllignment {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		Rectangle po = driver.findElement(By.xpath("//input[@id='username']")).getRect();
		int a = po.x;
        int b= po.width;
        int c= a+b;
        Rectangle po1 = driver.findElement(By.xpath("//input[@class='textField pwdfield']")).getRect();
        int d= po1.x;
        int e= po.width;
        int f= d+e;
        if(c==f) {
        	System.out.println("right allignment is correct");
        }
        else {
        	System.out.println("right allignment is notcorrect");
        }
        
		
		
	}
}

package WebElementMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FindingUsingIrctc {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.com");
		driver.findElement(By.xpath("//a[@href='https://www.the-maharajas.com/']")).click();
       Set<String> allwids= driver.getWindowHandles();
       for(String s : allwids) {
    	   driver.switchTo().window(s);
    	 
    	   
    	   
    	}
    	   
       
       
		
	}
}

package Javascriptexecutor;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class UsingInfiniteForLoop {
 public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.com/doodles");
    JavascriptExecutor js = (JavascriptExecutor) driver;
    for(;;) {
    	
    	try {
    		driver.findElement(By.linkText("Thanksgiving 2020")).click();
    		break;
    		
    	}
    	catch(NoSuchElementException e)
    	{
    		
    		js.executeScript("window.scrollBy(0,100)");
    	}
    }
    
    
    
	
}
}

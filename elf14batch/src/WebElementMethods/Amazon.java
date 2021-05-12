package WebElementMethods;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	static WebDriver driver;
	static String parentwid;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
	    parentwid=driver.getWindowHandle();
	    Amazon.searchAndAddToCart("oneplus","//span[text()='OnePlus Nord 5G (Blue Marble, 12GB RAM, 256GB Storage)']");
	    Thread.sleep(4000);
	    Amazon.searchAndAddToCart("vivo","//span[text()='Vivo Y12s (Phantom Black, 3GB, 32GB ) with No Cost EMI/Additional Exchange Offers']");
	    Thread.sleep(4000);
	    Amazon.searchAndAddToCart("Apple","//span[text()='New Apple iPhone 12 Mini (256GB) - White']");
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("div[id='nav-cart-count-container']")).click();
	   }
	private static void searchAndAddToCart(String mobile, String xpath) throws InterruptedException{
		Thread.sleep(4000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		Thread.sleep(4000);
		driver.findElement(By.id("nav-search-submit-text")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(xpath)).click();
		Thread.sleep(4000);
		Set<String> allwids=driver.getWindowHandles();
		allwids.remove(parentwid);
		for(String s:allwids)
			driver.switchTo().window(s);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		driver.close();
		driver.switchTo().window(parentwid);
		// TODO Auto-generated method stub
		
	}
	
	}


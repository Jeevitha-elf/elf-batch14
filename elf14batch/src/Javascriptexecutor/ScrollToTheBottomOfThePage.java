package Javascriptexecutor;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToTheBottomOfThePage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com");
		String parentid= driver.getWindowHandle();
		Set<String> allwids = driver.getWindowHandles();
		allwids.remove(parentid);
		for(String s:allwids) {
			driver.switchTo().window(s);
			driver.close();
		}
		driver.switchTo().window(parentid);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight);");
	}
}

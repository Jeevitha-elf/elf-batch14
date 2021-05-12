package Assignment1;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
public class GetTitle {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.naukri.com");
		 Set<String> allwids = driver.getWindowHandles();
		 for(String s : allwids) {
		   driver.switchTo().window(s);
		   System.out.println(driver.getTitle());
	     }
    }
}
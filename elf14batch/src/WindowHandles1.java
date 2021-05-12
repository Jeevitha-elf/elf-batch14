import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;



public class WindowHandles1 {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.naukri.com");
		   Set<String> allwids = driver.getWindowHandles();
			 for(String s : allwids) {
				 String a= driver.getWindowHandle();
				 driver.switchTo().window(s);
				 if(driver.getWindowHandle().equals(a)) {
					 driver.close();				 
				 }
		 }
				 
	
		
			 
}
}
 
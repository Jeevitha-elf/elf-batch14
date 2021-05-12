import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowClose {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		 Set<String> allwids = driver.getWindowHandles();
		 for(String s : allwids) {
		     driver.switchTo().window(s);
		     driver.manage().window().maximize();
		     System.out.println(driver.getTitle());
		     driver.close();
	}
  }
}
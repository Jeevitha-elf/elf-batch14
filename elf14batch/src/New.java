import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;



public class New {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		Set<String> s = driver.getWindowHandles();
		driver.manage().window().maximize();
		for(String a : s) {
			driver.switchTo().window(a);
			System.out.println(driver.getTitle());
			
		}
			
	}

}

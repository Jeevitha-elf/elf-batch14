package WebElementMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Position {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
     }
}

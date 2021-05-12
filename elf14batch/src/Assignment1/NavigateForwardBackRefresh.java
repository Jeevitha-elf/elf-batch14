package Assignment1;

import org.openqa.selenium.chrome.ChromeDriver;
public class NavigateForwardBackRefresh {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.get("https://www.instagram.com");
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
    }
}
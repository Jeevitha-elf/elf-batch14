package practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseParent {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		driver.close();
		System.out.println(driver.getTitle());
}
}

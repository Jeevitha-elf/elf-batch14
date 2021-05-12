import org.openqa.selenium.firefox.FirefoxDriver;

public class getCurrentUrl {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		System.out.println(driver.getCurrentUrl());


}
}
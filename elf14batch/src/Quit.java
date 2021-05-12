import org.openqa.selenium.firefox.FirefoxDriver;

public class Quit {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com");
		driver.quit();

}
}
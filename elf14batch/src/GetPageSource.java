import org.openqa.selenium.firefox.FirefoxDriver;

public class GetPageSource {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		

}
}

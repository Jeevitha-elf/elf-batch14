import org.openqa.selenium.chrome.ChromeDriver;
public class Back {
  public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.get("https://www.instagram.com");
		driver.navigate().back();
  }
}
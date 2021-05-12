import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.chrome.ChromeDriver;
public class Tourl {
  public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		URL url = new URL("https://www.google.com");
		driver.navigate().to(url);
  }
}
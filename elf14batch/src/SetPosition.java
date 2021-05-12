import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
public class SetPosition {
	 public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com");
		 Point point = new Point(50,100);
		 driver.manage().window().setPosition(point);
	 }
}

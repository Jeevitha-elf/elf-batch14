import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetPosition {
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			Point point = driver.manage().window().getPosition();
			System.out.println(point.getX());
			System.out.println(point.getY());
	}
}

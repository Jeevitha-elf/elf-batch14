import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetDimension {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Dimension dim = driver.manage().window().getSize();
		System.out.println(dim.getHeight());
		System.out.println(dim.getWidth());
    }
}
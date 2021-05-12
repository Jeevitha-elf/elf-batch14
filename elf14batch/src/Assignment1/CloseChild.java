package Assignment1;
import java.util.Set;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChild {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		String parentId = driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();
		allwin.remove(parentId);
        for(String s : allwin) {
			 driver.switchTo().window(s);
		     System.out.println(s);
		     driver.close();

        }
	}
}

import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		String wid=driver.getWindowHandle();
		System.out.println(wid);
	}
}

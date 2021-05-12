import org.openqa.selenium.chrome.ChromeDriver;

public class FullScreen {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().fullscreen();
}
}
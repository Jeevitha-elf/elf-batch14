import org.openqa.selenium.chrome.ChromeDriver;

public class To {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.navigate().to("https://www.google.com");
	
	
}
}

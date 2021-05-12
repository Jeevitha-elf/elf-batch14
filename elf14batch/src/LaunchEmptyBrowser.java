import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchEmptyBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		//Dimension dimension= new Dimension(300,500);
		 //driver.manage().window().setSize(dimension);
		 
		 
		Dimension dim = driver.manage().window().getSize();
		
		System.out.println(dim.getHeight());
		System.out.println(dim.getWidth());
		
		
		Point po = new Point(50,125);
		driver.manage().window().setPosition(po);
		Point point = driver.manage().window().getPosition();
		Thread.sleep(3000);
		
		
		System.out.println(point.getX());
		System.out.println(point.getY());
		
		
		
		
		
	
		//driver.get("https://www.naukri.com");
		//driver.get("https://www.facebook.com");
		
		driver.navigate().to("https://www.instagram.com");
		
		
		
		/*String title = driver.getTitle();
		System.out.println(title);
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		System.out.println(driver.getCurrentUrl());
		Navigation nav = driver.navigate();
		nav.back();
		*/
		
		
		
		
		
	}



}
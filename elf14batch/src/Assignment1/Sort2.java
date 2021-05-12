package Assignment1;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sort2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.naukri.com");
	    Set<String> allwids = driver.getWindowHandles();
	    TreeSet<String> ls = new TreeSet<String>();
	    for(String s : allwids) {
		    driver.switchTo().window(s);
			String a = driver.getTitle().toLowerCase();
			ls.add(a);
			driver.close();
	    }	
	        for(String b : ls){
			   System.out.println(b);
	        }

      }
}


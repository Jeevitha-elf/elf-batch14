package Assignment1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sort {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.naukri.com");
	    Set<String> allwids = driver.getWindowHandles();
	    ArrayList<String> ls = new ArrayList<String>();
	    for(String s : allwids) {
		    driver.switchTo().window(s);
			String a = driver.getTitle();
			String a1 = a.toLowerCase();
			ls.add(a1);
			Collections.sort(ls);
	    }
	        for(String b : ls){
			   System.out.println(b);
	        }
	    }
    }


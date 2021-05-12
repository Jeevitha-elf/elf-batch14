package select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingGetOptions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
         WebElement dayList = driver.findElement(By.id("day"));
         Select select = new Select(dayList);
         List<WebElement> day = select.getOptions();
        for(WebElement wb : day) {
        	select.selectByVisibleText(wb.getText());
        	Thread.sleep(3000);
       System.out.println(wb.getText());
       //select.selectByValue(wb.getText());
   	//Thread.sleep(3000);
 // System.out.println(wb.getText());
   	
        }
    }
}

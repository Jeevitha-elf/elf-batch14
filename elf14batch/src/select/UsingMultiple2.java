package select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingMultiple2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String s= "C:\\Users\\mahantesh\\eclipse-workspace\\elf14batch\\htmlprogram.html";
		driver.get(s);
		
		WebElement list = driver.findElement(By.id("list1"));
		Select select = new Select(list);
		List<WebElement> a = select.getOptions();
		int count=0;
		for(WebElement wb:a) {
		if(select.isMultiple()==true) {
			select.selectByVisibleText(wb.getText());
            if(count==3) {
				
				break;
			}
            count++;
			wb.click();
			
		}
	
			
		}
	}
}	




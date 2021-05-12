package Popups;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NextYear {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com");

		Actions action = new Actions(driver);
		action.moveByOffset(1180, 525).click().perform();
		driver.findElement(By.id("DepartDate")).click();
		LocalDate ltd=LocalDate.now().plusYears(1);
		int day= ltd.getDayOfMonth();
		String month=ltd.getMonth().name();
		month = month.substring(0,1).toUpperCase()+month.substring(1, month.length()).toLowerCase();
		int year=ltd.getYear();

		System.out.println(year);
		//	driver.findElement(By.xpath("//span[text()='"+month+"']/../../..//a[text()='"+day+"']")).click();
		for(;;) {
			try {
				//driver.findElement(By.xpath("//span[text()='"+year+"']/../..//span[text()='"+month+"']/../../..//a[text()='"+day+"']")).click();
//				driver.findElement(By.xpath("//span[text()='2022']/../../..//span[text()='April']/../../..//a[text()='12']")).click();
				driver.findElement(By.xpath("//span[text()='"+year+"']/../../..//span[text()='"+month+"']/../../..//a[text()='"+day+"']")).click();
				break;
			}catch(NoSuchElementException e) {
				//driver.findElement(By.xpath("//a[@title='Next' and contains(@class,'nextMonth')]")).click();
				driver.findElement(By.xpath("//a[@class='nextMonth ']")).click();
			}
		}
   }
}

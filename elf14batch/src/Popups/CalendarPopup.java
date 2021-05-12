package Popups;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalendarPopup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com");
		
		Actions action = new Actions(driver);
		action.moveByOffset(1180, 525).click().perform();
		driver.findElement(By.id("DepartDate")).click();
		LocalDate ltd=LocalDate.now();
		int day= ltd.getDayOfMonth();
		String month=ltd.getMonth().name();
		ltd.getYear();
		month=month.substring(0,1).toUpperCase()+month.substring(1,month.length());
		System.out.println(month);
		//driver.findElement(By.xpath("//span[text()='"+month+"']/../../..//a[text()='"+day+"']")).click();
		
		driver.findElement(By.xpath("//span[text()='2021']/../..//span[text()='April']/../../..//a[text()='12']")).click();
		
		//WebElement wb = driver.findElement(By.id("ui-datepicker-div"));
		
		//driver.findElement(By.linkText("12")).click();
	}
}


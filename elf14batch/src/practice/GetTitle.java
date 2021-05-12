package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com");
		driver.findElement(By.className("src_btn")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Bus")).click();
		driver.findElement(By.xpath("//input[@onclick='SearchFlightWithArmy();' and @value='Search']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.easemytrip.com/charters/flight.html']")).click();
		driver.findElement(By.xpath("//span[@class='checkmark']")).click();
		driver.findElement(By.className("checkmark")).click();
		driver.findElement(By.xpath("//span[@class='checkmark']/ancestor::label[@class='container']/descendant::input[@onclick='chekMulBox(this)']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("FromSector_show")).click();
		driver.findElement(By.id("airport2")).click();
	} 
} 

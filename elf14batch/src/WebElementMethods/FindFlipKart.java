package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindFlipKart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.className("2KpZ6l _2doB4z")).click();
		driver.get("https://www.flipkart.com/search?q=poco+x3+cobalt+blue&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_14_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_14_na_na_na&as-pos=1&as-type=RECENT&suggestionId=poco+x3+cobalt+blue%7CMobiles&requestId=f9d3feba-e260-4e52-93e7-044199191ebb&as-searchtext=poco%20x3%20cobalt");
		driver.findElement(By.xpath("input[@placeholder='Search for products, brands and more']")).sendKeys("poco cobalt blue 128gb");
		//driver.findElement(By.xpath("//")).getText();
		driver.findElement(By.xpath("div[text()='POCO X3 (Cobalt Blue, 128 GB)']/../..//div[@class='_30jeq3 _1_WHN1']")).getText();
}
} 
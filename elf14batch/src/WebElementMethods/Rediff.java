package WebElementMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.rediffmail.com");
        driver.findElement(By.xpath("//a[@class='signin']")).click();
        driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("sumanthelf");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testing@123");
        driver.findElement(By.xpath("//input[@name='proceed']")).click();
        driver.findElement(By.xpath("//b[text()='Write mail']")).click();
        driver.findElement(By.xpath("//input[@class='rd_inp_to as-input']")).sendKeys("sumanthelf@rediff.com");
        driver.findElement(By.xpath("//input[@class='rd_inp_sub rd_subject_datacmp2']")).sendKeys("Jeevitha");
        WebElement wb = driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
        driver.switchTo().frame(wb);
        driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("Hello");
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[@class='send_ng_compo rd_btn_cmp_send']")).click();
        driver.findElement(By.xpath("//a[@class='mr_icon2 rd_mail_trash masterTooltip']/../..//span[@title='Jeevitha']")).click();
        //driver.switchTo().frame("rdMaillisBotBanner");
        driver.findElement(By.xpath("//a[@class='ng_mid_delete']")).click();
        
      }
}
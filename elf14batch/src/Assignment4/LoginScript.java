package Assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginScript {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
	//step2:precondition-Enter the valid username
		String userName1="trainee";
    WebElement username= driver.findElement(By.id("username"));
    username.sendKeys(userName1);
  String actualUserName = username.getAttribute("value");
    if(actualUserName.equals(userName1)) {
    	System.out.println("user name is entered successfully");
    }
    else {
    	System.out.println("username is not entered");
    }
		
	//step3:precondition-Enter the password
    String password = "trainee";
    WebElement password1=driver.findElement(By.xpath("//input[@class='textField pwdfield']"));
    password1.sendKeys(password);
    String actualPassword = password1.getAttribute("value");
    if(actualPassword.equals(password)) {
    	System.out.println("password entered successfully");
    }
    else {
    	System.out.println("password is not entered");
    }
    //step4:precondition-click on login
    driver.findElement(By.xpath("//div[text()='Login ']")).click();
    System.out.println("clicked on login button");
    Thread.sleep(4000);
   WebElement logout= driver.findElement(By.id("logoutLink"));
    if(logout.isDisplayed()) {
    	System.out.println("logout button is displayed");
    }
    else {
    	System.out.println("logout button is not displayed");
    }
  }
}




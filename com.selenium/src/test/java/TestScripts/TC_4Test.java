package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibrary.BaseTest;

public class TC_4Test extends BaseTest {
	@Test
	public void loginTest() {
//		Assert.assertEquals("Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM",driver.getTitle(),"Home page is not displayed");
//		Reporter.log("Home page is displayed",true);

		//Place the mouse cursor on "Product" and click on Product link
		home.home(driver);
		Assert.assertEquals("Administrator - Products - vtiger CRM 5 - Commercial Open Source CRM",driver.getTitle(),"Product list page is not displayed");
		Reporter.log("Product list page is displayed",true);

		//naviagate to "create new Product"page by click on "+" image
		pls.getNewProduct().click();
		Assert.assertEquals("Administrator - Products - vtiger CRM 5 - Commercial Open Source CRM",driver.getTitle(),"new Product page is not displayed");
		Reporter.log("new Product page is displayed",true);

		//create a Product and save
		cnp.getProductName().sendKeys("Pendrive");
		 driver.findElement(By.name("discontinued")).click();
		cnp.getSaveButton().click();
		Assert.assertEquals("Administrator - Products - vtiger CRM 5 - Commercial Open Source CRM",driver.getTitle(),"Product is not added");
		Reporter.log("Product is added successfully",true);
		WebElement active = driver.findElement(By.id("dtlview_Product Active"));
		//Assert.assertEquals("yes",active.getText(),"Product is inactive");
		SoftAssert sa =new SoftAssert();
		sa.assertEquals("yes",active.getText(),"Product active");
		Reporter.log("Product is inactive",true);


		//Logout
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement a = driver.findElement(By.xpath("//a[text()='Sign Out']"));
		js.executeScript("arguments[0].click();",a);
		Assert.assertEquals("vtiger CRM 5 - Commercial Open Source CRM",driver.getTitle(),"Login page is not displayed");
		Reporter.log("login page is displayed",true);
	}
}

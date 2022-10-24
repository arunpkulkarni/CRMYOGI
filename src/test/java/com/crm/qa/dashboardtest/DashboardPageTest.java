package com.crm.qa.dashboardtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.qa.logintestcase.LoginPageTest;

import Excel.data;
import main.Base;
import main.PropertyManager;
import main.geturl;
import objectRepo.CustomerManagementObjects;
import objectRepo.DashboardPageObjects;

public class DashboardPageTest extends Base {
	data da = new data();
	 static DashboardPageObjects dash=new DashboardPageObjects();
	geturl gu= new geturl();
	String url = gu.getURL();
	String username = PropertyManager.getInstance().getUsername();
	String password = PropertyManager.getInstance().getPassword();
	static String Actual = "Test Automation";
	private Object scrollRight;



	/*
	 * @Test(enabled = true, priority =1) public void validatedashboardlogin()
	 * throws Exception { LoginPageTest.ValidateSIGNIN(); }
	 */
	
	@Test(enabled = true, priority =2)
	public static void Validatedashboardsublink() throws Exception {
	//			LoginPageTest.ValidateSIGNIN();	
		dash.dashboardmain(driver).click();
		Thread.sleep(2000);
	      System.out.println("click on dashboard ");
	      
	      
	      dash.dashboardoption(driver).click();
	      Thread.sleep(2000);
	      System.out.println("click on dash option ");
	      
	      
	      
	      // Create object of the Select class
	      Select se3 = new Select(dash.area(driver));
	      Thread.sleep(2000);
	     // se3.selectByIndex(1);
	      se3.selectByVisibleText("All Testing");
	      Thread.sleep(2000);
	      
	   // Create object of the Select class
	      Select se10 = new Select(dash.stack(driver));
	      
	      Thread.sleep(1000);
	      //se4.selectByValue(3);
	      se10.selectByVisibleText("All Signals");
	      Thread.sleep(1000);	
	      System.out.println("select dropdown priority");
	      
	      dash.Operator(driver).click();
	      Thread.sleep(1000);
	      System.out.println("click on Operator ");
	      Thread.sleep(1000);
//--------------------------------------------------------------------------------------------
/*	    
	  
	    //scroll to dropdown option 
			Thread.sleep(3);
			// scroll down by 500 pixels with Javascript Executor
		      JavascriptExecutor j = (JavascriptExecutor) driver;
		      j.executeScript("window.scrollBy(0,250)");
		      Thread.sleep(5000);
	      
		      WebElement radio =driver.findElement(By.xpath("//span[@class='ui-radiobutton-icon ui-clickable pi pi-circle-on']"));
		      JavascriptExecutor j1 = (JavascriptExecutor) driver;
              j1.executeScript("window.scrollBy(0,50)");
              
		      radio.click();
	    //  dash.radiobuttoncustomer(driver).click();	
	      Thread.sleep(5000);
	      System.out.println("click on Radio button");
*/	      
	//========================================================================================================================
	        
	 /*      
	        dash.scrolltoview(driver);
	        
	    System.out.println("click on scroll");
	        
	        // scroll down by 500 pixels with Javascript Executor
	    WebElement act=driver.findElement(By.xpath(" //li[contains(text(),'18:28:47')]"));
	 
	    //WebElement act=driver.findElement(By.xpath("//li[contains(text(),'"+Actual+"']"));
		      JavascriptExecutor j123 = (JavascriptExecutor) driver;
	      j123.executeScript("arguments[0].scrollIntoView(true);",act);
	        
	      
	        
	        
	       // Assert.assertEquals("Test Automation",driver.findElement(By.xpath("")).getText(driver.findElement(By.xpath("//li[contains(text(),'16:22:11')]";
		 //     Assert.assertEquals("Test Automation"getText(driver.findElement(By.xpath("//li[contains(text(),'16:22:11')]";
	   //     Thread.sleep(5000);
	        
	*/      
	      WebElement radio2 =driver.findElement(By.xpath("/html/body/app-layout/div[4]/app-stack-winelands/div[3]/div[1]/div/div/form/p-table/div/div[2]/div/div[2]/table/tbody/tr[10]/td[1]/p-tableradiobutton/div/div[2]/span"));
	      JavascriptExecutor j1 = (JavascriptExecutor) driver;
          j1.executeScript("window.scrollBy(0,50)");
          radio2.click();
          
	      
	      Thread.sleep(5000);
	      dash.scrolltoview(driver);
	      System.out.println("click on scroll");
	      
	     String ActualerrorMessage1 = driver.findElement(By.xpath("//li[@class='ng-star-inserted'][contains(.,'12:07:14   Arun  Kulkarni , Phone-In OB noted Test Automation 201022')]")).getText();
	      System.out.println(ActualerrorMessage1);
	      String ExpectedMessage1 = "Test Automation 201022";
	      Assert.assertEquals(ActualerrorMessage1, ExpectedMessage1, "Assertion is unsuccessfull");
	      
	      
	      
	    
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      //============================================
	    //----------------------------------
		/*
		 * Assert.assertEquals("Test Automation", "Test Automation",
		 * "matching the Text entered");
		 * System.out.println("validation of entered text under Notepad");
		 */
	
	}
	
}
	
	

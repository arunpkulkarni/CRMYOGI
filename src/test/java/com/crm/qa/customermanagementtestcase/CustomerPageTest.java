package com.crm.qa.customermanagementtestcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.crm.qa.dashboardtest.DashboardPageTest;
import com.crm.qa.logintestcase.LoginPageTest;

import Excel.data;
import main.Base;
import main.PropertyManager;
import main.geturl;
import objectRepo.CustomerManagementObjects;
import objectRepo.HomePageObjects;

public class CustomerPageTest extends Base {
	data da = new data();
	CustomerManagementObjects cust=new CustomerManagementObjects();
	geturl gu= new geturl();
	String url = gu.getURL();
	String username = PropertyManager.getInstance().getUsername();
	String password = PropertyManager.getInstance().getPassword();
	String Actual = "Test Automation";
	//private Object scrollRight;

	
	@Test(enabled = true, priority =1)
		
	public void Validatecustomerephonein() throws Exception {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		test = extent.createTest("As a Vistor login customer ");
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		
		 Thread.sleep(5000);
		LoginPageTest.ValidateSIGNIN();
		/*
		 * //User name filed(driver).click();
		 * wait.until(ExpectedConditions.visibilityOf(cust.Usernamefield(driver)));
		 * cust.Usernamefield(driver).sendKeys(username); Thread.sleep(5);
		 * 
		 * //password field name filed(driver).click();
		 * wait.until(ExpectedConditions.visibilityOf(cust.passwordfield(driver)));
		 * cust.passwordfield(driver).sendKeys(password); Thread.sleep(5);
		 * 
		 * 
		 * //SignIN button (driver).click();
		 * wait.until(ExpectedConditions.visibilityOf(cust.SignInbutton(driver)));
		 * Thread.sleep(3); cust.SignInbutton(driver).click(); Thread.sleep(5);
		 */
	
	//===================Customer================
	
	//customer button
		 Thread.sleep(5000);
			// scroll down by 500 pixels with Javascript Executor
		      JavascriptExecutor j = (JavascriptExecutor) driver;
		      j.executeScript("window.scrollBy(0,50)");
		      
		      cust.customermanagementlink(driver).click();
		      Thread.sleep(5000);
		      System.out.println("click on customer management ");
		      
		      cust.customeroptions(driver).click();
		      Thread.sleep(5000);
		      System.out.println("click on customer ");
			
				/*
				 * cust.customeroptions(driver).click(); Thread.sleep(5000);
				 * System.out.println("click on customer ");
				 */
		      
		   // scroll down by 500 pixels with Javascript Executor
		      JavascriptExecutor jse = (JavascriptExecutor) driver;   
		      WebElement Element = driver.findElement(By.xpath("//label[contains(.,'Select Status')]"));
		      jse.executeScript("arguments[0].scrollIntoView();", Element);
		      Thread.sleep(5000);
		      System.out.println("scroll from left to right");
		    //  ===-------------------------Select Active option from Status-----------------------------
		        //Selecting Items 
				cust.statusselect(driver).click();
				 Thread.sleep(5000);
				cust.activeoption(driver).click();
			//-----------------------------------------------------------------
				// scroll down by 500 pixels with Javascript Executor
			      JavascriptExecutor jse1 = (JavascriptExecutor) driver;   
			      WebElement Element1 = driver.findElement(By.xpath("(//input[contains(@type,'text')])[1]"));
			      jse1.executeScript("arguments[0].scrollIntoView();", Element1);
			      Thread.sleep(5000);
			      System.out.println("scroll from right to left");
	  //-----------------------------------------------------------------
			  
			     driver.findElement(By.xpath("(//input[contains(@type,'text')])[1]")).sendKeys("CUS221083A8CD2");
			   //  WebElement radio =driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-clickable'])[11]"));
			    //  driver.findElement(By.xpath("(//input[contains(@type,'text')])[1]")).sendKeys("CAF22072E7A56BD");
			      
			      Thread.sleep(5000);
			      
			      //cust.custid(driver).click();
			   WebElement ele123=driver.findElement(By.xpath("//a[contains(.,'CAF2208C4C6EF2B')]"));
			   ele123.click();
			      
			      Thread.sleep(2000);
			      cust.quicklink(driver).click();
			      System.out.println("click on quicklink");
			      Thread.sleep(2000);
			      cust.createphoneIn(driver).click();
			      Thread.sleep(3000);
			      System.out.println("click on createphonein");
			    //  cust.alarmtype(driver).click();
			      System.out.println("click on select alarmtype");
			      
			      // Create object of the Select class
			      //Select se3 = new Select(driver.findElement(By.xpath("//select[@name='Alarm Type']")));
			      Select se3 = new Select(cust.AlarmTypedropdown1(driver));
			      Thread.sleep(5000);
			      se3.selectByVisibleText("ALM | ALARM");
			     // se3.selectByIndex(4);
			      Thread.sleep(3000);
			      
			   // Create object of the Select class
			   //   Select se10 = new Select(driver.findElement(By.xpath("//select[@name='Priority']")));
			      Select se10 = new Select(cust.Prioritydropdown(driver));
			      
			      Thread.sleep(3000);
			      //se4.selectByValue(3);
			      se10.selectByVisibleText("5");
			      Thread.sleep(3000);	
			      System.out.println("select dropdown priority");
			    //----------------Send keys in NOtepad----------------  
			      Thread.sleep(5000);	
			     // cust.Notepad(driver).sendKeys(Actual);
			      cust.Notepad(driver).sendKeys("Test Automation 20.10.22");
			     
			      
			      System.out.println("Enter the Notepad");
			      Thread.sleep(5000);	
			      //------------------------------------------------
			     cust.Logbutton(driver).click();
			     System.out.println("click on LOG button");
			     
			   
			     Thread.sleep(5000);
			   DashboardPageTest.Validatedashboardsublink();
			   
			  Thread.sleep(2);
			      
			      
			     
			      
			      
				
				
				
		  		
	
	
	
	}
	
}

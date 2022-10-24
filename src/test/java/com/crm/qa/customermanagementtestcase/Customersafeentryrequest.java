package com.crm.qa.customermanagementtestcase;

import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.crm.qa.logintestcase.LoginPageTest;

import Excel.data;
import main.Base;
import main.PropertyManager;
import main.geturl;
import objectRepo.CustomerManagementObjects;
import objectRepo.CustomersafeentryrequestObjects;

public class Customersafeentryrequest extends Base {
	data da = new data();
	CustomersafeentryrequestObjects safe =new CustomersafeentryrequestObjects();
	geturl gu= new geturl();
	String url = gu.getURL();
	String username = PropertyManager.getInstance().getUsername();
	String password = PropertyManager.getInstance().getPassword();
	String Actual = "Test Automation";
	

	
	@Test(enabled = true, priority =1)
		
	public void ValidateCustomersafeentryrequest() throws Exception {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		test = extent.createTest("As a valid user validate safe entry request ");
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		
		 Thread.sleep(5000);
		LoginPageTest.ValidateSIGNIN();
		
	//===================Customer================
	
	
		 Thread.sleep(1000);
			
			  // scroll down by 500 pixels with Javascript Executor JavascriptExecutor j =
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,50)");
			 
		      
		      safe.customermanagementlink(driver).click();
		      Thread.sleep(1000);
		      System.out.println("click on customer management ");
		      
		      safe.customeroptions(driver).click();
		      Thread.sleep(1000);
		      System.out.println("click on customer ");
			  
		//     safe.customernametextfield(driver).sendKeys("leo walker"); 
		 //   safe.customernametextfield(driver).sendKeys("Miss Esna Du Pisani"); 
		    safe.customernametextfield(driver).sendKeys("Mr Robert Smith"); 
		    
			  Thread.sleep(2000);
			  System.out.println("search  ");
			  WebDriverWait wait11= (new WebDriverWait(driver, 5));
			  wait11.until(ExpectedConditions . elementToBeClickable (By.xpath("//a[contains(.,'CUS2210EABC0E2')]")));
			  WebElement custid123 =driver.findElement(By.xpath("//a[contains(.,'CUS2210EABC0E2')]"));
			  Thread.sleep(2000);
			  custid123.click();
			 // safe.custidlink(driver).click();
			  Thread.sleep(5000);	
			  System.out.println("click on Cust ID ");
//=========================------------------------------
			
			  
			  WebDriverWait wait1= (new WebDriverWait(driver, 5));
			  wait.until(ExpectedConditions . elementToBeClickable (By.xpath("(//div[@class='mat-tab-header-pagination-chevron'])[2]")));	
			 safe.paginationicon(driver).click();
			  System.out.println("click on pagination");
			 Thread.sleep(1000);	
			 safe.siteaddressinfo(driver).click();
			 Thread.sleep(1000);
			 System.out.println("click on site address info ");
			 	
			 
			 
			  Select se45 = new Select(safe.selectcontract(driver));
		      Thread.sleep(5000);
		     // se45.selectByVisibleText("CNTR13062207 - K HOUSE");
		  //    se45.selectByVisibleText("CNTR13102202");
		   //   se45.selectByVisibleText("CNTR07102202");
		      se45.selectByVisibleText("CNTR12102210");
		      Thread.sleep(1000);
		      System.out.println("click on select contract from dropdown");
		      //-------------------------------------------------------------------------
//   /*  
		      Thread.sleep(1000);
		      JavascriptExecutor js12 = (JavascriptExecutor) driver;
		    //Find element by link text and store in variable "Element"        		
		        WebElement Element = safe.safeentryrequestlink(driver);

		        //This will scroll the page till the element is found		
		        js12.executeScript("arguments[0].scrollIntoView();", Element);
			    		safe.safeentryrequestlink(driver).click();
			    		Thread.sleep(2000);
			      		safe.closewindow(driver).click();
			      		Thread.sleep(1000);
			      		
			      		safe.Createnew1(driver).click();
			      		System.out.println("click on Create new");
			      		Thread.sleep(3000);
			      		safe.Requestdate(driver).click();
			      		Thread.sleep(3000);
			      	 safe.Today(driver).click();
			      	 Thread.sleep(1000);
			      	 safe.requesttime(driver).click();
			      	 Thread.sleep(3000);
			      	 safe.upbutton(driver).click();
			      	 Thread.sleep(3000);
			      	 safe.requesttime(driver).click();
			    	 Thread.sleep(1000);
			    	 Select se13 = new Select(safe.LeavingOrEnteringPremise(driver));
				      Thread.sleep(1000);
				      se13.selectByVisibleText("Entering");
				      Thread.sleep(1000);
				      Select se8 = new Select(safe.ContactName(driver));
				 //   se8.selectByVisibleText("Dr Leo Walker");
				    // se8.selectByVisibleText("Miss Esna Du Pisani");
				     se8.selectByVisibleText("Mr Robert Smith");
				      Thread.sleep(1000);
				      safe.VehicleRegistration(driver).sendKeys("KA01JC7224");
				      Thread.sleep(1000);
				      safe.VehicleMake(driver).click();
				      Thread.sleep(3000);
				      safe.vehicle(driver).click();
				      Thread.sleep(3000);
				      safe.VehicleModel(driver).click();
				      Thread.sleep(1000);
				      safe.modelno(driver).click();
				      Thread.sleep(1000);
				     safe.VehicleColor(driver).click();
				     Thread.sleep(1000);
				     safe.Color(driver).click();
				     safe.Notepad1(driver).sendKeys("Test Automation");
				     Thread.sleep(1000);
				     System.out.println("click on fill all detail");
	//			     safe.back(driver).click();
				     
				     
			safe.save(driver).click();
				     System.out.println("click on save button");
				     Thread.sleep(5000);		
				     
	//			     */   
	//=================================verificaytion===============================================================
				     
				     WebDriverWait wait2= (new WebDriverWait(driver, 5));
					  wait.until(ExpectedConditions . elementToBeClickable (By.xpath("(//div[@class='mat-tab-header-pagination-chevron'])[2]")));	
					 safe.paginationicon(driver).click();
					  System.out.println("click on paganiation1");
					 Thread.sleep(5000);	
					 safe.siteaddressinfo(driver).click();
					 System.out.println("click on site address info ");
					  Thread.sleep(7000);
					
					// driver.navigate().refresh();
					  
					  
					//This will scroll the page till the element is found
					  Thread.sleep(5000);
				      JavascriptExecutor js13 = (JavascriptExecutor) driver;
				    //Find element by link text and store in variable "Element"        		
				        WebElement Element2= safe.safeentryrequestlink(driver);
				        Thread.sleep(5000);
					 // JavascriptExecutor js13 = (JavascriptExecutor) driver;
				        js13.executeScript("arguments[0].scrollIntoView();", Element2);
					    		safe.safeentryrequestlink(driver).click();
					    		 System.out.println("click on safe entry");
					    		Thread.sleep(2000);
//==============================================================================================================================================================					 
					 WebDriverWait wait3= (new WebDriverWait(driver, 5));
					  wait3.until(ExpectedConditions . elementToBeClickable (By.xpath("//select[contains(@id,'detail')]")));	
					
					  Select se6 = new Select(safe.selectcontract(driver));
				      Thread.sleep(2000);
				      se6.selectByVisibleText("CNTR12102210");
				     // se6.selectByIndex(0);  
				      Thread.sleep(2000);
				      System.out.println("click on select contract from dropdown");
		//-----------------------------------------------------------------------------------	
				      
				      
				      Thread.sleep(5000);
				      JavascriptExecutor js113 = (JavascriptExecutor) driver;
				    //Find element by link text and store in variable "Element"        		
				        WebElement Element1 = safe.safeentryrequestlink(driver);
				        Thread.sleep(5000);
				        //This will scroll the page till the element is found		
				        js113.executeScript("arguments[0].scrollIntoView();", Element1);
					    		safe.safeentryrequestlink(driver).click();
					    		 System.out.println("click on safe entry");
					    		Thread.sleep(2000);
					      		safe.closewindow(driver).click();
					      		Thread.sleep(2000);
		///------------------------------------------------------------
					      		WebElement Element3 = safe.requesteddate1(driver);
					      		JavascriptExecutor js1 = (JavascriptExecutor) driver;
					      		//js.executeScript("window.scrollBy(0,250)", "");
					      		js1.executeScript("arguments[0].scrollIntoView();", Element3);
		//==============================================================================================			      		
					      //		safe.requesteddate1(driver).click();
					      	//	 Thread.sleep(1000);
					      //		 System.out.println("click on requested date optn for validation ");
					  //    		safe.twentydatevalidation(driver).click();
					    //  		 System.out.println("select the paticular day");
					    //  		 Thread.sleep(1000);
									
									  safe.requesteddate1(driver).click();
									  Thread.sleep(1000);
									  System.out.println("click on requested date pick");
									  safe.Pickdatetoday(driver).click();
									  Thread.sleep(1000);
									 
		//-------------------------------validation---------------------------------------------------			      		
					      		 JavascriptExecutor js3 = (JavascriptExecutor) driver;
								    js3.executeScript("window.scrollBy(0,250)", "");
								    
								    Thread.sleep(1000);
								    safe.contactnumbervalidation(driver).click();
								    safe.contactnumbervalidation(driver).sendKeys("835689075");
								  
								    System.out.println("validate contract person ");
								    Thread.sleep(5000);

								    
								    
								  
					
								    WebElement numbervalidation=driver.findElement(By.xpath("//td[contains(.,'+27 835689075')]"));
								    
								    JavascriptExecutor js2 = (JavascriptExecutor) driver;
									//    js2.executeScript("window.scrollBy(0,500)", "");
									    js.executeScript("arguments[0].scrollIntoView();", numbervalidation);
									    
								    // validation the actual and expected text
								    String expectedText = "+27 835689075";
								    String actualText = numbervalidation.getText();
								    if(actualText.equals(expectedText))
								    		{
								    	System.out.println("The actual and expected result is same, the title value is"+actualText);
								    		}
								    else {
								    	System.out.println("The actual and expected result is not same, the display text is"+actualText);
								    		}
						
					      		
					      
				     
		      
	}
}	


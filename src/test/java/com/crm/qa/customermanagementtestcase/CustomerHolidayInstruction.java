package com.crm.qa.customermanagementtestcase;

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
import objectRepo.CustomerHolidayInstructionObjects;

public class CustomerHolidayInstruction extends Base {
	data da = new data();
	CustomerHolidayInstructionObjects holi=new CustomerHolidayInstructionObjects();
	geturl gu= new geturl();
	String url = gu.getURL();
	String username = PropertyManager.getInstance().getUsername();
	String password = PropertyManager.getInstance().getPassword();
	String Actual = "Test Automation";
	

	
	@Test(enabled = true, priority =1)
		
	public void ValidateCustomerHolidayinstruction() throws Exception {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		test = extent.createTest("As a valid user Validate CustomerHoliday instruction ");
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		
		 Thread.sleep(5000);
		LoginPageTest.ValidateSIGNIN();
		
	//===================Customer================
	
	
		 Thread.sleep(5000);
		// scroll down by 500 pixels with Javascript Executor JavascriptExecutor j =
				 JavascriptExecutor js = (JavascriptExecutor) driver;
				  js.executeScript("window.scrollBy(0,50)");
				
				  Thread.sleep(2000);
		   
		      holi.customermanagementlink1(driver).click();
		    //  holi.customermanagementlink(driver).click();
		      Thread.sleep(2000);
		      
		      System.out.println("click on customer management ");
		      
		      holi.customeroptions(driver).click();
		      Thread.sleep(2000);
		      System.out.println("click on customer ");
			  
		      //holi.customernametextfield(driver).sendKeys("leo walker"); 
		       holi.customernametextfield(driver).sendKeys("Mr Derek Shephard"); 
		       Thread.sleep(5000);
			  System.out.println("search Mr Derek Shephard");
//--------------------------cust id------------------------
			  WebDriverWait wait4 = new WebDriverWait(driver, 10);
			  wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(.,'CUS2210ED40611')]")));
				WebElement custid123=driver.findElement(By.xpath("//a[contains(.,'CUS2210ED40611')]"));
				custid123.click();
		//	  holi.custidlink(driver).click();
			  Thread.sleep(2000);
			  System.out.println("click on Cust ID ");
//=============================================================================================================================
//			  /*		  
			  Thread.sleep(1000);
			  WebDriverWait wait111= (new WebDriverWait(driver, 5));
			  wait111.until(ExpectedConditions . elementToBeClickable (By.xpath("(//div[@class='mat-tab-header-pagination-chevron'])[2]")));	
			 holi.paginationicon(driver).click();
			  System.out.println("click on paganiation1");
			  Thread.sleep(1000);	
			 holi.siteaddressinfo(driver).click();
			 System.out.println("click on site address info ");
			 	  
			  Select se45 = new Select(holi.selectcontract(driver));
			  Thread.sleep(1000);
		     // se45.selectByVisibleText("CNTR13062207 - K HOUSE");
		      se45.selectByVisibleText("CNTR13102205");
		      Thread.sleep(1000);
		      System.out.println("click on select contract from dropdown");
		      Thread.sleep(1000);
//==================================================================================================================================
		      Thread.sleep(2000);
		      WebDriverWait wait2 = new WebDriverWait(driver, 10);
		      wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='quick-action-menu mb-1 ng-star-inserted'][contains(.,'Holiday Instruction')]")));		
		      Thread.sleep(2000);
		        holi.Holidayinst(driver).click();
		        Thread.sleep(2000);
			    holi.closewindow(driver).click();
			    Thread.sleep(1000);
 //===========================Creation =======================================================================================================			    
			    holi.Createnew1(driver).click();
			    Thread.sleep(2000);
			    System.out.println("click on crate icon");
			    holi.StartDate(driver).click();
			    
			    holi.Today_holidays(driver).click();
			    Thread.sleep(2000);
			    System.out.println("click on start date today ");
			    holi.ToDate(driver).click();
			    Thread.sleep(1000);
			    System.out.println("click on start date today ");
			    
			    holi.ToDate_today(driver).click();
			    Thread.sleep(1000);
			    System.out.println("click on start date today ");
			    
			    holi.HolidayTemporaryInstructions(driver).sendKeys("Holiday comments test");
			    Thread.sleep(1000);
			    System.out.println("click on HolidayTemporaryInstructions ");
			    
			    holi.ContactName(driver).sendKeys("Mahesh");
			    Thread.sleep(1000);
			    System.out.println("click on ContactName ");
			    
			    holi.ContactNumber(driver).sendKeys("9900979407");
			    Thread.sleep(1000);
			    System.out.println("click on ContactNumber ");
			    holi.EmergencyContactName(driver).sendKeys("david");
			    Thread.sleep(1000);
			    System.out.println("click on EmergencyContactName ");
			    
			    holi.EmergencyContactNumber(driver).sendKeys("845416516");
			    Thread.sleep(1000);
			    System.out.println("click on EmergencyContactNumbe ");
			    
			    
			    JavascriptExecutor js1 = (JavascriptExecutor) driver;
			    js1.executeScript("window.scrollBy(0,250)", "");
			    
		    holi.save_holi(driver).click();
	  //  holi.Backbutton(driver).click();
			    Thread.sleep(1000);
			    System.out.println("click on save ");
//		*/	    
	//=================================================================================================================
			    Thread.sleep(5000);
				  WebDriverWait wait11= (new WebDriverWait(driver, 5));
				  wait11.until(ExpectedConditions . elementToBeClickable (By.xpath("(//div[@class='mat-tab-header-pagination-chevron'])[2]")));	
				 holi.paginationicon(driver).click();
				  System.out.println("click on paganiation1");
				  Thread.sleep(1000);	
				 holi.siteaddressinfo(driver).click();
				 System.out.println("click on site address info ");
				 	  
				  Select se5 = new Select(holi.selectcontract(driver));
				  Thread.sleep(1000);
			     // se45.selectByVisibleText("CNTR13062207 - K HOUSE");
			      se5.selectByVisibleText("CNTR13102205");
			      Thread.sleep(1000);
			      System.out.println("click on select contract from dropdown");
			      Thread.sleep(1000);
	//==================================================================================================================================
			      Thread.sleep(2000);
			      WebDriverWait wait3 = new WebDriverWait(driver, 10);
			    wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(.,'Holiday Instruction')]")));		
			      Thread.sleep(5000);
			        holi.Holidayinst(driver).click();
			        System.out.println("click on Holiday inst ");
			        Thread.sleep(2000);
			    holi.closewindow(driver).click();
			    System.out.println("click on close ");
				    Thread.sleep(1000); 
			    
				    
				    
				    JavascriptExecutor js3 = (JavascriptExecutor) driver;
				    js3.executeScript("window.scrollBy(0,250)", "");
				    
				    
				    holi.contactPersionfield(driver).click();
				    holi.contactPersionfield(driver).sendKeys("9900979407");
				    System.out.println("Enter co0ntract person ");
				    Thread.sleep(5000);
//				    holi.Holidayfromdate(driver).click();
		 //   holi.dateselect(driver).click();
				    Thread.sleep(5000);
				    
				  
	
				    WebElement numbervalidation=driver.findElement(By.xpath("//td[contains(.,'+27 9900979407')]"));
				    
				    JavascriptExecutor js2 = (JavascriptExecutor) driver;
					//    js2.executeScript("window.scrollBy(0,500)", "");
					    js.executeScript("arguments[0].scrollIntoView();", numbervalidation);
					    
				    // validation the actual and expected text
				    String expectedText = "+27 9900979407";
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



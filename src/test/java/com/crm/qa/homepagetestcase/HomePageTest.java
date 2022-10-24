package com.crm.qa.homepagetestcase;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Excel.data;
import main.Base;
import main.PropertyManager;
import main.geturl;
import objectRepo.HomePageObjects;

public class HomePageTest extends Base {
	data da = new data();
	HomePageObjects ho=new HomePageObjects();
	geturl gu= new geturl();
	String url = gu.getURL();
	String username = PropertyManager.getInstance().getUsername();
	String password = PropertyManager.getInstance().getPassword();

	
	@Test(enabled = true, priority =2)
		
	public void welcometohomwpage() throws Exception {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		test = extent.createTest("As a Vistor login homepage ");
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
	//ho.User name filed(driver).click();
	wait.until(ExpectedConditions.visibilityOf(ho.Usernamefield(driver)));
	ho.Usernamefield(driver).sendKeys(username);
	Thread.sleep(5);
	
	//ho.password field name filed(driver).click();
	wait.until(ExpectedConditions.visibilityOf(ho.passwordfield(driver)));
	ho.passwordfield(driver).sendKeys(password);
	Thread.sleep(5);
	
	
	//ho.SignIN button (driver).click();
	wait.until(ExpectedConditions.visibilityOf(ho.SignInbutton(driver)));
	Thread.sleep(3);
	ho.SignInbutton(driver).click();
	Thread.sleep(5);
	
	
	//ho.Salesbutton  (driver).click();
		Thread.sleep(3);
		// scroll down by 500 pixels with Javascript Executor
	      JavascriptExecutor j = (JavascriptExecutor) driver;
	      j.executeScript("window.scrollBy(0,50)");
	      
		ho.Saleslink(driver).click();
		Thread.sleep(5);
		
		//ho.raw lead button (driver).click();
		//wait.until(ExpectedConditions.visibilityOf(ho.SignInbutton(driver)));
		//ho.SignInbutton(driver).sendKeys(password);
		Thread.sleep(2000);
		
		// scroll down by 500 pixels with Javascript Executor
	      JavascriptExecutor j1 = (JavascriptExecutor) driver;
	      j1.executeScript("window.scrollBy(0,500)");
		
		ho.rawleadbutton(driver).click();
		Thread.sleep(5);
	
		//ho.CreateNew (driver).click();
		Thread.sleep(3);
		ho.CreateNew(driver).click();
		Thread.sleep(2000);
		
		//ho.Namefield (driver).sendKeys();
		Thread.sleep(3);
		String NA = da.ReadString(1, 5);
		ho.Namefield(driver).sendKeys(NA);
		Thread.sleep(2000);	
		
		
		//ho.Surname field (driver).sendKeys();
				Thread.sleep(3);
				String NA1 = da.ReadString(1, 6);
				ho.Surnamefield(driver).sendKeys(NA1);
				Thread.sleep(2000);
				
				
				//ho.Phone Number field (driver)..sendKeys();
				Thread.sleep(3);
				String NA2 = da.ReadInteger(1, 7);
				ho.PhoneNumberfield(driver).sendKeys(NA2);
				Thread.sleep(5);
				
				
				//ho.MobileNumber  field (driver).sendKeys();
				Thread.sleep(3);
				String NA3 = da.ReadInteger(1, 8);
				ho.MobileNumberfield(driver).sendKeys(NA3);
				Thread.sleep(5);
				
				//ho.Premises Number field  field (driver)..sendKeys();
				Thread.sleep(3);
				String NA4 = da.ReadInteger(1, 9);
				ho.PremisesNumberfield(driver).sendKeys(NA4);
				Thread.sleep(5);
				
				//ho.Office Number field  field (driver)..sendKeys();
				Thread.sleep(3);
				String NA5 = da.ReadInteger(1, 10);
				ho.OfficeNumberfield(driver).sendKeys(NA5);
				Thread.sleep(5);
	
				//ho.Email Address  field (driver).sendKeys();
				Thread.sleep(3);
				String NA6 = da.ReadString(1, 11);
				ho.EmailAddressfield(driver).sendKeys(NA6);
				Thread.sleep(5);
							
				//ho.Sitee type  field (driver).sendKeys();
				Thread.sleep(5);
				ho.SiteTypefield11(driver).selectByIndex(5);
				Thread.sleep(2000);
				
				//ho.Source type  field (driver).sendKeys();
				Thread.sleep(5);
				ho.SourceTypefield(driver).selectByIndex(2);
		
		
				
				// scroll down by 500 pixels with Javascript Executor
				Thread.sleep(5000);
				//wait.until(ExpectedConditions.visibilityOf(ho.CreateButtoninRawleadinfo(driver)));
			  //    JavascriptExecutor j4 = (JavascriptExecutor) driver;
			   //   j4.executeScript("window.scrollBy(0,500)");
			     ho.CreateButtoninRawleadinfo(driver).click();
					Thread.sleep(5);
					System.out.println("clicked on Create btn");
					Thread.sleep(2000);
			
}
	
	@Test(enabled = true, priority =2)
	

	public void Rawleaddetails() throws Exception {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		test = extent.createTest("See all read raw details ");
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		
	
		
	
		

		
				
				//ho.MobileNumber  field (driver).click();
				Thread.sleep(3);
				String NA3 = da.ReadInteger(1, 6);
				ho.MobileNumberfield(driver).sendKeys(NA3);
				Thread.sleep(5);
		
				//ho.Premises Number field  field (driver).click();
				Thread.sleep(3);
				String NA4 = da.ReadInteger(1, 6);
				ho.PremisesNumberfield(driver).sendKeys(NA4);
				Thread.sleep(5);
	
	
		
	}
}
	
			
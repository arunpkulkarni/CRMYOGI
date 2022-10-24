package com.crm.qa.logintestcase;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
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
import objectRepo.LoginPageObjects;

public class LoginPageTest extends Base {
	data da = new data();
	static HomePageObjects ho=new HomePageObjects();
	static LoginPageObjects lo = new LoginPageObjects();
	
	geturl gu= new geturl();
	String url = gu.getURL();
	static String username = PropertyManager.getInstance().getUsername();
	static String password = PropertyManager.getInstance().getPassword();

	
	@Test(enabled = true, priority =1)
		
	public static   void ValidateSIGNIN() throws Exception {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		test = extent.createTest("As a Vistor login in Fidelity account and Sales link  ");
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
			//-------------External User ----------------------
			
			lo.ExternalUserbtn(driver).click();
			Thread.sleep(5); 
			System.out.println("click on external  ");
			//-----username---------------
			  wait.until(ExpectedConditions.visibilityOf(lo.Usernamefield(driver)));
			 lo.Usernamefield(driver).sendKeys(username); 
			 Thread.sleep(5);
			
			//password field name filed(driver).click();
			wait.until(ExpectedConditions.visibilityOf(ho.passwordfield(driver)));
			lo.passwordfield(driver).sendKeys(password);
			Thread.sleep(5);
			
			
			//ho.SignIN button (driver).click();
			wait.until(ExpectedConditions.visibilityOf(ho.SignInbutton(driver)));
			Thread.sleep(3);
			lo.SignInbutton(driver).click();
			Thread.sleep(5);
	
	return;

			
}
}			
	
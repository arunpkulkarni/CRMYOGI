package com.crm.qa.saleslinkstestcase;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.crm.qa.logintestcase.LoginPageTest;

import Excel.Pomreadtest;
import Excel.data;
import main.Base;
import main.PropertyManager;
import main.geturl;
import objectRepo.HomePageObjects;
import objectRepo.SalesPageObjects;



		public class BulkrawleadTest extends Base {
			
			data da = new data();
			SalesPageObjects raw=new SalesPageObjects();
			//SalesPageObjects sa=new SalesPageObjects();
			geturl gu= new geturl();
			String url = gu.getURL();
			String username = PropertyManager.getInstance().getUsername();
			String password = PropertyManager.getInstance().getPassword();
			data da11 = new data();
			
		
	
			@Test(enabled = true, priority =1)
				
			public void bulkrawleadcreation() throws Exception {
//			
					driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
					test = extent.createTest("As a Vistor login in Fidelity account and Sales link  ");
					WebDriverWait wait = new WebDriverWait(driver, 60);
					
					LoginPageTest.ValidateSIGNIN();
				
					/*
					 * //ho.User name filed(driver).click();
					 * wait.until(ExpectedConditions.visibilityOf(raw.Usernamefield(driver)));
					 * raw.Usernamefield(driver).sendKeys(username); Thread.sleep(5);
					 * 
					 * //ho.password field name filed(driver).click();
					 * wait.until(ExpectedConditions.visibilityOf(raw.passwordfield(driver)));
					 * raw.passwordfield(driver).sendKeys(password); Thread.sleep(5);
					 * 
					 * 
					 * //ho.SignIN button (driver).click();
					 * wait.until(ExpectedConditions.visibilityOf(raw.SignInbutton(driver)));
					 * Thread.sleep(3); raw.SignInbutton(driver).click(); Thread.sleep(5);
					 */
			
						
				
				//Mazimize current window
				driver.manage().window().maximize();

				//Delay execution for 5 seconds to view the maximize operation
				Thread.sleep(5000);
				
				//Salesbutton  (driver).click();
				Thread.sleep(3);
				// scroll down by 500 pixels with Javascript Executor
			      JavascriptExecutor j = (JavascriptExecutor) driver;
			      j.executeScript("window.scrollBy(0,250)");
			      Thread.sleep(5000);
				
			      raw.Saleslink(driver).click();
			      Thread.sleep(5000);
			      System.out.println("click on sales ");
		
			      // scroll down by 500 pixels with Javascript Executor
			      JavascriptExecutor j1 = (JavascriptExecutor) driver;
			      j1.executeScript("window.scrollBy(0,500)");
			
		  		raw.rawleadbutton(driver).click();
		  		Thread.sleep(5000);
		  		System.out.println("click on raw lead");
		  		
//		  		
//		  		raw.CreateNew(driver).click();
//		  		Thread.sleep(5000);
//		  		System.out.println("click on Create new icon ");
//		  		
		  		
					 
				
			//-----------------------------------------------------------------------------------------------------------------------------	        
				        //Create an object of File class to open xlsx file
				        File file =    new File("D:\\eclipse-workspace new\\ApachePOI\\Bulkrawleadtestdata1.xlsx");

				        //Create an object of FileInputStream class to read excel file
				        FileInputStream inputStream = new FileInputStream(file);

				        //creating workbook instance that refers to .xls file
				        XSSFWorkbook wb=new XSSFWorkbook(inputStream);

				        //creating a Sheet object
				        XSSFSheet sheet=wb.getSheet("sheet");
				        
				        //get all rows in the sheet
				        int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();

				        //iterate over all the row to print the data present in each cell.
				        Cell cell = null;
				        
				//-----------------------LOOP--------------------------------        
				        for(int i=1;i<=rowCount;i++){
				        	
			        	//Thread.sleep(5000);
				        	raw.Createiconbutton(driver).click();
							 Thread.sleep(2000);
				        	System.out.println("click on Create new icon nside loop ");
							 
		//===============================================================================================================
				        //	Thread.sleep(5000);
				   
				      // Create the object of the Select class
				        	//Select se = new Select(driver.findElement(By.xpath("//select[contains(@name,'Title')]")));
//				        	Select se = new Select(raw.Titlefield(driver));
//				        	
//				        	// Select the option using the visible text
//				        	se.selectByVisibleText("Mr");
//				        	//se.selectByIndex(4);
				        //	Select se = new Select(driver.findElement(By.xpath("//select[contains(@name,'Title')]")));
				        	Select se = new Select(raw.Titlefield(driver));
				        	//Select se1 = new Select(raw.Titlefield(driver));
				        	// Select the option using the visible text
				        	
				        	se.selectByVisibleText("Mr");
				        	//se.selectByIndex(4);
				  
						
						  raw.Namefield(driver).sendKeys(sheet.getRow(i).getCell(0).getStringCellValue()); 
						  Thread.sleep(2000);
						  raw.Surnamefield(driver).sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
						  
						  Thread.sleep(2000);
						  raw.PhoneNumberfield(driver).sendKeys(sheet.getRow(i).getCell(2).getStringCellValue()); 
						  raw.MobileNumberfield(driver).sendKeys(sheet.getRow(i).getCell(3).getStringCellValue()); 
						  
						  Thread.sleep(2000);
						  raw.PremisesNumberfield(driver).sendKeys(sheet.getRow(i).getCell(4).getStringCellValue());
						   Thread.sleep(2000);
						  
						  raw.OfficeNumberfield(driver).sendKeys(sheet.getRow(i).getCell(5).getStringCellValue());
						  Thread.sleep(2000);
						  
						  raw.EmailAddressfield(driver).sendKeys(sheet.getRow(i).getCell(6).getStringCellValue());
						  Thread.sleep(2000);
						  
						 
						  raw.SiteTypefield01(driver).sendKeys(sheet.getRow(i).getCell(7).getStringCellValue());
						  Thread.sleep(2000);
						  
						 
						  raw.SourceTypefield01(driver).sendKeys(sheet.getRow(i).getCell(9).getStringCellValue());
						  Thread.sleep(2000);
						  
						  
						  raw.FindAddressfield(driver).sendKeys(sheet.getRow(i).getCell(10).getStringCellValue());
						   Thread.sleep(2000); 
						   
						   raw.searchbutton1(driver).click();
						   Thread.sleep(2000);
						   
//						  raw.Searchbutton(driver).click();
//						  Thread.sleep(2000);
						  
						  raw.UnitBuildingNumberfield(driver).sendKeys(sheet.getRow(i).getCell(11).getStringCellValue()); 
						  Thread.sleep(2000);
						  
						  raw.CreateButtoninRawleadinfo(driver).click(); 
						  Thread.sleep(2000);
						  ////-------------------------------------------------------------------------
						 raw.Backbutton1(driver).click();
						 Thread.sleep(5000);
					//	  raw.Backbutton1(driver).click();
						  
						
						  
				        
		
		}
				        
			}
		}
			
			
	
	
		
		
		
				        	
				  
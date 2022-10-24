package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CustomerHolidayInstructionObjects {
	
	
	public WebElement Usernamefield(WebDriver driver ) {
		  
		WebElement ele=driver.findElement(By.xpath("//input[@formcontrolname='username']"));
		return ele;
	  }
	  
	  
	  public WebElement passwordfield(WebDriver driver ) {
		  
			WebElement ele=driver.findElement(By.xpath("//input[@placeholder='Enter Password']"));
			return ele;
		  }
	  
	  public WebElement SignInbutton(WebDriver driver ) {
		  
			WebElement ele=driver.findElement(By.xpath("//button[@type='submit']"));
			return ele;
	  }

  public WebElement customermanagementlink1(WebDriver driver ) {
	  
		WebElement ele=driver.findElement(By.xpath("(//span[contains(@class,'nav-label')])[156]"));
		return ele;
	  }
	  
	  
	  public WebElement customeroptions(WebDriver driver ) {
		  
			WebElement ele=driver.findElement(By.xpath("(//span[contains(.,'Customers')])[1]"));
			return ele;
		  }
	  
	  
	  public WebElement customernametextfield(WebDriver driver ) {
		  
			WebElement ele=driver.findElement(By.xpath("(//input[contains(@type,'text')])[2]"));
			return ele;
		  }
	  
	  public WebElement scrollright(WebDriver driver ) {
		  
			WebElement ele=driver.findElement(By.xpath("//label[contains(.,'Select Status')]"));
			return ele;
		  }
	  
	  public WebElement statusselect(WebDriver driver ) {
		  
			WebElement ele=driver.findElement(By.xpath("//label[contains(.,'Select Status')]"));
			return ele;
		  }
	  
	  
			  
			  public WebElement activeoption(WebDriver driver ) {
				  
					WebElement ele=driver.findElement(By.xpath("(//span[contains(.,'Active')])[11]"));
					return ele;
				  }
			  
			  public WebElement custidlink(WebDriver driver ) {
				  
					//WebElement ele=driver.findElement(By.xpath("//a[contains(.,'CUS221078A975A')]"));
					//WebElement ele=driver.findElement(By.xpath("//a[contains(.,'CUS220663D3F9A5')]"));
					WebElement ele=driver.findElement(By.xpath("//a[contains(.,'CUS22101EED394')]"));
					
					return ele;
				  }
			  
			  public WebElement siteaddressinfo(WebDriver driver ) {
					WebElement ele=driver.findElement(By.xpath("//div[@class='mat-tab-label-content'][contains(.,'SITE ADDRESS INFO')]"));	
					return ele;
				  }
			  
			  
			  public WebElement paginationicon(WebDriver driver ) {
				WebElement ele=driver.findElement(By.xpath("(//div[contains(@class,'mat-tab-header-pagination-chevron')])[2]"));	
				//  WebElement ele=driver.findElement(By.xpath("(//div[@aria-hidden='true'])[2]"));	
					return ele;
				  }
			  
	  public WebElement selectcontract(WebDriver driver ) {
		  
			WebElement ele=driver.findElement(By.xpath("//select[@id='occurrence_detail']"));
			return ele;
		  }
	  
			
			  public WebElement safeentryrequestlink(WebDriver driver ) {
			  
			  WebElement
			  ele=driver.findElement(By.xpath("//a[contains(.,'Safe Entry Request')]"));
			  return ele; }
			  
			  public WebElement Holidayinst(WebDriver driver ) 
			  {
				  
				  WebElement
			// ele=driver.findElement(By.xpath("//a[normalize-space()='Holiday Instruction']"));
			ele=driver.findElement(By.xpath("//a[contains(.,'Holiday Instruction')]"));
				
				//a[normalize-space()='Holiday Instruction']
				//a[normalize-space()='Holiday Instruction']
				  return ele;
			}
			
	 
			  
			  public WebElement righticon(WebDriver driver ) {				  
					WebElement ele=driver.findElement(By.xpath("//button[contains(.,'|||')]"));
				   return ele; 
				   }  
			  
			  
			 public WebElement closewindow(WebDriver driver ) {				  
			WebElement ele=driver.findElement(By.xpath("  (//span[@class='icon icon-close-icon'])[2]"));
		   return ele; 
		   }  
			 public WebElement Createnew1(WebDriver driver ) {
				  
					WebElement ele=driver.findElement(By.xpath("//i[@mattooltip='Create New']"));
					return ele;
			 }
	  
			 public WebElement StartDate(WebDriver driver ) {
				  
					WebElement ele=driver.findElement(By.xpath("(//span[@class='ui-button-icon-left ui-clickable pi pi-calendar'])[1]"));
					return ele;
					
			 }
			 
			 public WebElement Today_holidays(WebDriver driver ) {
				  
					WebElement ele=driver.findElement(By.xpath("//span[contains(.,'Today')]"));
					return ele;
					
			 }
			 
			 public WebElement ToDate(WebDriver driver ) {
				  
					WebElement ele=driver.findElement(By.xpath("(//span[contains(@class,'ui-button-icon-left ui-clickable pi pi-calendar')])[2]"));
					return ele;
			}
			 
			 public WebElement ToDate_today(WebDriver driver ) {
				  
					WebElement ele=driver.findElement(By.xpath("//span[@class='ui-button-text ui-clickable'][contains(.,'Today')]"));
					return ele;
			}
			 public WebElement HolidayTemporaryInstructions(WebDriver driver ) {
				  
					WebElement ele=driver.findElement(By.xpath("//textarea[contains(@name,'Comment')]"));
					return ele;
			}
			 
			 public WebElement ContactName(WebDriver driver ) {
				  
					WebElement ele=driver.findElement(By.xpath("//input[@formcontrolname='contactPersonName']"));
					return ele;
			}
		
			 public WebElement ContactNumber(WebDriver driver ) {
				  
					WebElement ele=driver.findElement(By.xpath("//input[@name='Contact Number']"));
					return ele;
			}
			
			public WebElement EmergencyContactName(WebDriver driver ) {
				  
				WebElement ele=driver.findElement(By.xpath("//input[@formcontrolname='emergencyContactPersonName']"));
				return ele;
		}
			public WebElement EmergencyContactNumber(WebDriver driver ) {
				  
				WebElement ele=driver.findElement(By.xpath("//input[@placeholder='Emergency Contact Number']"));
				return ele;
		}
			public WebElement save_holi(WebDriver driver ) {
				  
				WebElement ele=driver.findElement(By.xpath("//button[contains(.,'Save')]"));
				return ele;
		}
			
			public WebElement Holidayfromdate(WebDriver driver ) {
				  
				WebElement ele=driver.findElement(By.xpath("(//input[contains(@autocomplete,'off')])[2]"));
				return ele;
			}
			
			public WebElement dateselect(WebDriver driver ) {
				  
				WebElement ele=driver.findElement(By.xpath("(//span[@class='ui-button-text ui-clickable'])[1]"));
				return ele;
			}
			
			public WebElement contactPersionfield(WebDriver driver ) {
				  
				WebElement ele=driver.findElement(By.xpath("(//input[contains(@type,'text')])[5]"));
				return ele;
			}

			public WebElement Backbutton(WebDriver driver ) {
				  
				WebElement ele=driver.findElement(By.xpath("//button[contains(.,'Back')]"));
				return ele;
			}
			
}




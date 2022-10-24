package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CustomersafeentryrequestObjects {
	
	
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

  public WebElement customermanagementlink(WebDriver driver ) {
	  
		WebElement ele=driver.findElement(By.xpath("(//span[contains(.,'Customer Management')])[2]"));
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
				  //-------Leo walker-------
			//	WebElement ele=driver.findElement(By.xpath("//a[contains(.,'CUS220663D3F9A5')]"));
			//-----	esssa
				WebElement ele=driver.findElement(By.xpath("//a[contains(.,'CUS2210219A111')]"));
					
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
		  
		//	WebElement ele=driver.findElement(By.xpath("//select[contains(@class,'form-control fidelity-form-input ng-pristine ng-valid ng-touched')]"));
			WebElement ele=driver.findElement(By.xpath("//select[contains(@id,'detail')]"));
			return ele;
		  }
	  
			
			  public WebElement safeentryrequestlink(WebDriver driver ) {
			  
			  WebElement
			  ele=driver.findElement(By.xpath("//a[contains(.,'Safe Entry Request')]"));
			  return ele; }
			
	 
			 public WebElement closewindow(WebDriver driver ) {				  
			WebElement ele=driver.findElement(By.xpath("  (//span[@class='icon icon-close-icon'])[2]"));
		   return ele; 
		   }  
			 public WebElement Createnew1(WebDriver driver ) {
				  
					WebElement ele=driver.findElement(By.xpath("//i[@mattooltip='Create New']"));
					return ele;
			 }
	  
			 public WebElement Requestdate(WebDriver driver ) {
				  
					WebElement ele=driver.findElement(By.xpath("(//span[@aria-hidden='true'])[1]"));
					return ele;
					
			 }
			 
			 public WebElement Today(WebDriver driver ) {
				  
					WebElement ele=driver.findElement(By.xpath("//span[contains(.,'Today')]"));
					return ele;
			}
			 
			 public WebElement upbutton(WebDriver driver ) {
				  
					WebElement ele=driver.findElement(By.xpath("(//span[contains(@class,'pi pi-chevron-up')])[3]"));
					return ele;
			}
			 public WebElement requesttime(WebDriver driver ) {
				  
					WebElement ele=driver.findElement(By.xpath("(//span[@class='ui-button-icon-left ui-clickable pi pi-calendar'])[2]"));
					return ele;
			}
			 
			 public WebElement LeavingOrEnteringPremise(WebDriver driver ) {
				  
					WebElement ele=driver.findElement(By.xpath("//select[@placeholder='Leaving Or Entering Premises']"));
					return ele;
			 }
			 public WebElement ContactName(WebDriver driver ) {
				  
					WebElement ele=driver.findElement(By.xpath("//select[@formcontrolname='customerNumber']"));
					return ele;
			 }
	  
			 public WebElement VehicleRegistration(WebDriver driver ) {
				  
					WebElement ele=driver.findElement(By.xpath("//input[@placeholder='Enter Registration']"));
					return ele;
			 }
			 
			
			 
			 
			 public WebElement VehicleMake(WebDriver driver ) {
				  
					WebElement ele=driver.findElement(By.xpath("(//span[@class='ui-dropdown-trigger-icon ui-clickable pi pi-chevron-down'])[1]"));
					return ele;
			 }
			 
			 public WebElement VehicleMaketextbox(WebDriver driver ) {
				  
					WebElement ele=driver.findElement(By.xpath("(//input[contains(@type,'text')])[10]"));
					return ele;
			 }
			 
			 public WebElement search(WebDriver driver ) {
				  
					WebElement ele=driver.findElement(By.xpath("//span[@class='ui-dropdown-filter-icon pi pi-search']"));
					return ele;
			 }
			 
			 public WebElement VehicleModel(WebDriver driver ) {
				  
					WebElement ele=driver.findElement(By.xpath("(//span[contains(@class,'ui-dropdown-trigger-icon ui-clickable pi pi-chevron-down')])[2]"));
					return ele;
			 }
			 
			 
			 public WebElement modelno(WebDriver driver ) {
				  
					WebElement ele=driver.findElement(By.xpath("//li[@aria-label='1500']"));
					return ele;
			 }
			 
			 public WebElement vehicle(WebDriver driver ) {
				  
					WebElement ele=driver.findElement(By.xpath("(//span[contains(.,'BMW')])[1]"));
					return ele;
			 }
			 public WebElement VehicleColor(WebDriver driver ) {
				  
					//WebElement ele=driver.findElement(By.xpath("(//span[contains(@class,'ui-dropdown-trigger-icon ui-clickable pi pi-chevron-down')])[3]"));
					WebElement ele=driver.findElement(By.xpath("(//span[@class='ui-dropdown-trigger-icon ui-clickable pi pi-chevron-down'])[3]"));
					return ele;
					
			 }
			 
			 public WebElement Color(WebDriver driver ) {
				  
					WebElement ele=driver.findElement(By.xpath("(//span[contains(.,'Black')])[1]"));
					return ele;
			 }
			 
			 public WebElement Notepad1(WebDriver driver ) {
				  
					WebElement ele=driver.findElement(By.xpath("//textarea[contains(@placeholder,'Notes...')]"));
					return ele;
			 }
			 public WebElement save(WebDriver driver ) {
				  
					WebElement ele=driver.findElement(By.xpath("//button[contains(.,'Save')]"));
					return ele;
			 }
			 public WebElement back(WebDriver driver ) {
				  
					WebElement ele=driver.findElement(By.xpath("//button[contains(.,'Back')]"));
					return ele;
			 }
			 
			 public WebElement requesteddate1(WebDriver driver ) {
				  
					WebElement ele=driver.findElement(By.xpath("(//input[contains(@type,'text')])[2]"));
					return ele;
			 }
			 
			 public WebElement Pickdatetoday(WebDriver driver ) {
				  
					WebElement ele=driver.findElement(By.xpath("//span[contains(.,'Today')]"));
					return ele;
			 }
			
					 public WebElement contactnumbervalidation(WebDriver driver ) {
						  
							WebElement ele=driver.findElement(By.xpath("(//input[contains(@type,'text')])[5]"));
							return ele;
					 }
					 public WebElement twentydatevalidation(WebDriver driver ) {
						  
							WebElement ele=driver.findElement(By.xpath("(//a[@class='ui-state-default ng-tns-c11-61 ng-star-inserted'])[20]"));
							return ele;
					 }
			 
}




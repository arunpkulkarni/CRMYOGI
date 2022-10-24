package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CustomerManagementObjects {
	
	
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
				  
				  public WebElement custid(WebDriver driver ) {
					  
				WebElement ele=driver.findElement(By.xpath("//a[contains(.,'CUS221083A8CD2')]"));
					//	WebElement ele=driver.findElement(By.xpath("//a[contains(.,'CUS22108B0BD10')]"));
					//	WebElement ele=driver.findElement(By.xpath("//a[contains(.,'CAF22072E7A56BD')]"));
						
						//a[normalize-space()='CUS22101EED394']					
						return ele;
					  }
				  
				  
				  
		  public WebElement quicklink(WebDriver driver ) {
			  
				WebElement ele=driver.findElement(By.xpath("//i[contains(@class,'icon icon-tile')]"));
				return ele;
			  }
		  
		  public WebElement Prioritydropdown(WebDriver driver ) {
			  
				WebElement ele=driver.findElement(By.xpath("//select[@name='Priority']"));
				return ele;
			  }
		  public WebElement AlarmTypedropdown1(WebDriver driver ) {
			  
				WebElement ele=driver.findElement(By.xpath("//select[@name='Alarm Type']"));
				return ele;
			  }
		  
		  public WebElement createphoneIn(WebDriver driver ) {
			  
				WebElement ele=driver.findElement(By.xpath("//a[contains(.,'Create Phone In')]"));
				
				return ele;
			  }
		  
		  public WebElement alarmtype(WebDriver driver ) {
			  
				WebElement ele=driver.findElement(By.xpath("//select[@name='Alarm Type']"));
				return ele;
			  }
		  
		  public WebElement Notepad(WebDriver driver ) {
			  
				WebElement ele=driver.findElement(By.xpath("//textarea[@type='text']"));
				return ele;
			  }
		  
		
		  public WebElement Logbutton(WebDriver driver ) {
			  
				WebElement ele=driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
				return ele;
			  }
		  
		  
		  
		  
}

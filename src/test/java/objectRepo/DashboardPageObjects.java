package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DashboardPageObjects {
	
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
		  
	  public WebElement Saleslink(WebDriver driver ) {
		  
			WebElement ele=driver.findElement(By.xpath("(//span[contains(.,'Sales')])[7]"));
			return ele;
		  }
	  
	  public WebElement dashboardmain(WebDriver driver ) {
		  
			WebElement ele=driver.findElement(By.xpath("(//span[@class='nav-label'][contains(.,'Dashboard')])[6]"));
			return ele;
	  }
	  public WebElement dashboardoption(WebDriver driver ) {
		  
			WebElement ele=driver.findElement(By.xpath("(//span[contains(.,'Dashboard')])[7]"));
			return ele;
		  }
	  

			public WebElement area(WebDriver driver ) {
			  
				WebElement ele=driver.findElement(By.xpath("//select[contains(@name,'Area')]"));
				return ele;
			  }
			
				
				  public WebElement stack(WebDriver driver ) {
				  
				  WebElement ele=driver.findElement(By.xpath("//select[@name='Stack']"));
				  return ele; }
				 
			
			public WebElement Dispatch(WebDriver driver ) {
				  
				WebElement ele=driver.findElement(By.xpath("//button[contains(@class,'btn btn-md-fidelity btn-primary mr-4')]"));
				return ele;
			  }
			
			public WebElement Operator(WebDriver driver ) {
				  
				WebElement ele=driver.findElement(By.xpath("//button[contains(.,'Operator')]"));
				return ele;
			  }
			
			public WebElement radiobuttoncustomer(WebDriver driver ) {
				
				  
				WebElement ele=driver.findElement(By.xpath("//body[1]/app-layout[1]/div[4]/app-stack-winelands[1]/div[3]/div[1]/div[1]/div[1]/form[1]/p-table[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[7]/td[1]/p-tableradiobutton[1]/div[1]/div[2]"));
				//WebElement ele=driver.findElement(By.xpath("//span[@class='ui-radiobutton-icon ui-clickable pi pi-circle-on']"));
			//	WebElement ele=driver.findElement(By.xpath("//div[@class='ui-radiobutton-box ui-widget ui-state-default ui-state-active']"));
				
				return ele;
			  }
			
			
			public WebElement scrolltoview(WebDriver driver ) {
				  
				WebElement ele=driver.findElement(By.xpath("//span[contains(@class,'ui-radiobutton-icon ui-clickable pi pi-circle-on')]"));
				
				
				return ele;
			  }
			
			
}



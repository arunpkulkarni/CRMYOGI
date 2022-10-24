package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class Pomreadtest  {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		/*
		 * //set the ChromeDriver path // System.setProperty("webdriver.chrome.driver",
		 * "D:\\AUTOMATION\\driver\\chromedriver_win32_106V\\chromedriver.exe");
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\AUTOMATION\\driver\\chromedriver_win32_106version\\chromedriver.exe");
		 * // WebDriver driver = new ChromeDriver(); //Creating an object of
		 * ChromeDriver WebDriver driver = new ChromeDriver();
		 * driver.manage().window().maximize(); // To maxmize //Navigate to the URL
		 * driver.get("https://transformer-service-staging.azurewebsites.net/login");
		 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// To set
		 * implicit time driver.manage().window().maximize(); // To maxmize
		 * 
		 * //---------------------------------------------------------------------------
		 * --------------------- WebElement
		 * un=driver.findElement(By.xpath("//input[@formcontrolname='username']"));
		 * un.sendKeys("admin@kuyatechnologies.com");
		 * 
		 * WebElement
		 * pwd=driver.findElement(By.xpath("//input[@placeholder='Enter Password']"));
		 * pwd.sendKeys("admin@kuya123");
		 * 
		 * WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
		 * submit.click();
		 * 
		 * //Mazimize current window driver.manage().window().maximize();
		 * 
		 * //Mazimize current window driver.manage().window().maximize();
		 * 
		 * //Delay execution for 5 seconds to view the maximize operation
		 * Thread.sleep(5000);
		 * 
		 * //ho.Salesbutton (driver).click(); Thread.sleep(3); // scroll down by 500
		 * pixels with Javascript Executor JavascriptExecutor j = (JavascriptExecutor)
		 * driver; j.executeScript("window.scrollBy(0,250)"); Thread.sleep(5000);
		 * 
		 * WebElement
		 * saleslk=driver.findElement(By.xpath("(//span[contains(.,'Sales')])[7]"));
		 * saleslk.click(); Thread.sleep(5000); System.out.println("click on sales ");
		 * // scroll down by 500 pixels with Javascript Executor JavascriptExecutor j1 =
		 * (JavascriptExecutor) driver; j1.executeScript("window.scrollBy(0,500)");
		 * 
		 * WebElement
		 * rawlk=driver.findElement(By.xpath("//span[contains(.,'Raw Lead')]"));
		 * rawlk.click(); Thread.sleep(5000); System.out.println("click on raw lead");
		 * 
		 * WebElement createnwicon=driver.findElement(By.xpath("//i[@class='icon']"));
		 * // WebElement
		 * createnwicon=driver.findElement(By.xpath("//i[@mattooltip='Create New']"));
		 * createnwicon.click(); Thread.sleep(5000);
		 * System.out.println("click on Create new icon ");
		 * 
		 * WebElement
		 * namefield=driver.findElement(By.xpath("//input[contains(@name,'FirstName')]")
		 * ); WebElement surnamefield=driver.findElement(By.
		 * xpath("//input[@placeholder='Enter Last Name']")); WebElement
		 * PhoneNumber=driver.findElement(By.xpath("//input[@name='Phone Number 1']"));
		 * WebElement MobileNumber
		 * =driver.findElement(By.xpath("//input[contains(@name,'Mobile Number 2')]"));
		 * WebElement PremisesNumber=driver.findElement(By.
		 * xpath("//input[contains(@name,'Premises Number')]")); WebElement
		 * OfficeNumber=driver.findElement(By.
		 * xpath("//input[@placeholder='Office Number']")); WebElement
		 * EmailAddress=driver.findElement(By.
		 * xpath("//input[contains(@placeholder,'Enter Email')]")); WebElement
		 * SiteType=driver.findElement(By.xpath("//select[@name='SiteType']"));
		 * WebElement LeadCategory=driver.findElement(By.
		 * xpath("//mat-select[contains(.,'Select Lead Category')]")); WebElement
		 * SourceType=driver.findElement(By.
		 * xpath("//select[contains(@name,'Source Type')]")); WebElement FindAddress
		 * =driver.findElement(By.xpath("//input[@name='Find Address']")); WebElement
		 * searchbtn=driver.findElement(By.xpath(
		 * "//button[@class='autocomplete-btn-search-symbol']")); WebElement
		 * UnitBuilding =driver.findElement(By.xpath("//input[@name='BuildingNo']"));
		 * WebElement
		 * Createbtn1=driver.findElement(By.xpath("//button[@type='submit']")); //
		 * WebElement
		 * Backbtn1=driver.findElement(By.xpath("//button[contains(.,'Back')]")); //
		 * WebElement
		 * rawlk2=driver.findElement(By.xpath("//span[contains(.,'Raw Lead')]"));; //
		 * WebElement createnwicon1=driver.findElement(By.xpath("//i[@class='icon']"));
		 * 
		 */
		
	//-----------------------------------------------------------------------------------------------------------------------------	        
		 //Create an object of File class to open xlsx file
        File file =    new File("D:\\Testdatanew2.xlsx");

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
        
 //////--------------------------------------------------------LOOP---------------------------------------------------------------------//
        
        for(int i=1;i<=rowCount;i++){
        	System.out.println("Row count print"+ rowCount);
//===============================================================================================================
					/*
					 * // Thread.sleep(5000); //Enter the values read from Excel in
					 * firstname,lastname,mobile,email,address // Create the object of the Select
					 * class // Select se = new
					 * Select(driver.findElement(By.xpath("//select[contains(@name,'Title')]")));
					 * 
					 * // Select the option using the visible text //se.selectByVisibleText("Mr");
					 * //se.selectByIndex(4); //======== Thread.sleep(2000);
					 * namefield.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
					 * Thread.sleep(2000);
					 * surnamefield.sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
					 * Thread.sleep(2000);
					 * PhoneNumber.sendKeys(sheet.getRow(i).getCell(2).getStringCellValue());
					 * Thread.sleep(2000);
					 * MobileNumber.sendKeys(sheet.getRow(i).getCell(3).getStringCellValue());
					 * Thread.sleep(2000); PremisesNumber.sendKeys(sheet.getRow(i).getCell(4
					 * ).getStringCellValue());
					 * OfficeNumber.sendKeys(sheet.getRow(i).getCell(5).getStringCellValue());
					 * Thread.sleep(5000);
					 * EmailAddress.sendKeys(sheet.getRow(i).getCell(6).getStringCellValue());
					 * Thread.sleep(5000);
					 * SiteType.sendKeys(sheet.getRow(i).getCell(7).getStringCellValue());
					 * Thread.sleep(5000);
					 * //LeadCategory.sendKeys(sheet.getRow(i).getCell(8).getStringCellValue());
					 * SourceType.sendKeys(sheet.getRow(i).getCell(9).getStringCellValue());
					 * Thread.sleep(5000);
					 * FindAddress.sendKeys(sheet.getRow(i).getCell(10).getStringCellValue());
					 * Thread.sleep(5000); searchbtn.click(); Thread.sleep(2000);
					 * UnitBuilding.sendKeys(sheet.getRow(i).getCell(11).getStringCellValue());
					 * Thread.sleep(2000); Createbtn1.click(); Thread.sleep(10000);
					 * 
					 * //-------------------------------------------------
					 * 
					 * WebElement
					 * saleslink2=driver.findElement(By.xpath("(//span[contains(.,'Sales')])[7]"));
					 * saleslink2.click(); Thread.sleep(5000);
					 * System.out.println("click on sales "); // scroll down by 500 pixels with
					 * Javascript Executor JavascriptExecutor j3 = (JavascriptExecutor) driver;
					 * j1.executeScript("window.scrollBy(0,500)");
					 * 
					 * 
					 * WebElement
					 * saleslink3=driver.findElement(By.xpath("(//span[contains(.,'Sales')])[7]"));
					 * saleslink3.click(); Thread.sleep(5000);
					 * System.out.println("click on sales "); // scroll down by 500 pixels with
					 * Javascript Executor JavascriptExecutor j4 = (JavascriptExecutor) driver;
					 * j1.executeScript("window.scrollBy(0,500)");
					 * 
					 * WebElement
					 * rawlink2=driver.findElement(By.xpath("//span[contains(.,'Raw Lead')]"));
					 * rawlink2.click(); Thread.sleep(5000);
					 * System.out.println("click on raw lead");
					 * 
					 * WebElement createnwicon2=driver.findElement(By.xpath("//i[@class='icon']"));
					 * createnwicon2.click(); Thread.sleep(5000);
					 * System.out.println("click on Create new icon "); Thread.sleep(5000);
					 * 
					 * 
					 * 
					 * ///-----------------------------------------------------------
					 * //Thread.sleep(2000); // Backbtn1.click(); // Thread.sleep(2000); //
					 * rawlk2.click(); //Thread.sleep(5000);
					 * //System.out.println("click on 2nd raw lead");
					 * 
					 * // createnwicon1.click(); // Thread.sleep(5000);
					 * //System.out.println("click on back >> Create new icon ");
					 * 
					 * //---------------------------------------------------------------------------
					 * ---------------------------- //get cell count in a row int
					 * cellcount=sheet.getRow(i).getLastCellNum();
					 * 
					 * //iterate over each cell to print its value System.out.println("Row"+
					 * i+" data is :");
					 * 
					 * 
					 * 
					 * ////-------------------------------------------------------------------------
					 * - for(int j11=0;j11<cellcount;j11++){
					 * 
					 * // //---------------- // // Thread.sleep(2000); // Backbtn.click(); // //
					 * rawlk2.click(); // Thread.sleep(5000); //
					 * System.out.println("click on 2nd raw lead"); // // createnwicon1.click(); //
					 * Thread.sleep(5000); //
					 * System.out.println("click on back >> Create new icon "); // //-----------
					 * 
					 * System.out.print(sheet.getRow(i).getCell(j11) +","); } System.out.println();
					 */
        	System.out.println("|");
		        }
		  //  System.out.println();
		}
}




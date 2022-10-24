package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPageObjects {
	
	
	public WebElement ExternalUserbtn(WebDriver driver) {

		WebElement ele = driver.findElement(By.xpath("//button[contains(.,'External User')]"));
		return ele;
	}

	public WebElement Usernamefield(WebDriver driver) {

		WebElement ele = driver.findElement(By.xpath("//input[contains(@formcontrolname,'username')]"));
		return ele;
	}

	public WebElement passwordfield(WebDriver driver) {

		WebElement ele = driver.findElement(By.xpath("//input[@placeholder='Enter Password']"));
		return ele;
	}

	public WebElement SignInbutton(WebDriver driver) {

		WebElement ele = driver.findElement(By.xpath("//button[@type='submit']"));
		return ele;
	}

	/*
	 * public WebElement Saleslink(WebDriver driver ) {
	 * 
	 * WebElement
	 * ele=driver.findElement(By.xpath("(//span[contains(.,'Sales')])[7]")); return
	 * ele; }
	 * 
	 * public WebElement rawleadbutton(WebDriver driver ) {
	 * 
	 * WebElement
	 * ele=driver.findElement(By.xpath("//span[contains(.,'Raw Lead')]")); return
	 * ele; }
	 * 
	 * public WebElement CreateNew(WebDriver driver ) {
	 * 
	 * WebElement ele=driver.findElement(By.xpath("//i[@class='icon']")); return
	 * ele; }
	 * 
	 * //------------------------ Raw Lead fields --------------------------//
	 * public WebElement Namefield(WebDriver driver ) {
	 * 
	 * WebElement
	 * ele=driver.findElement(By.xpath("//input[contains(@name,'FirstName')]"));
	 * return ele; }
	 * 
	 * public WebElement Surnamefield(WebDriver driver ) {
	 * 
	 * WebElement
	 * ele=driver.findElement(By.xpath("//input[@placeholder='Enter Last Name']"));
	 * return ele; }
	 * 
	 * public WebElement PhoneNumberfield(WebDriver driver ) {
	 * 
	 * WebElement
	 * ele=driver.findElement(By.xpath("//input[@name='Phone Number 1']")); return
	 * ele; }
	 * 
	 * public WebElement MobileNumberfield(WebDriver driver ) {
	 * 
	 * WebElement
	 * ele=driver.findElement(By.xpath("//input[contains(@name,'Mobile Number 2')]")
	 * ); return ele; } public WebElement PremisesNumberfield(WebDriver driver ) {
	 * 
	 * WebElement
	 * ele=driver.findElement(By.xpath("//input[contains(@name,'Premises Number')]")
	 * ); return ele; }
	 * 
	 * public WebElement OfficeNumberfield(WebDriver driver ) {
	 * 
	 * WebElement
	 * ele=driver.findElement(By.xpath("//input[@placeholder='Office Number']"));
	 * return ele; }
	 * 
	 * 
	 * public WebElement EmailAddressfield(WebDriver driver ) {
	 * 
	 * WebElement ele=driver.findElement(By.
	 * xpath("//input[contains(@placeholder,'Enter Email')]")); return ele; }
	 * 
	 * public WebElement SiteTypefield(WebDriver driver ) {
	 * 
	 * WebElement ele=driver.findElement(By.xpath("//select[@name='SiteType']"));
	 * return ele; }
	 * 
	 * public WebElement LeadCategoryfield(WebDriver driver ) {
	 * 
	 * WebElement ele=driver.findElement(By.xpath("//select[@name='SiteType']"));
	 * return ele; }
	 * 
	 * public Select SiteTypefield11(WebDriver driver ) { Select dropdown = new
	 * Select(driver.findElement(By.xpath("//select[@name='SiteType']"))); // return
	 * Select; return dropdown; }
	 * 
	 * public Select SourceTypefield(WebDriver driver ) { Select dropdown = new
	 * Select(driver.findElement(By.xpath("//select[contains(@name,'Source Type')]")
	 * )); return dropdown;
	 * 
	 * }
	 * 
	 * public WebElement FindAddressfield(WebDriver driver ) {
	 * 
	 * WebElement ele=driver.findElement(By.xpath("//input[@name='Find Address']"));
	 * return ele; }
	 * 
	 * public WebElement Searchbutton(WebDriver driver ) {
	 * 
	 * WebElement
	 * ele=driver.findElement(By.xpath("//i[contains(@class,'icon icon-search')]"));
	 * return ele; }
	 * 
	 * 
	 * // public WebElement Taboptions(WebDriver driver ) { // // WebElement
	 * ele=driver.findElement(By.xpath("//i[contains(@class,'icon icon-search')]"));
	 * // return ele; // }
	 * 
	 * 
	 * public WebElement UnitBuildingNumberfield(WebDriver driver ) {
	 * 
	 * WebElement ele=driver.findElement(By.xpath("//input[@name='BuildingNo']"));
	 * return ele; }
	 * 
	 * public WebElement CreateButtoninRawleadinfo(WebDriver driver ) {
	 * 
	 * WebElement ele=driver.findElement(By.xpath("//button[@@type='submit']"));
	 * return ele; }
	 */
}

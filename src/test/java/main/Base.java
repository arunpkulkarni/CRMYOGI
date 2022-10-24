package main;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Excel.data;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepo.HomePageObjects;

public class Base {
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	//protected WebDriver driver = null;
	public static WebDriver driver;
	data da = new data();
	HomePageObjects po = new HomePageObjects();
	
	geturl gu= new geturl();
	@BeforeSuite(alwaysRun = true)
	public void setUp() throws Exception {
		htmlReporter = new ExtentHtmlReporter(
				System.getProperty("user.dir") + "/test-output/fidelity-Automation-test-report.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		String url = gu.getURL();
		extent.setSystemInfo("OS", "Windows-10");
		extent.setSystemInfo("Host Name", "arun");
		extent.setSystemInfo("Environment", url);
		extent.setSystemInfo("User Name", "arun");

		htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setDocumentTitle("Automation Test fidelity ");
		htmlReporter.config().setReportName("Regression Test");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.DARK);

	}
	
	

	@BeforeClass(alwaysRun = true)
	public void OpenBrowser() throws EncryptedDocumentException, IOException, InterruptedException {
		String browser = da.ReadInteger(1, 3);

		if (browser.equalsIgnoreCase("Mozilla")) {

			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");

			// Open Mozilla firefox browser
			driver = new FirefoxDriver();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}

		else if (browser.equalsIgnoreCase("Chrome")) {

			//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver-96.exe");
			 ChromeOptions chromeOptions = new ChromeOptions();
			 WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(chromeOptions);

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}

		else if (browser.equalsIgnoreCase("Chrome-Linux")) {

			try{ 
				
				//uncomment below line when running test on Linux
			
				//System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
				
				//uncomment below line when running test on windows in Headlessmode
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver-96.exe");
				ChromeOptions chromeOptions = new ChromeOptions();
	            chromeOptions.addArguments("--headless");
	           // chromeOptions.addArguments("--start-maximized");
	            chromeOptions.addArguments("--disable-gpu");
	            chromeOptions.addArguments("--window-size=1280,800");
	            chromeOptions.addArguments("--allow-insecure-localhost");
	            
	            driver = new ChromeDriver(chromeOptions);
			}
	        catch(Exception ex){
	        System.out.println(ex.getMessage());
	        }

					                        		  
			
		}

		else if (browser.equalsIgnoreCase("Mozilla-Linux")) {

			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		else{
			 System.out.println("Browser Not Found");
			
		}

	}

	@BeforeMethod(alwaysRun = true)
	public void OpenUrl() throws EncryptedDocumentException, IOException {
		try{ 
			
			//String url = gu.getURL();
		// Navigate to End user portal
		driver.navigate().to("https://transformer-service-staging.azurewebsites.net/login/");
		
		}
		
		catch(Exception e){
			
			System.out.println(e.getMessage());
		}

	}

	@AfterMethod(alwaysRun = true)
	public void getResult(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " Test case FAILED due to below issues:",
					ExtentColor.RED));
			test.fail(result.getThrowable());

			// Takescreenshot
			// Timestamp timestamp = new Timestamp(System.currentTimeMillis());

			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
			// Copy the file to a location and use try catch block to handle
			
			System.out.println(result.getName());
			// exception
			try {
				FileUtils.copyFile(screenshot, new File("./Screenshot/"  + result.getName() + timestamp + ".png"));
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}

		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " Test Case PASSED", ExtentColor.GREEN));
		} else {
			test.log(Status.SKIP,
					MarkupHelper.createLabel(result.getName() + " Test Case SKIPPED", ExtentColor.ORANGE));
			test.skip(result.getThrowable());
		}
	}
//
//	@AfterClass(alwaysRun = true)
//	public void CloseBrowser() {
//
//		driver.close();
//	}

	@AfterSuite(alwaysRun = true)
	public void tearDown() {

		extent.flush();
		// m.MailAfterExecution();

	}
	
}

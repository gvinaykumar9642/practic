package com.crm.vtiger.GenericUtils;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.createcontactTest.Homepage;
import com.createcontactTest.Loginpage;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This class contain basic configuration annotation of testng
 * @author vinay
 *
 */
public class BaseClass {
 public  DataBaseUtility dlib=new DataBaseUtility();
 public FileUtility flib=new FileUtility();
 public WebDriverUtility wlib=new WebDriverUtility();
 public ExcelUtility elib=new ExcelUtility();
 public JavaUtility jlib=new JavaUtility();
 
public WebDriver driver;
public static WebDriver StaticDriver;
public EventFiringWebDriver eventDriver;	
 
	@BeforeSuite(groups={"smoketest","regression"})
	public void connectDB()
	{
		//dlib.connectToDB();
		System.out.println("db connection successfully");
	}
	
	
	  @Parameters(value= {"browser"})  // chrome, firefox
	  
	@BeforeClass(groups={"smoketest","regression"})
	public void launchBrowser(@Optional("chrome") String browser) throws IOException
	{
		//read data from property file
		//String browser = flib.getpropertykeyvalue("browser");
		String URL = flib.getpropertykeyvalue("url");
		
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("==========>invalid browser name<==============="+browser);
			
		}
	
		System.out.println("============>Browser launcch is succesaful<================");
		
		WebDriverListener regDriver=new WebDriverListener();
		 eventDriver=new EventFiringWebDriver(driver);
		eventDriver.register(regDriver);
		StaticDriver=driver;//asigning driver reference
	//	wlib.maximizeWindow(driver);
		wlib.waitUtilpageLoad(driver);
		driver.get(URL);

	}
	
	
	@BeforeMethod(groups={"smoketest","regression"})
	public void loginToApp() throws IOException
	{
		String USENAME = flib.getpropertykeyvalue("username");
		String PASSWORD = flib.getpropertykeyvalue("password");
		
		
		//LOGINPAGE to app
		Loginpage lp=new Loginpage(driver);
		lp.LoginToApp(USENAME, PASSWORD);
	  System.out.println("=============>login success<============");
	}
	
	@AfterMethod(groups={"smoketest","regression"})
	public void logoutofapp()
	{
		// sign out of home page
		Homepage hp=new Homepage(driver);
				hp.Logout();
		System.out.println("==========>signout success<=============");
	}
	
	
	@AfterClass(groups={"smoketest","regression"})
	public void closebrowser()
	{
		driver.close();
	}
	
	@AfterSuite(groups={"smoketest","regression"})
	public void closeDB() throws Throwable
	{
		//dlib.closeDB();
		System.out.println("===========>Db connection closed successfully<===========");
	}
	
}	

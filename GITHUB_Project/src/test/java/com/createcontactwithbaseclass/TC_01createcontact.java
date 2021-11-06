package com.createcontactwithbaseclass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.createcontactTest.Homepage;
import com.createcontactTest.Loginpage;
import com.createcontactTest.contactspage;
import com.crm.vtiger.GenericUtils.BaseClass;
import com.crm.vtiger.GenericUtils.ExcelUtility;
import com.crm.vtiger.GenericUtils.FileUtility;
import com.crm.vtiger.GenericUtils.JavaUtility;
import com.crm.vtiger.GenericUtils.WebDriverUtility;


  @Listeners(com.crm.vtiger.GenericUtils.ListenersClass.class)
public class TC_01createcontact extends BaseClass{

	
	@Test(groups={"smoketest"})
	public  void createContact() throws IOException, EncryptedDocumentException, InvalidFormatException 
	{
		
	/* Read test data */
		String OrgName=elib.getExcelData("Sheet1",1,1) + " "+jlib.getRandomData();
		
	
		
	   /* click on contact link */
        Homepage hp=new Homepage(driver);
        hp.getContactLink().click();
        
        
        /* clicking lastviewed contacts */
        contactspage hp1=new contactspage(driver);
        hp1.getLastviewed().click();
       // Assert.assertEquals("A","a");       
       
	}
}

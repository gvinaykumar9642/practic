package com.createcontactwithbaseclass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import com.createcontactTest.Homepage;
import com.createcontactTest.Loginpage;
import com.createcontactTest.contactspage;
import com.crm.vtiger.GenericUtils.BaseClass;
import com.crm.vtiger.GenericUtils.ExcelUtility;
import com.crm.vtiger.GenericUtils.FileUtility;
import com.crm.vtiger.GenericUtils.JavaUtility;
import com.crm.vtiger.GenericUtils.WebDriverUtility;

public class TC_02createcontactswithbaseclass  extends BaseClass{

	
	@Test(groups={"smoketest"})
	public  void createContact() throws IOException, EncryptedDocumentException, InvalidFormatException 
	{
		
	   /* click on contact link */
        Homepage hp=new Homepage(driver);
        hp.getContactLink().click();
        
        Homepage hp1=new Homepage(driver);
        hp1.getContactLink().click();
        
        /* mouseover to anministerimg for signout link */
        contactspage hp2=new contactspage(driver);
        hp2.getDuplicatecontacts().click();
        
        contactspage DV=new contactspage(driver);
        DV.getFirstname().click();
		
	
	}
}

package com.createcontactwithbaseclass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.createcontactTest.Homepage;
import com.createcontactTest.contactspage;
import com.crm.vtiger.GenericUtils.BaseClass;

public class TC_04createcontactsbaseclass extends BaseClass{

	@Test(groups={"smoketest"})
	public  void createContact() throws IOException, EncryptedDocumentException, InvalidFormatException, InterruptedException 
	{
	
	
   /* click on contact link */
    Homepage hp=new Homepage(driver);
    hp.getContactLink().click();
    
    contactspage cp=new contactspage(driver);
    cp.getSelectid().click();
    cp.getSendmailbtn().click();

    
    Thread.sleep(2000);
    /* mouseover to anministerimg for signout link */
    Homepage hp3=new Homepage(driver);
    hp3.getAdministerimg().click();
    
 
	
}
}

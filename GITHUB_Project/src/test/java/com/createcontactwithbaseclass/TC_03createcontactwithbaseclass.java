package com.createcontactwithbaseclass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.createcontactTest.ComposeMailPage;
import com.createcontactTest.Homepage;
import com.createcontactTest.contactspage;
import com.crm.vtiger.GenericUtils.BaseClass;


public class TC_03createcontactwithbaseclass extends BaseClass {

	
	@Test(groups={"smoketest"})
	public  void createContact() throws IOException, EncryptedDocumentException, InvalidFormatException, InterruptedException 
	{

		
	   /* click on contact link */
        Homepage hp=new Homepage(driver);
        hp.getContactLink().click();
        
        Homepage hp1=new Homepage(driver);
        hp1.getContactLink().click();
        
      contactspage cp=new contactspage(driver);
      cp.getSelectid().click();
      cp.getSendmailbtn().click();
      cp.getSelectBtn().click();
   
      ComposeMailPage cem=new ComposeMailPage(driver);
      cem.composeEmail();
}
}


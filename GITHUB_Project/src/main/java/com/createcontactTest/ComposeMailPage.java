package com.createcontactTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.GenericUtils.WebDriverUtility;

public class ComposeMailPage extends WebDriverUtility {
	
	WebDriver driver; // global driver variable
	public ComposeMailPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="subject")
	private WebElement subjectname;
	
	@FindBy(name = "Send")
	private WebElement sendBtn;
	
	
	public WebElement getSendBtn() {
		return sendBtn;
	}
	
	public WebElement getSubjectname() {
		return subjectname;
	}
	
	
	public void composeEmail() throws InterruptedException {
		// implicit wait
		waitUtilpageLoad(driver);
		// switch to new window
		switchToWindow(driver, "Emails&action");
		subjectname.sendKeys("asd");
		sendBtn.click();
		Thread.sleep(2000);
		// By clicking on ok button in Alertpopup
		acceptAlert(driver);
		// close the window browser
		driver.close();
		Thread.sleep(2000);
		//switch back to parent window
		switchToWindow(driver, "Contacts&action");
	}

}

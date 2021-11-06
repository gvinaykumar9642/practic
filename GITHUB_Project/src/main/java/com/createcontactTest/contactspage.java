package com.createcontactTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.GenericUtils.WebDriverUtility;

public class contactspage extends WebDriverUtility {

	
	WebDriver driver; // global driver variable
	public contactspage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt='Last Viewed']")
	private WebElement lastviewed;
	
	@FindBy(xpath="//img[@src='themes/images/findduplicates.gif']")
	private WebElement duplicatecontacts;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement firstname;
	
	@FindBy(name="selected_id")
	private WebElement selectid;
	
	@FindBy(id="20")
    private WebElement selectsecondid;
	//send mail button 
	@FindBy(xpath="//input[@value='Send Mail']")
	private WebElement sendmailbtn;
	
	@FindBy(name = "semail")
	private WebElement selectTB;
	
	@FindBy(name="Select")
	private WebElement selectBtn;
	

	
	
	



	
	
	
	public WebElement getSelectsecondid() {
		return selectsecondid;
	}

	

	@FindBy(partialLinkText= "Select Email IDs")
	private WebElement sendEmailWindowPopup;
	
	
	
	
	public WebElement getSelectBtn() {
		return selectBtn;
	}

	public WebElement getSelectTB() {
		return selectTB;
	}

	public WebElement getSendmailbtn() {
		return sendmailbtn;
	}

	public WebElement getSelectid() {
		return selectid;
	}

	public WebElement getLastviewed() {
		return lastviewed;
	}

	public WebElement getDuplicatecontacts() {
		return duplicatecontacts;
	}

	public WebElement getFirstname() {
		return firstname;
	}
	
	
	
	
	
	
}

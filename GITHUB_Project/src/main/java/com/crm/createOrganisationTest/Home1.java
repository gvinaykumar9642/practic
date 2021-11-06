package com.crm.createOrganisationTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home1 {

	WebDriver driver; // global driver variable
	public Home1 (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[text()='Organizations'])[1]")
	private WebElement orgLink;
	
	@FindBy(xpath="(//a[text()='Organizations'])[1]")
	private WebElement duplicatevalues;
	
	@FindBy(xpath=("(//img[@style='padding: 0px;padding-left:5px'])[1]"))
	private WebElement Administerimg;

	@FindBy(linkText="Sign Out")
	private WebElement signout;

	public WebElement getOrgLink() {
		return orgLink;
	}

	public WebElement getAdministerimg() {
		return Administerimg;
	}

	public WebElement getSignout() {
		return signout;
	}

	public void Logout()
	{
		Actions a=new Actions(driver);
		a.moveToElement(Administerimg).perform();
		signout.click();
	}
	
	
}

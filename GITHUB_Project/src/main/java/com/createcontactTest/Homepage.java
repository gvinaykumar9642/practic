package com.createcontactTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	
	WebDriver driver; // global driver variable
	public Homepage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contactLink;

	@FindBy(xpath=("(//img[@style='padding: 0px;padding-left:5px'])[1]"))
	private WebElement Administerimg;

	@FindBy(linkText="Sign Out")
	private WebElement Signout;

	public WebElement getContactLink() {
		return contactLink;
	}
	
	public WebElement getAdministerimg() {
		return Administerimg;
	}

	public WebElement getSignout() {
		return Signout;
	}
	
	public void Logout()
	{
		Actions a=new Actions(driver);
		a.moveToElement(Administerimg).perform();
		Signout.click();
	}
}

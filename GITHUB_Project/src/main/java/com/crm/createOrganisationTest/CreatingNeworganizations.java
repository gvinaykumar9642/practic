package com.crm.createOrganisationTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNeworganizations {

	
	WebDriver driver; // global driver variable
	public CreatingNeworganizations(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="accountname")
	private WebElement Createorg;
	
	@FindBy(xpath="(//input[@type='button'])[1]")
	private WebElement SaveBtn;
	
	public WebElement getCreateorg() {
		return Createorg;
	}
	
	public WebElement getSaveBtn() {
		return SaveBtn;
	}
	
	
}

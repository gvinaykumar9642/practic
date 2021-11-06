package com.crm.createOrganisationTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organizations {

	
	WebDriver driver; // global driver variable
	public Organizations (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement createOrgBtn;
	
	public WebElement getCreateOrgBtn() {
		return createOrgBtn;
	}
}

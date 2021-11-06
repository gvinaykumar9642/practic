package com.createcontactTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	  WebDriver driver;
		
		public Loginpage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(name="user_name")
		private WebElement usernameedit;
		
		@FindBy(name="user_password")
		private WebElement passwordedit;
		
		@FindAll({@FindBy(id="submitButton"),@FindBy(xpath="//input[@type='submit']")})
		private WebElement loginBtn;

		public WebElement getUsernameedit() {
			return usernameedit;
		}

		public WebElement getPasswordedit() {
			return passwordedit;
		}

		public WebElement getLoginBtn() {
			return loginBtn;
		}
		
		public void LoginToApp(String username,String password)
		{
		usernameedit.sendKeys(username);
		passwordedit.sendKeys(password);
		 loginBtn.click();
		
		}
	}

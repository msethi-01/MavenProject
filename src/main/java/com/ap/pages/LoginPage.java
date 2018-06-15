package com.ap.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ap.base.Base;

public class LoginPage extends Base {
	
	@FindBy(css=".login")
	public WebElement signbtn;
	
	@FindBy(css="#email")
	public WebElement emailtxt;
	
	@FindBy(css="#passwd")
	public WebElement paswdtxt;
	
	@FindBy(css="#SubmitLogin")
	public WebElement loginbtn;
	
	public LoginPage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}
	

	public HomePage Verifylogin() throws IOException {
		if (signbtn.isDisplayed()) {
			signbtn.click();
			emailtxt.clear();
			emailtxt.sendKeys(pro.getProperty("UserName"));
			paswdtxt.clear();
			paswdtxt.sendKeys(pro.getProperty("Password"));
			loginbtn.click();
			
		}
		return new HomePage();
		
	}
	

}

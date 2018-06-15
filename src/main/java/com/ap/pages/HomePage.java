package com.ap.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ap.base.Base;

public class HomePage extends Base {
	
	@FindBy(css=".sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows>li>a[title='T-shirts']")
	public WebElement Tshirt;
	
	
	public HomePage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}
	
	public TshirtPage ClickOnTshirt() throws IOException {
		Tshirt.click();
		return new TshirtPage();
	}

}

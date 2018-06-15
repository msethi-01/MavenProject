package com.ap.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ap.base.Base;

public class TshirtPage extends Base {

	@FindBy(css="a[class='product-name'][title='Faded Short Sleeve T-shirts']")
	public WebElement product;
	
	public TshirtPage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}
	
	public ProductPage ClickOnPoduct() throws IOException {
		
		product.click();
		return new ProductPage();
	}
	

}

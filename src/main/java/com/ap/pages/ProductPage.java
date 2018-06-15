package com.ap.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ap.base.Base;

public class ProductPage extends Base {
	@FindBy(css="#our_price_display")
	public WebElement prdprice;
	
	@FindBy(css="#add_to_cart>button.exclusive")
	public WebElement addtocard;
	
	@FindBy(css=".layer_cart_product.col-xs-12.col-md-6>h2")
	public WebElement message;
	
	@FindBy(css="#layer_cart_product_attributes")
	public WebElement size;
	
	@FindBy(xpath="//*[@class='layer_cart_product_info']//*[contains(text(),'Quantity')]")
	public WebElement quantitytxt;
	
	@FindBy(css="#layer_cart_product_quantity")
	public WebElement quantity;
	
	@FindBy(xpath="//*[@class='layer_cart_product_info']//*[contains(text(),'Total')]")
	public WebElement totaltxt;
	
	@FindBy(css="#layer_cart_product_price")
	public WebElement toatlprice;
	
	@FindBy(css="#layer_cart_product_title")
	public WebElement prdtitle;
	

	public ProductPage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}
	
	public float GetPerPricePrd() {
	return	Float.parseFloat(prdprice.getText().split("\\$")[1]);
		
	} 
	
	public void AddtoCard() {
		
		addtocard.click();
	}
}

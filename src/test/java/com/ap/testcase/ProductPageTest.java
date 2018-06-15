package com.ap.testcase;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ap.base.Base;
import com.ap.pages.HomePage;
import com.ap.pages.LoginPage;
import com.ap.pages.ProductPage;
import com.ap.pages.TshirtPage;

import junit.framework.Assert;

public class ProductPageTest extends Base{
	
	 public ProductPageTest() throws FileNotFoundException, IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	LoginPage login;
	 HomePage home;
	 TshirtPage tshirt;
	 ProductPage product;
	 
	 @BeforeTest
	 public void setup() throws IOException
	 {
		 Initialization("Chrome");
		 login = new LoginPage();
		 home = new HomePage();
		 home = login.Verifylogin();
		 tshirt = new TshirtPage();
		 product =new ProductPage();
		 tshirt = home.ClickOnTshirt();
		 product= tshirt.ClickOnPoduct();	 
	 }
	 
	 @Test
	 public void Test1() throws InterruptedException {
		  product.AddtoCard();
		  String expectedmessage= "Product successfully added to your shopping cart";
		  
		  Thread.sleep(30000);
		  Assert.assertEquals(expectedmessage,product.message.getText().toString());
		  System.out.println("Assert1");
		  
		  Assert.assertEquals("Faded Short Sleeve T-shirts", product.prdtitle.getText().toString());
		  System.out.println("Assert2");
		  
		  Assert.assertEquals("Orange, S",product.size.getText().toString());
		  System.out.println("Assert3");
		  
		  Assert.assertTrue("not working quantity", product.quantitytxt.isDisplayed());
		  System.out.println("Assert4");
		  
		  Assert.assertTrue(Integer.parseInt(product.quantity.getText())>0);
		  System.out.println("Assert5");
		  
		  Assert.assertTrue("Toatal text is not displayed", product.quantitytxt.isDisplayed());
		  System.out.println("Assert6");
		  
		  Assert.assertEquals(product.GetPerPricePrd()*Integer.parseInt(product.quantity.getText()), Float.parseFloat(product.toatlprice.getText().split("\\$")[1]));
		  System.out.println("Assert7");
		  
		  
		 
	 }
	 
	 @AfterTest
	 public void teardown()
	 {
		 driver.quit();
	 }
	
}

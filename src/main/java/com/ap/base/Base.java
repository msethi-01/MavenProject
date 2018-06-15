package com.ap.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public static WebDriver driver;
	public static Properties pro;
	
	public Base() throws FileNotFoundException, IOException {
		
		pro = new Properties();
		pro.load(new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/ap/config/config.properties"));
	}
	
	public void Initialization(String browserName) {
		 if(browserName.equalsIgnoreCase("Chrome")) {
			 System.setProperty("webdriver.chrome.driver", pro.getProperty("Chrome"));
			 driver=new ChromeDriver();
			 
		 }else if(browserName.equalsIgnoreCase("FireFox")) {
			 System.setProperty("webdriver.gecoke.driver", pro.getProperty("FireFox"));
			 driver=new FirefoxDriver(); 
			 
		 }
		 
		 driver.manage().window().maximize();
		
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 driver.get(pro.getProperty("Url"));
		 
		
	}

}

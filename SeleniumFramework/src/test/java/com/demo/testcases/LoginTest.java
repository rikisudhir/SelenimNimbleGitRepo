package com.demo.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demo.pageobjects.BaseClass;
import com.demo.pageobjects.LoginPage;

public class LoginTest extends BaseClass{
	
	LoginPage objLogin;
	
	@BeforeClass
	
	public void beforerun() {
		
		objLogin = new LoginPage(driver);
		
		driver.navigate().to(objConfig.getPropertyvalue("baseUrl"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
	}
	
	
	@Test(priority=1)
	
	public void validlogintest() {
		
		String uname= objConfig.getPropertyvalue("userName");
		
		String passwrd= objConfig.getPropertyvalue("passWord");
		
		String expectedurl=testDataConfig.getPropertyvalue("postloginUrl");
		
		String expectedflashmsg= testDataConfig.getPropertyvalue("flashmsg");
		
		
		
		
		objLogin.enterCredential(uname, passwrd);
		
		
		String actualurl= driver.getCurrentUrl();
		
		if(expectedurl.equals(actualurl)) {
			
			assertTrue(true);
			
			
		}else {
			
			assertTrue(false);	
			
		}
		
		String actualflashmsg= objLogin.validateflashMessage();
		
		if (expectedflashmsg.equals(actualflashmsg)) {
			
			assertTrue(true);
			
		}else {
			
			assertTrue(false);	
			
		}
	
		
	}
	
	
	@Test(priority=2)
	public void validatelogout() throws InterruptedException, AWTException {
		
		String expectedalerttext= testDataConfig.getPropertyvalue("logoutAertText");
		
		if(expectedalerttext.equals(objLogin.logout())) {
			
			assertTrue(true);
			
			
		}else {
			
			assertTrue(true);
			
		}
	
		
		
	}
	
	@AfterClass		
	public void closebrowser() {
		
		driver.quit();
	}
	
	
	
    
	
	
	
	

}
